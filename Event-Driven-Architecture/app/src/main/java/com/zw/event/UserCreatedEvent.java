package com.zw.event;

import com.zw.model.User;

public class UserCreatedEvent extends AbstractEvent {

    private User user;

    public UserCreatedEvent(User user){

        this.user = user;
    }

    public String getUserName() {

        return this.user.getUserName();
    }
}
