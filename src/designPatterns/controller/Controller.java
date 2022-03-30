package designPatterns.controller;

import designPatterns.model.Model;
import designPatterns.view.LoginFormEvent;
import designPatterns.view.LoginListener;
import designPatterns.view.View;

public class Controller implements LoginListener {
    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void LoginPerformed(LoginFormEvent event) {
        System.out.println("Login event received: " + event.getName() + " " + event.getPassword());

    }
}
