package me.chenyuan.thinkinjava.initialization;

import cn.hutool.core.lang.Console;

/**
 * @Author JackChen
 * @description
 * @Date 2021/7/25
 * @Version 1.0
 */
class Window {
    public Window(int marker) {
        Console.log("Window({})", marker);
    }
}

class House {
    Window w1 = new Window(1);

    public House() {
        Console.log("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f() {
        Console.log("f()");
    }

    Window w3 = new Window(3);
}

public class OrderOfInitialization {
    public static void main(String[] args) {
        House h = new House();
        h.f();
    }
}
