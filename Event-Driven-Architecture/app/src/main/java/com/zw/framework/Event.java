package com.zw.framework;

public interface Event {

    Class<? extends Event> getType();
}
