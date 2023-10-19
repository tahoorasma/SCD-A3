package com.mycompany.scd_assignment_3.SCD_A3;
import javax.swing.JOptionPane;

public class EditItem extends javax.swing.JFrame {
    public int editID;
    public int popularityCount;
    public EditItem() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        BookTitleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        pubYearLabel = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        IDtf = new javax.swing.JTextField();
        authorTF = new javax.swing.JTextField();
        yearTF = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();
        IDLabel = new javax.swing.JLabel();
        titleTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EditItem");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 185, 138));

        backButton.setBackground(new java.awt.Color(0, 51, 51));
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("<");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        BookTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BookTitleLabel.setForeground(new java.awt.Color(0, 43, 27));
        BookTitleLabel.setText("Title: ");

        authorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(0, 43, 27));
        authorLabel.setText("Author: ");

        pubYearLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pubYearLabel.setForeground(new java.awt.Color(0, 43, 27));
        pubYearLabel.setText("Publication Year: ");

        Label.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Label.setForeground(new java.awt.Color(0, 51, 51));
        Label.setText("Enter details to edit a book");

        IDtf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtfActionPerformed(evt);
            }
        });

        authorTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        authorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTFActionPerformed(evt);
            }
        });

        yearTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        yearTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearTFActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(216, 252, 230));
        editButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editButton.setText("EDIT");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 43, 27));
        priceLabel.setText("Price: ");

        priceTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        IDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(0, 43, 27));
        IDLabel.setText("ID: ");

        titleTF.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Label)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(priceLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(pubYearLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(authorLabel))
                                    .addComponent(BookTitleLabel)
                                    .addComponent(IDLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(yearTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(priceTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IDtf, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(Label)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDLabel)
                    .addComponent(IDtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BookTitleLabel)
                    .addComponent(titleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorLabel))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pubYearLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(priceLabel))
                .addGap(23, 23, 23)
                .addComponent(editButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void IDtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDtfActionPerformed
        editID = Integer.parseInt(IDtf.getText());                                   
        if (editID < 1 || editID > ViewAll.Index){
         JOptionPane.showMessageDialog(null, "No book found with ID: "+editID, "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
        editID--;
        System.out.println("ID: "+editID);
        String words = ViewAll.Array[editID]; 
        String [] arr = words.split(",");
        arr[0] = arr[0].trim();
        titleTF.setText(arr[0]);
        arr[1] = arr[1].trim();
        authorTF.setText(arr[1]);
        arr[2] = arr[2].trim();
        yearTF.setText(arr[2]);
        arr[3] = arr[3].trim();
        popularityCount = Integer.parseInt(arr[3]);
        arr[4] = arr[4].trim();
        priceTF.setText(arr[4]);}
        
    }//GEN-LAST:event_IDtfActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String book = titleTF.getText()+", "+authorTF.getText()+", "+yearTF.getText()+", "+popularityCount+", "+priceTF.getText();
        ViewAll.Array[editID] = book;
        JOptionPane.showMessageDialog(null, "Book \""+titleTF.getText()+" by "+authorTF.getText()+"("+yearTF.getText()+")\" has been edited successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Book \""+titleTF.getText()+" by "+authorTF.getText()+"("+yearTF.getText()+")\" has been edited");
    }//GEN-LAST:event_editButtonActionPerformed

    private void yearTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearTFActionPerformed

    private void authorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTFActionPerformed

    private void titleTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTFActionPerformed

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
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BookTitleLabel;
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDtf;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorTF;
    private javax.swing.JButton backButton;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel pubYearLabel;
    private javax.swing.JTextField titleTF;
    private javax.swing.JTextField yearTF;
    // End of variables declaration//GEN-END:variables
}
