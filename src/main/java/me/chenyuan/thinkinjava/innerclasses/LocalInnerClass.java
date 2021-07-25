package me.chenyuan.thinkinjava.innerclasses;

import cn.hutool.core.lang.Console;

/**
 * @Author JackChen
 * @description Holds a sequence of Objects.
 * @Date 2021/7/24
 * @Version 1.0
 */
interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        // A local inner class
        class LocalCounter implements Counter {
            public LocalCounter() {
                Console.log("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    // The same thing with an anonymous inner class
    Counter getCounter2(final String name) {
        return new Counter() {
            {
                Console.log("Counter()");
            }

            @Override
            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local inner "),
                c2 = lic.getCounter2("Anonymous inner ");
        for (int i = 0; i < 5; i++) {
            Console.log(c1.next());
        }

        for (int i = 0; i < 5; i++) {
            Console.log(c2.next());
        }
    }
}
