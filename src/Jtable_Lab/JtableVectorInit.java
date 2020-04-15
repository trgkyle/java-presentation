/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jtable_Lab;

/**
 *
 * @author truonghdpk
 */
// Packages to import 
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class JtableVectorInit {
    // frame 

    JFrame f;
    // Table 
    JTable t;

    public void sortAction() {
        System.out.println("Sort action test");
    }

    public void addAction() {
        System.out.println("Add action test");
    }

    public void deleteAction() {
        System.out.println("Delete Action test");
    }

    // Constructor 
    JtableVectorInit() {
        // Frame initiallization 
        f = new JFrame();

        // Dat title
        f.setTitle("Title Jtable");
        Vector v = new Vector(); 
        // Data to be displayed in the JTable 
        Vector<Vector<String>> s = new Vector<Vector<String>>();
        v.add("hello");
        System.out.println(v.get(0));

        
        String[][] data = {
            {"2017698753", "Pham Thi Linh", "Nu", "6", "4", "7"},
            {"2017996325", "Tran Hoang Long", "Nam", "7", "6", "7"},
            {"2018669854", "Vuong Phuc Lam", "Nam", "9", "5", "6"}
        };

        // Column Names 
        String[] columnNames = {"Ma sv", "Ho va ten", "Gioi tinh", "Dai So", "Kinh Te", "Triet Hoc"};

        // Initializing the JTable 
        t = new JTable(data, columnNames);
        t.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        t.getColumnModel().getColumn(0).setPreferredWidth(100);
        t.getColumnModel().getColumn(1).setPreferredWidth(280);

        // adding table with scroll and push it to Jframe
        JScrollPane sp = new JScrollPane(t);

        // adding table with scroll and push it to Jframe
        f.add(sp);
        // Frame Size 
        JButton sortButton = new JButton("Sort Action");
        JButton addButton = new JButton("Add Action");
        JButton deleteButton = new JButton("Delete Action");

        // add action listener
        sortButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sortAction();
            }
        });
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addAction();
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                deleteAction();
            }
        });
        f.add(sortButton);
        f.add(addButton);
        f.add(deleteButton);

        f.setSize(500, 600);
        f.validate();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
    }

    // Driver method 
    public static void main(String[] args) {
        new JtableVectorInit();
    }
}
