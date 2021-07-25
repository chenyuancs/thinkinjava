package me.chenyuan.thinkinjava.innerclasses;

import cn.hutool.core.lang.Console;

/**
 * @Author JackChen
 * @description Using "instance initialization" to perform
 *  construction on an anonymous inner class.
 * @Date 2021/7/19
 * @Version 1.0
 */
public class Parcel10 {
    public Destination destination(final String dest, final float price) {
        return new Destination() {
            private int cost;

            // Instance initialization for each object:
            {
                cost = Math.round(price);
                if (cost > 100) {
                    Console.log("Over budget!");
                }
            }

            private String label = dest;
            @Override
            public String readLabel() {
                return dest;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tasmania", 101.395F);
    }
}
