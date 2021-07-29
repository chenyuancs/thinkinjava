package me.chenyuan.thinkinjava.polymorphism;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description Direct field access is determined at compile time.
 * @Date 2021/7/28
 * @Version 1.0
 */
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        Console.log("sup.field = {}, sup.getField() = {}",
                sup.field, sup.getField());

        Sub sub = new Sub();
        Console.log("sub.field = {}, sub.getField() = {}, sub.getSuperField() = {}",
                sub.field, sub.getField(), sub.getSuperField());
    }
}
