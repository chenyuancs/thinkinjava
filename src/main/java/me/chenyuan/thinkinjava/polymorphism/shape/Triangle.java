package me.chenyuan.thinkinjava.polymorphism.shape;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description
 * @Date 2021/7/28
 * @Version 1.0
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        Console.log("Triangle.draw()");
    }

    @Override
    public void erase() {
        Console.log("Triangle.erase()");
    }
}
