package com.zw.handler;

import com.zw.event.UserCreatedEvent;
import com.zw.framework.Handler;

public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

    @Override
    public void onEvent(UserCreatedEvent event) {
        System.out.printf("I am on event of %s , with user of %s\n\n", event.getType(), event.getUserName());
    }
}
