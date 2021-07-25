package me.chenyuan.thinkinjava.innerclasses.controller;

/**
 * @Author JackChen
 * @description The common methods for any control event.
 * @Date 2021/7/23
 * @Version 1.0
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;


    protected Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }

    public abstract void action();
}
