package me.chenyuan.thinkinjava.initialization;

import cn.hutool.core.lang.Console;

/**
 * @Author JackChen
 * @description
 * @Date 2021/7/25
 * @Version 1.0
 */
class Bowl {
    public Bowl(int marker) {
        Console.log("Bowl({})", marker);
    }

    void f1(int marker) {
        Console.log("f1({})", marker);
    }
}

class Table {
    static Bowl bowl1 = new Bowl(1);

    public Table() {
        Console.log("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        Console.log("f2({})", marker);
    }

    static Bowl bowl2 = new Bowl(2);
}

class Cupboard {
    Bowl bowl3 = new Bowl(3);
    static Bowl bowl4 = new Bowl(4);

    public Cupboard() {
        Console.log("Cupboard()");
        bowl4.f1(2);
    }

    void f3(int marker) {
        Console.log("f3({})", marker);
    }

    static Bowl bowl5 = new Bowl(5);
}

public class StaticInitialization {
    public static void main(String[] args) {
        Console.log("Creating new Cupboard() in main");
        new Cupboard();
        Console.log("Creating new Cupboard() in main");
        new Cupboard();
        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}
