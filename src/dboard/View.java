package dboard;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class View extends JPanel {
    JTable table;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;

    public View(){
        String[] columnNames = {"ID","First_Name","Last_Name","Phone","Email","Address"};

        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        scrollPane = new JScrollPane(table);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(scrollPane);

        setBorder(new EmptyBorder(50, 250, 50, 20));
        setBackground(Color.WHITE);


        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setFillsViewportHeight(true);
        table.setRowHeight(40);


        JTableHeader header = table.getTableHeader();
        header.setBackground(Color.WHITE);
        header.setForeground(Color.BLACK);
        header.setFont(new Font("SansSerif", Font.BOLD, 15));
    }

    public DefaultTableModel getTableModel() {
        return tableModel;
    }
    public JTable getTable() {
        return table;
    }
}

