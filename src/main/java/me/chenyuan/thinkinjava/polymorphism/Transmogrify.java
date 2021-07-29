package me.chenyuan.thinkinjava.polymorphism;

import cn.hutool.core.lang.Console;

/**
 * @Author chen yuan
 * @description Dynamically changing the behavior of an object
 *  via composition (the "State" design pattern)
 * @Date 2021/7/28
 * @Version 1.0
 */
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    @Override
    public void act() {
        Console.log("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        Console.log("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}

public class Transmogrify {
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
