package designPatterns.view;

import designPatterns.model.Model;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {
    private Model model;

    public View(Model model) throws HeadlessException {
        super("MVC Demo");
        this.model = model;

        setLayout(new GridBagLayout());

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        gridBagConstraints.gridheight = 0;
        gridBagConstraints.gridwidth = 0;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = GridBagConstraints.NONE;

        setSize(600,500);   // Size of window
        setDefaultCloseOperation(EXIT_ON_CLOSE);  //set method to end running
        setVisible(true);  // set if window is visible to user
    }
}
