package dev.robin.gidimanager.window;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("GidiManager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setLocationRelativeTo(null);

        setUpGUI();

        setVisible(true);
    }

    private void setUpGUI() {
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuBar.add(menuFile);

        JButton saveButton = new JButton("Save");
        menuFile.add(saveButton);

        menuFile.add(new JSeparator());

        JButton helpButton = new JButton("Help");
        helpButton.addActionListener(e -> {
            new HelpWindow(this);
        });

        menuFile.add(helpButton);

        JMenu menuFiller = new JMenu("Filler");
        menuBar.add(menuFiller);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 1));

        String[][] data = {
                {"0", "erst", "tf", "dwd"}
        };

        JScrollPane scrollPane = new JScrollPane(new JTable(data, new String[]{"ID", "Name", "Amount", "Image"}));
        panel.add(scrollPane);
        add(panel);
    }

    private void setupTable() {

    }

}
