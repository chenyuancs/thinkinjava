package me.chenyuan.thinkinjava.polymorphism.shape;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description
 * @Date 2021/7/28
 * @Version 1.0
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        Console.log("Circle.draw()");
    }

    @Override
    public void erase() {
        Console.log("Circle.erase()");
    }
}
