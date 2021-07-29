package me.chenyuan.thinkinjava.access;

/**
 * @Author chen yuan
 * @description Demonstrates class access specifiers. Make a class
 * effectively private with private constructors.
 * @Date 2021/7/26
 * @Version 1.0
 */
class Soup1 {
    private Soup1() {
    }

    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {
    }

    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
        return ps1;
    }

    public void f() {}
}

public class Lunch {
    void testPrivate() {
//        Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
