package dev.robin.gidimanager.table;

import javax.swing.*;
import java.awt.*;

public class ButtonEditor extends DefaultCellEditor {

    protected JButton button;

    public ButtonEditor(JCheckBox checkBox) {
        super(checkBox);
        button = new JButton();
        button.setOpaque(true);
        button.addActionListener(e -> fireEditingStopped());
    }

    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        button.setText("details");
        return (JButton) button;
    }

    public Object getCellEditorValue() {
        return "details";
    }

    @Override
    protected void fireEditingStopped() {
        super.fireEditingStopped();
        JOptionPane.showMessageDialog(button, "Button wurde gedrückt!");
    }

}
