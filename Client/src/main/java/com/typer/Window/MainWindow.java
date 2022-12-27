package com.typer.Window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.typer.Window.Buttons.Exit;
import static com.typer.Window.Buttons.HelpAndAuthorInfo;
import static com.typer.Window.EmptyFiller.emptyPanel;
import static com.typer.Window.Input.wordsShow;

public class MainWindow {
    public static void showMain(){
        Image icon=Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/pics/telegraph.jpg").getPath());
        Frame frame = new Frame();
        frame.setIconImage(icon);
        frame.setTitle("Telegrapher");
        frame.setSize(800,600);
        frame.setLocation(500,250);
        frame.setBackground(Color.white);
        frame.add(StringWriter.string(),BorderLayout.CENTER);
        frame.add(emptyPanel(),BorderLayout.WEST);
        frame.add(wordsShow(),BorderLayout.CENTER);
        frame.add(Pic.mainPic(),BorderLayout.NORTH);
        frame.add(HelpAndAuthorInfo(),BorderLayout.EAST);
        frame.add(Exit(), BorderLayout.SOUTH);
        frame.setVisible(true);
        frame.setResizable(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );

    }
}
