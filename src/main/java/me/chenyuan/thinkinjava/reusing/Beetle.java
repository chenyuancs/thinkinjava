package me.chenyuan.thinkinjava.reusing;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description The full process of initialization.
 * @Date 2021/7/27
 * @Version 1.0
 */
class Insect {
    private int i = 9;
    protected int j;

    public Insect() {
        Console.log("i = {}, j = {}", i, j);
        j = 39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");

    static int printInit(String s) {
        Console.log(s);
        return 47;
    }
}

public class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");

    public Beetle() {
        Console.log("k = {}", k);
        Console.log("j = {}", j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        Console.log("Beetle constructor");
        Beetle b = new Beetle();
    }
}
