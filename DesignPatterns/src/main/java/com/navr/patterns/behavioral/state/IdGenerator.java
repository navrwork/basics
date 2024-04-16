package com.navr.patterns.behavioral.state;

import java.util.concurrent.atomic.AtomicLong;

public class IdGenerator {

    private static AtomicLong atomicLong = new AtomicLong(System.currentTimeMillis());

    public static long generateUniqueId() {
        return atomicLong.getAndIncrement();
    }
}
