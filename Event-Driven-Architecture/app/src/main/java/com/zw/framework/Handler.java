package com.zw.framework;

public interface Handler<E extends Event> {

    void onEvent(E event);
}
