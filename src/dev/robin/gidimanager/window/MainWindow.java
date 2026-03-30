package dev.robin.gidimanager.window;

import dev.robin.gidimanager.table.ButtonEditor;
import dev.robin.gidimanager.table.ButtonRenderer;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
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

        JScrollPane scrollPane = new JScrollPane(setupTable());
        panel.add(scrollPane);
        add(panel);
    }

    private JTable setupTable() {
        Object[][] data = {
                {"0", "erst", "tf", "dwd", "details"}
        };

        String[] columnNames = {"ID", "Name", "Amount", "Image", "Details"};

        JTable jtable = new JTable(new DefaultTableModel(data, columnNames));

        jtable.getColumnModel().getColumn(4).setCellRenderer(new ButtonRenderer());
        jtable.getColumnModel().getColumn(4).setCellEditor(new ButtonEditor(new JCheckBox()));

        return jtable;
    }

}
