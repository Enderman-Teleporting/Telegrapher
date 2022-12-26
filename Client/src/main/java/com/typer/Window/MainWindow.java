package com.typer.Window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.typer.Window.Buttons.Exit;

public class MainWindow {
    public static void showMain(){
        Frame frame = new Frame();
        frame.setTitle("Telegrapher");
        frame.setSize(800,600);
        frame.setLocation(500,250);
        frame.setBackground(Color.white);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.add(Exit(), BorderLayout.SOUTH);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

    }
}
