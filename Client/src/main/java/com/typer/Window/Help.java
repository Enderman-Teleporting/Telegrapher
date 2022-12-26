package com.typer.Window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Help {
    public static void window(){
        Frame helpWindow=new Frame("Help");
        helpWindow.addWindowListener(new WindowAdapter() {
                                    @Override
                                    public void windowClosing(WindowEvent e) {
                                        helpWindow.setVisible(false);
                                    }
                                }
        );
        helpWindow.setVisible(true);
    }
}
