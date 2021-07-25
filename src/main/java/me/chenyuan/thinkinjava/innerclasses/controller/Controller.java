package me.chenyuan.thinkinjava.innerclasses.controller;

import cn.hutool.core.lang.Console;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author JackChen
 * @description The reusable framework for control systems.
 * @Date 2021/7/23
 * @Version 1.0
 */
public class Controller {
    private List<Event> eventList = new ArrayList<>();

    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while (eventList.size() > 0) {
            for (Event e : new ArrayList<>(eventList)) {
                if (e.ready()) {
                    Console.log(e);
                    e.action();
                    eventList.remove(e);
                }
            }
        }
    }
}
