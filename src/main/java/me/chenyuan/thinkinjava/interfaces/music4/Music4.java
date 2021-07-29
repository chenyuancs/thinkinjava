package me.chenyuan.thinkinjava.interfaces.music4;

import cn.hutool.core.lang.Console;
import me.chenyuan.thinkinjava.polymorphism.music.Note;

/**
 * @Author chen yuan
 * @description Abstract classes and methods.
 * @Date 2021/7/28
 * @Version 1.0
 */
abstract class Instrument {
    private int i;

    public abstract void play(Note n);

    public String what() {
        return "Instrument";
    }

    public abstract void adjust();
}

class Wind extends Instrument {
    @Override
    public void play(Note n) {
        Console.log("Wind.play() {}", n);
    }

    @Override
    public String what() {
        return "Wind";
    }

    @Override
    public void adjust() { }
}

class Percussion extends Instrument {
    @Override
    public void play(Note n) {
        Console.log("Percussion.play() {}", n);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() { }
}

class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        Console.log("Stringed.play() {}", n);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() { }
}

class Brass extends Wind {
    @Override
    public void play(Note n) {
        Console.log("Brass.play() {}", n);
    }

    @Override
    public void adjust() {
        Console.log("Brass.adjust()");
    }
}

class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        Console.log("Woodwind.play() {}", n);
    }

    @Override
    public String what() {
        return "Woodwind";
    }
}

public class Music4 {
    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument i : e) {
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
