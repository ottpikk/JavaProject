package designPatterns.view;

import designPatterns.controller.Controller;
import designPatterns.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Model model;

    private JButton loginButton;
    private JButton cancelButton;
    private JPasswordField passwordField;
    private JTextField nameField;

    private LoginListener loginlistener;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");
        passwordField = new JPasswordField(10);
        nameField = new JTextField(10);


        //Layout manager
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();

        //username label
        gridBagConstraints.anchor = GridBagConstraints.LAST_LINE_END;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new Insets(100,0,0,10);
        gridBagConstraints.fill = GridBagConstraints.NONE;
        add(new JLabel("Username: "),gridBagConstraints);

        //username field
        gridBagConstraints.anchor = GridBagConstraints.LAST_LINE_START;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new Insets(100,0,0,0);
        gridBagConstraints.fill = GridBagConstraints.NONE;
        //add button to specified location
        add(nameField, gridBagConstraints);



        // password label
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new Insets(0,0,0,10);
        gridBagConstraints.fill = GridBagConstraints.NONE;
        add(new JLabel("Password: "),gridBagConstraints);

        //Location of password field
        gridBagConstraints.anchor = GridBagConstraints.LINE_START;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.insets = new Insets(0,0,0,0);
        gridBagConstraints.fill = GridBagConstraints.NONE;
        //add button to specified location
        add(passwordField, gridBagConstraints);

        //Location of submit button
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 100;
        gridBagConstraints.fill = GridBagConstraints.NONE;  // add previous to manager
        //add button to specified location
        add(loginButton, gridBagConstraints);
        loginButton.addActionListener(this);

        //Location of cancel button
        gridBagConstraints.anchor = GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 2;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.NONE;
        //add button to specified location
        add(cancelButton, gridBagConstraints);
        cancelButton.addActionListener(this);

        /*
        // instead of implementing class we can use ActionListener class with Performed method
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry to see you go!");
            }
        });
         */


        // Create window
        setSize(600,500);   // Size of window
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //set method to end running
        setVisible(true);  // set if window is visible to user
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton)e.getSource();
        String password = new String(passwordField.getPassword());
        String name = nameField.getText();

        if(source == loginButton){
           fireLoginEvent(new LoginFormEvent(name, password));
        } else {
            System.out.println("cancelLogIn");
        }
    }

    public void setLoginListener(LoginListener loginListener) {
        this.loginlistener = loginListener;
    }

    public void fireLoginEvent(LoginFormEvent event){


        if (loginlistener != null){
            loginlistener.LoginPerformed(event);
        }
    }
}
