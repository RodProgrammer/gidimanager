package dev.robin.gidimanager.window;

import javax.swing.*;

public class HelpWindow extends JDialog {
    public HelpWindow(JFrame parent) {
        super(parent, "Help", true);
        setSize(800, 600);
        setLocationRelativeTo(parent);
        setModalityType(ModalityType.APPLICATION_MODAL);


        setVisible(true);
    }
}
