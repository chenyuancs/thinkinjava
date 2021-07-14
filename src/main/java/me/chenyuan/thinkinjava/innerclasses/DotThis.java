package me.chenyuan.thinkinjava.innerclasses;

/**
 * @Author chen yuan
 * @description Qualifying access to the outer-class
 * @Date 2021/7/14
 * @Version 1.0
 */
public class DotThis {
    void f() {
        System.out.println("DotThis.f()");
    }

    public class Inner {
        public DotThis outer() {
            return DotThis.this;
            // A plain "this" would be Inner's "this"
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dt = new DotThis();
        DotThis.Inner dti = dt.inner();
        dti.outer().f();
    }
}
