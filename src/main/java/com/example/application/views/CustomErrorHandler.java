package com.example.application.views;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.server.ErrorEvent;
import com.vaadin.flow.server.ErrorHandler;

public class CustomErrorHandler implements ErrorHandler {

    @Override
    public void error(ErrorEvent errorEvent) {
        if (UI.getCurrent() != null) {
            UI.getCurrent().access(() -> Notification.show("An internal error has occurred. " +
                    "Contact support for assistance."));
        }
    }
}