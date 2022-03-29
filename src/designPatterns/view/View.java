package designPatterns.view;

import designPatterns.model.Model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    private Model model;
    private JButton helloButton;
    private JButton goodbyeButton;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        helloButton = new JButton("Hello");
        goodbyeButton = new JButton("Good Bye!");

        //Layout manager
        setLayout(new GridBagLayout());


        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;  // add previous to manager

        add(helloButton, gridBagConstraints);  // adds button to window

        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1;
        gridBagConstraints.weighty = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        add(goodbyeButton, gridBagConstraints);

        helloButton.addActionListener(this);
        goodbyeButton.addActionListener(this);

        // instead of implementing class we can use ActionListener class with Performed method
        goodbyeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Sorry to see you go!");
            }
        });


        // Create window
        setSize(600,500);   // Size of window
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //set method to end running
        setVisible(true);  // set if window is visible to user
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton source = (JButton)e.getSource();

        if(source == helloButton){
            System.out.println("Hello there!");
        } else {
            System.out.println("Some other button");
        }


    }
}
