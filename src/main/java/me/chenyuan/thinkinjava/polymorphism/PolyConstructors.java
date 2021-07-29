package me.chenyuan.thinkinjava.polymorphism;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description Constructors and polymorphism
 *  don't produce what you might expect.
 * @Date 2021/7/28
 * @Version 1.0
 */
class Glyph {
    public Glyph() {
        Console.log("Glyph() before draw()");
        draw();
        Console.log("Glyph() after draw()");
    }

    void draw() {
        Console.log("Glyph.draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        this.radius = r;
        Console.log("RoundGlyph.RoundGlyph(). radius = {}", radius);
    }

    @Override
    void draw() {
        Console.log("RoundGlyph.draw(). radius = {}", radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
