package ru.javalang.module07.utils;

import java.sql.Time;

public class TimeExtends extends Time {
    public TimeExtends(long time) {
        super(time);
    }

    public String current() {
        long hours = getHours();
        if (hours >= 4 && hours < 12) return "утро";
        else if ((hours > 12 && hours < 17)) return "день";
        else if (hours >= 17 && hours < 23) return "вечер";
        else return "ночь";
    }
}