package com.zw.handler;

import com.zw.event.UserUpdatedEvent;
import com.zw.framework.Handler;

public class UserUpdatedEventHandler implements Handler<UserUpdatedEvent> {


    @Override
    public void onEvent(UserUpdatedEvent event) {
        System.out.printf("I am on event of %s , with user of %s\n\n", event.getType(), event.getUserName());
    }
}
