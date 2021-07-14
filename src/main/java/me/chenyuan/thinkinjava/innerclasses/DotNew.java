package me.chenyuan.thinkinjava.innerclasses;

/**
 * @Author chen yuan
 * @description Creating an inner class directly using the .new Syntax.
 * @Date 2021/7/14
 * @Version 1.0
 */
public class DotNew {
    public class Inner {}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        // 必须使用外部类的对象来创建其内部类对象
        DotNew.Inner dni = dn.new Inner();
    }
}
