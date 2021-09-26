package com.zw.framework;

import java.util.HashMap;
import java.util.Map;

public class EventDispatcher {

    private Map<Class<? extends Event>, Handler<? extends Event>> eventHandler = null;

    public EventDispatcher(){

        this.eventHandler = new HashMap<>();
    }

    public <E extends Event> void registerEvent(Class<E> eventClass, Handler<E> handler){

        this.eventHandler.put(eventClass, handler);
    }

    public <E extends Event> void dispatch(E event){

        Handler<E> handler = (Handler<E>) this.eventHandler.get(event.getClass());
        if(handler != null){

            handler.onEvent(event);
        }
    }

}
