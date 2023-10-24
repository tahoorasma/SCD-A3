package com.mycompany.scd_assignment_3.SCD_A3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadBook {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReadBook();
        });
    }
    private static void ReadBook() {
        JFrame frame = new JFrame("ReadBook");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 420);
        frame.getContentPane().setBackground(new Color(136, 185, 138));
        frame.setLayout(new BorderLayout());
        JButton backButton = new JButton("<");
        backButton.setBackground(new Color(0,51,51));
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewAll.saveFile();
                ViewAll h = new ViewAll();
                h.setVisible(true);
                frame.setVisible(false);
            }
        });
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(backButton);
        frame.add(buttonPanel, BorderLayout.NORTH);
        JTextArea textArea = new JTextArea("This is text area");
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}