package me.chenyuan.thinkinjava.innerclasses;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description Creating inner classes.
 * @Date 2021/7/16
 * @Version 1.0
 */
public class Parcel1 {

    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            this.label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String dest) {
        Contents c = new Contents();
        Destination d = new Destination(dest);
        Console.log(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
