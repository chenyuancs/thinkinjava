package me.chenyuan.thinkinjava.polymorphism.shape;

import java.util.Random;

/**
 * @Author chen yuan
 * @description A "factory" that randomly creates shapes.
 * @Date 2021/7/28
 * @Version 1.0
 */
public class RandomShapeGenerator {
    private Random rand = new Random(47);

    public Shape next() {
        switch (rand.nextInt(3)) {
            default:
            case 0:
                return new Circle();
            case 1:
                return new Square();
            case 2:
                return new Triangle();
        }
    }
}
