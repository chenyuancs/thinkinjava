package me.chenyuan.thinkinjava.innerclasses;

/**
 * @Author JackChen
 * @description Using .new to create instances of inner classes.
 * @Date 2021/7/18
 * @Version 1.0
 */
public class Parcel3 {
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

    public static void main(String[] args) {
        Parcel3 p = new Parcel3();

        // 必须使用外部类的对象，来创建内部类的实例
        Parcel3.Contents c = p.new Contents();
        Parcel3.Destination d = p.new Destination("Tasmania");
    }
}
