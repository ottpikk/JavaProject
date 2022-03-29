package designPatterns;

import designPatterns.controller.Controller;
import designPatterns.model.Model;
import designPatterns.view.View;

import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // TODO Auto- generate method stub
                runApp();
            }
        });

    }

    public static void runApp(){
        Model model = new Model();

        View view = new View(model);
        Controller controller = new Controller(model, view);

    }
}
