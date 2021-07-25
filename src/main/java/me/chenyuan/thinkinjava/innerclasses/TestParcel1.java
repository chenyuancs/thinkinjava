package me.chenyuan.thinkinjava.innerclasses;

/**
 * @Author JackChen
 * @description
 * @Date 2021/7/18
 * @Version 1.0
 */
public class TestParcel1 {
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        Contents c = p.contents();
        Destination d = p.destination("Tasmania");
    }
}

class Parcel4 {
    private class PContents implements Contents {
        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestinaiton implements Destination {
        private String label;

        public PDestinaiton(String label) {
            this.label = label;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestinaiton(s);
    }

    public Contents contents() {
        return new PContents();
    }
}

