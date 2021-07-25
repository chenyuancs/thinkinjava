package me.chenyuan.thinkinjava.innerclasses;

import cn.hutool.core.lang.Console;

/**
 * @Author JackChen
 * @description Creating a constructor for an anonymous inner class.
 * @Date 2021/7/19
 * @Version 1.0
 */
abstract class Base {
    public Base(int i) {
        Console.log("Base constructor, i = {}", i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            {
                Console.log("Inside instance initializer");
            }

            @Override
            public void f() {
                Console.log("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
