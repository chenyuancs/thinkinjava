package me.chenyuan.thinkinjava.polymorphism;

import me.chenyuan.thinkinjava.polymorphism.shape.*;

/**
 * @Author chen yuan
 * @description
 * @Date 2021/7/28
 * @Version 1.0
 */
public class Shapes {
    private static RandomShapeGenerator gen = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] s = new Shape[9];

        for (int i = 0; i < s.length; i++) {
            s[i] = gen.next();
        }

        for (Shape shp : s) {
            shp.draw();
        }
    }
}
