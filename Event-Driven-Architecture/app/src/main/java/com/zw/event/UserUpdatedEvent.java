package com.zw.event;

import com.zw.model.User;

public class UserUpdatedEvent extends AbstractEvent{

    private User user;

    public UserUpdatedEvent(User user){

        this.user = user;
    }

    public String getUserName() {

        return this.user.getUserName();
    }
}
