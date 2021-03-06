package com.iqmsoft.ui

import com.vaadin.annotations.Theme
import com.vaadin.annotations.Widgetset
import com.vaadin.server.VaadinRequest
import com.vaadin.spring.annotation.SpringUI
import com.vaadin.ui.Button
import com.vaadin.ui.Label
import com.vaadin.ui.UI
import com.vaadin.ui.VerticalLayout
import com.vaadin.ui.themes.ValoTheme

import java.time.Instant

@SpringUI
@Theme('app')
@Widgetset('app')
class AppUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        def layout = new VerticalLayout()

        layout.addComponent(new Label('Hello From Spring Boot Vaadin').with {
            setStyleName(ValoTheme.LABEL_H1)
            it
        })

        

        layout.addComponents(new Button('Click for Greetings', {
            layout.addComponent(new Label("Welcome to Spring Boot Groovy"))
            layout.addComponent(new Label("Have a Nice Day"))
            layout.addComponent(new Label("Vaadin Rocks!!!!"))
        } as Button.ClickListener))

        setContent(layout)
    }

}

