package com.mycompany.scd_assignment_3.SCD_A3;
import java.io.File;
import javax.swing.JOptionPane;
public class DeleteItem extends javax.swing.JFrame {
    public int deleteID;
    public DeleteItem() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        pubYearLabel = new javax.swing.JLabel();
        Label = new javax.swing.JLabel();
        IDtf = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        priceLabel = new javax.swing.JLabel();
        IDLabel = new javax.swing.JLabel();
        bookAuthorLabel = new javax.swing.JLabel();
        bookPubYearLabel = new javax.swing.JLabel();
        bookPriceLabel = new javax.swing.JLabel();
        bookTitleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeleteItem");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(136, 185, 138));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 43, 27));
        titleLabel.setText("Title: ");

        authorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        authorLabel.setForeground(new java.awt.Color(0, 43, 27));
        authorLabel.setText("Author: ");

        pubYearLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pubYearLabel.setForeground(new java.awt.Color(0, 43, 27));
        pubYearLabel.setText("Publication Year: ");

        Label.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        Label.setForeground(new java.awt.Color(0, 51, 51));
        Label.setText("Enter ID to delete a book");

        IDtf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDtfActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(216, 252, 230));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        priceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        priceLabel.setForeground(new java.awt.Color(0, 43, 27));
        priceLabel.setText("Price: ");

        IDLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDLabel.setForeground(new java.awt.Color(0, 43, 27));
        IDLabel.setText("ID: ");

        bookAuthorLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        bookAuthorLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bookPubYearLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        bookPubYearLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bookPriceLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        bookPriceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        bookTitleLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        bookTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(titleLabel)
                                    .addComponent(IDLabel))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(IDtf, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                                    .addComponent(bookAuthorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bookPubYearLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bookPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleLabel)
                    .addComponent(bookTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(authorLabel)
                    .addComponent(bookAuthorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pubYearLabel)
                    .addComponent(bookPubYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(bookPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(deleteButton)
                .addContainerGap(88, Short.MAX_VALUE))
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
        deleteID = Integer.parseInt(IDtf.getText());
        if (deleteID < 1 || deleteID > ViewAll.Index){
            JOptionPane.showMessageDialog(null, "No book found with ID: "+deleteID, "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            deleteID--;
            System.out.println("ID: "+deleteID);
            String words = ViewAll.Array[deleteID];
            String [] arr = words.split(",");
            arr[0] = arr[0].trim();
            bookTitleLabel.setText(arr[0]);
            arr[1] = arr[1].trim();
            bookAuthorLabel.setText(arr[1]);
            arr[2] = arr[2].trim();
            bookPubYearLabel.setText(arr[2]);
            arr[4] = arr[4].trim();
            bookPriceLabel.setText(arr[4]);}

    }//GEN-LAST:event_IDtfActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        for (int i=deleteID; i < ViewAll.Index; i++){
            ViewAll.Array[i] = "";
            ViewAll.Array[i] = ViewAll.Array[i+1];
        }
        ViewAll.Index--;
        String filePath = (deleteID+1)+".txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {JOptionPane.showMessageDialog(null, "Failed to delete file", "Error", JOptionPane.ERROR_MESSAGE);}
        } else {JOptionPane.showMessageDialog(null, "Failed to open file", "Error", JOptionPane.ERROR_MESSAGE);}
        JOptionPane.showMessageDialog(null, "Book \""+bookTitleLabel.getText()+" by "+bookAuthorLabel.getText()+"("+bookPubYearLabel.getText()+")\" has been deleted successfully!", "Message", JOptionPane.INFORMATION_MESSAGE);
        System.out.println("Book \""+bookTitleLabel.getText()+" by "+bookAuthorLabel.getText()+"("+bookPubYearLabel.getText()+")\" has been deleted");
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteItem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDLabel;
    private javax.swing.JTextField IDtf;
    private javax.swing.JLabel Label;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel bookAuthorLabel;
    private javax.swing.JLabel bookPriceLabel;
    private javax.swing.JLabel bookPubYearLabel;
    private javax.swing.JLabel bookTitleLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel pubYearLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
