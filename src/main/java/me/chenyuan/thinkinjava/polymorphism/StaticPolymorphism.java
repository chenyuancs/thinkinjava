package me.chenyuan.thinkinjava.polymorphism;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description Static methods are not polymorphic.
 * @Date 2021/7/28
 * @Version 1.0
 */
class StaticSuper {
    public static String staticGet() {
        return "Base staticGet()";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }
}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet()";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }
}

public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup = new StaticSub();
        Console.log(sup.staticGet());
        Console.log(sup.dynamicGet());
    }
}
