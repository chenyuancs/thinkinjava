package me.chenyuan.thinkinjava.innerclasses;

/**
 * @Author JackChen
 * @description Nesting a class within a method.
 * @Date 2021/7/18
 * @Version 1.0
 */
public class Parcel5 {
    public Destination destination(String s) {
        class PDestinaiton implements Destination {
            private String label;

            public PDestinaiton(String label) {
                this.label = label;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestinaiton(s);
    }

    public static void main(String[] args) {
        Parcel5 p = new Parcel5();
        Destination d = p.destination("Tasmania");
    }
}
