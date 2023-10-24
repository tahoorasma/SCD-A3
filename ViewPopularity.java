package com.mycompany.scd_assignment_3.SCD_A3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

class barChart extends JPanel{
    private final int[] data;
    public barChart(int [] data) {
        setOpaque(false); 
        setPreferredSize(new Dimension(500, 300));
        this.data = data;
    }
    @Override
protected void paintComponent(Graphics g) {
    System.out.println("Hello");
    super.paintComponent(g);
    int barWidth = 50;
    int startX = 50;
    int startY = getHeight() - 50;
    int maxDataValue = 0;
    for (int value : data) {
        maxDataValue = Math.max(maxDataValue, value);
    }
    int scale = 10;
    for (int i = 0; i < data.length; i++) {
        int barHeight = data[i] * scale;
        barHeight = Math.max(barHeight, 10);
        int x = startX + i * (barWidth + 10);
        int y = startY - barHeight;
        g.setColor(Color.blue);
        g.fillRect(x, y, barWidth, barHeight);
        g.setColor(Color.black);
        g.drawString(String.valueOf(data[i]), x + barWidth / 2, y - 5);
    }
    }
}
public class ViewPopularity extends javax.swing.JFrame {
    public ViewPopularity() {
        initComponents();
        getContentPane().setBackground(new Color(250, 250, 250));
        int [] data = {15,20,10,25};/*new int[ViewAll.Index];
        for (int i = 0; i < ViewAll.Index; i++){
            String words = ViewAll.Array[i]; 
            String [] arr = words.split(",");
            arr[3] = arr[3].trim();
            data[i] = Integer.parseInt(arr[3]);
            System.out.println(i+": "+data[i]);
        }*/
        barChart chart = new barChart(data);
        JPanel chartPanel = new JPanel(new BorderLayout());
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        chartPanel.setBorder(border);
        chartPanel.setOpaque(false);
        chartPanel.setVisible(true);
        chartPanel.add(chart, BorderLayout.CENTER);
        getContentPane().add(chartPanel, BorderLayout.CENTER);
        revalidate();
        repaint();
        setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ViewPopularity");
        setBackground(new java.awt.Color(0, 63, 36));

        backButton.setBackground(new java.awt.Color(0, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(616, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(399, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ViewAll.saveFile();
        ViewAll h = new ViewAll();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPopularity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPopularity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPopularity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPopularity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPopularity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    // End of variables declaration//GEN-END:variables
}
