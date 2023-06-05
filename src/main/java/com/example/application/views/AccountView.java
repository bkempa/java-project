package com.example.application.views;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.PermitAll;

@Route("account")
@PageTitle("Account | Vaadin CRM")
@PermitAll
public class AccountView extends VerticalLayout {

    public AccountView() {
        Button button = new Button();
        button.setText("click");
        button.addClickListener(e -> System.out.println(e.getButton()));
        add(button);
    }
}
