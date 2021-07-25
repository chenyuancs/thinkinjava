package me.chenyuan.thinkinjava.innerclasses;

import me.chenyuan.thinkinjava.innerclasses.controller.Controller;
import me.chenyuan.thinkinjava.innerclasses.controller.Event;

/**
 * @Author JackChen
 * @description
 * @Date 2021/7/23
 * @Version 1.0
 */
public class GreenhouseControls extends Controller {
    private boolean light = false;

    public class LightOn extends Event {
        protected LightOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = true;
        }

        @Override
        public String toString() {
            return "Light is on";
        }
    }

    public class LightOff extends Event {
        protected LightOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            light = false;
        }

        @Override
        public String toString() {
            return "Light is off";
        }
    }

    private boolean water = false;
    public class WaterOn extends Event {
        protected WaterOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = true;
        }

        @Override
        public String toString() {
            return "Greenhouse water is on";
        }
    }

    public class WaterOff extends Event {
        protected WaterOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            water = false;
        }

        @Override
        public String toString() {
            return "Greenhouse water is off";
        }
    }

    private String thermostat = "Day";
    public class ThermostatNight extends Event {
        protected ThermostatNight(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Night";
        }

        @Override
        public String toString() {
            return "Thermostat on night setting";
        }
    }

    public class ThermostatDay extends Event {
        protected ThermostatDay(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            thermostat = "Day";
        }

        @Override
        public String toString() {
            return "Thermostat on day setting";
        }
    }

    public class Bell extends Event {

        protected Bell(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            addEvent(new Bell(delayTime));
        }

        @Override
        public String toString() {
            return "Bing!";
        }
    }
    
    public class Restart extends Event {
        private Event[] eventList;
        
        protected Restart(long delayTime, Event[] eventList) {
            super(delayTime);
            this.eventList = eventList;
            for (Event e : eventList) {
                addEvent(e);
            }
        }

        @Override
        public void action() {
            for (Event e : eventList) {
                e.start();  // Rerun each event
                addEvent(e);
            }
            start(); // Rerun this event
            addEvent(this);
        }

        @Override
        public String toString() {
            return "Restart system";
        }
    }

    public static class Terminate extends Event {

        protected Terminate(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            System.exit(0);

        }
        @Override
        public String toString() {
            return "Terminating";
        }
    }
}
