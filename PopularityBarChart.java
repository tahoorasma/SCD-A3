package com.mycompany.scd_assignment_3.SCD_A3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PopularityBarChart extends JFrame{
    public PopularityBarChart(){
        setTitle("Popularity Bar Chart");
        setSize(640, 420);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
    JPanel barChart;
        barChart = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                int barWidth = 20;
                int startX = 100;
                int startY = getHeight() - 50;
                int maxDataValue = 0;
                int [] data = new int[ViewAll.Index];
                for (int i = 0; i < ViewAll.Index; i++){
                    String words = ViewAll.Array[i];
                    String [] arr = words.split(",");
                    arr[3] = arr[3].trim();
                    data[i] = Integer.parseInt(arr[3]);
                    System.out.println(i+": "+data[i]);
                }
                for (int value : data) {
                    maxDataValue = Math.max(maxDataValue, value);
                }
                int scale;
                if (maxDataValue<100)
                    scale = 4;
                else
                    scale = 2;
                g.setColor(Color.BLACK);
                g.drawString("Book IDs", getWidth() / 2, getHeight() - 10);
                g.drawString("Popularity Count", 10, getHeight() / 2);
                g.setColor(Color.BLACK);
                g.drawLine(startX, 10, startX, startY);
                g.drawLine(startX, startY, getWidth() - 10, startY);
                for (int i = 0; i < data.length; i++) {
                    int x = startX + i * (barWidth + 5);
                    g.setColor(Color.GRAY);
                    g.setColor(Color.BLACK);
                    g.drawString(""+(i + 1), x, startY + 15);
                    int barHeight = data[i] * scale;
                    barHeight = Math.max(barHeight, 10);
                    int y = startY - barHeight;
                    g.setColor(new Color(136,185,138));
                    g.fillRect(x, y, barWidth, barHeight);
                    g.setColor(Color.black);
                    g.drawString(String.valueOf(data[i]), x-5 + barWidth / 2, y - 5);
                }
            }
        };
        barChart.setBackground(Color.white);
        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.setFont(new Font ("SegoeUI",Font.PLAIN,8));
        backButton.setForeground(Color.BLACK);
        backButton.setBorderPainted(true);
        backButton.setContentAreaFilled(true);
        backButton.addActionListener((ActionEvent e) -> {
            ViewAll.saveFile();
            ViewAll h = new ViewAll();
            h.setVisible(true);
            setVisible(false);
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1,13));
        buttonPanel.add(backButton);
        for (int i = 0; i<10; i++){
        JLabel label = new JLabel("");
        label.setOpaque(true);
        label.setBackground(Color.WHITE);
        buttonPanel.add(label);}
        getContentPane().add(buttonPanel, BorderLayout.NORTH);
        getContentPane().add(barChart, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PopularityBarChart vp = new PopularityBarChart();
            vp.setVisible(true);
        });
    }
}