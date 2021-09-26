/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.zw;

import com.zw.event.UserCreatedEvent;
import com.zw.event.UserUpdatedEvent;
import com.zw.framework.EventDispatcher;
import com.zw.handler.UserCreatedEventHandler;
import com.zw.handler.UserUpdatedEventHandler;
import com.zw.model.User;

public class App {



    public static void main(String[] args) {

        EventDispatcher dispatcher = new EventDispatcher();

        dispatcher.registerEvent(UserCreatedEvent.class, new UserCreatedEventHandler());
        dispatcher.registerEvent(UserUpdatedEvent .class, new UserUpdatedEventHandler());

        User user = new User("zw");
        dispatcher.dispatch(new UserCreatedEvent(user));
        dispatcher.dispatch(new UserUpdatedEvent(user));
    }
}