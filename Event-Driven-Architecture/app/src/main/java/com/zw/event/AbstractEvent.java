package com.zw.event;

import com.zw.framework.Event;

public class AbstractEvent implements Event {


    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }
}
