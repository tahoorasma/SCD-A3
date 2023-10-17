package com.mycompany.scd_assignment_3.SCD_A3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Home extends javax.swing.JFrame {
    static final int arraySize = 100;
    public static String [] Array = new String[100];
    public static int Index = 0;
    private String title;
    private String author;
    private int year;
    private int popularityCount;
    private int price;
    public Home() {
        initComponents();
        loader();
    }
        private void loader(){
            String fileName = "books.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null && Index < arraySize) {
                Array[Index] = line;
                Index++;
            }
            //localLoader();
            System.out.println("\nLoaded items from file \""+fileName+"\"");
        } catch (IOException e) {
            System.out.println("Loading error");
        }
        }
        /*public void localLoader(){
            String s = "";
            for (int m = 0; m<Index; m++){
                String element = Array[m];
                String[] words = element.split(",");
                title = words[0];
                author = words[1];
                words[2] = words[2].trim();
                year = Integer.parseInt(words[2]);
                words[3] = words[3].trim();
                popularityCount = Integer.parseInt(words[3]);
                words[4] = words[4].trim();
                price = Integer.parseInt(words[4]);
                s = "Book:"+title+" by"+author+"("+year+")";
            }
            arr[i] = s;
        }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Hot_Picks = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        ViewAll = new javax.swing.JButton();
        ViewByID = new javax.swing.JButton();
        BorrowersList = new javax.swing.JButton();
        Borrow = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HomePage");
        setBackground(new java.awt.Color(0, 63, 36));
        setResizable(false);

        Menu.setBackground(new java.awt.Color(136, 185, 138));
        Menu.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Menu.setName("Menu"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 33, 33));
        jLabel1.setText("MENU");

        Hot_Picks.setBackground(new java.awt.Color(216, 252, 230));
        Hot_Picks.setLabel("Hot Picks!");
        Hot_Picks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Hot_PicksActionPerformed(evt);
            }
        });

        Add.setBackground(new java.awt.Color(216, 252, 230));
        Add.setText("Add a Book");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Edit.setBackground(new java.awt.Color(216, 252, 230));
        Edit.setText("Edit a Book");
        Edit.setName("Edit an Item"); // NOI18N
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(216, 252, 230));
        Delete.setText("Delete a Book");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        ViewAll.setBackground(new java.awt.Color(216, 252, 230));
        ViewAll.setText("View All Books");
        ViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAllActionPerformed(evt);
            }
        });

        ViewByID.setBackground(new java.awt.Color(216, 252, 230));
        ViewByID.setText("View Book by ID");
        ViewByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewByIDActionPerformed(evt);
            }
        });

        BorrowersList.setBackground(new java.awt.Color(216, 252, 230));
        BorrowersList.setText("View Borrowers List");
        BorrowersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowersListActionPerformed(evt);
            }
        });

        Borrow.setBackground(new java.awt.Color(216, 252, 230));
        Borrow.setText("Borrow a Book");
        Borrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Hot_Picks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ViewByID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BorrowersList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Borrow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addContainerGap(239, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(Hot_Picks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Borrow)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ViewByID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BorrowersList)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        Hot_Picks.getAccessibleContext().setAccessibleName("Hot_Picks");
        Edit.getAccessibleContext().setAccessibleName("Edit an Item");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Menu.getAccessibleContext().setAccessibleName("Menu");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        AddItem add = new AddItem();
        add.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        EditItem edit = new EditItem();
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EditActionPerformed

    private void Hot_PicksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Hot_PicksActionPerformed
        HotPicks hp = new HotPicks();
        hp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Hot_PicksActionPerformed

    private void BorrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowActionPerformed
        Borrow b = new Borrow();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BorrowActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DeleteItem del = new DeleteItem();
        del.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DeleteActionPerformed

    private void ViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAllActionPerformed
        ViewAll view = new ViewAll();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewAllActionPerformed

    private void ViewByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewByIDActionPerformed
        ViewByID vwID = new ViewByID();
        vwID.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewByIDActionPerformed

    private void BorrowersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrowersListActionPerformed
        ViewBorrowersList vwBorr = new ViewBorrowersList();
        vwBorr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BorrowersListActionPerformed
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Borrow;
    private javax.swing.JButton BorrowersList;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton Hot_Picks;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton ViewAll;
    private javax.swing.JButton ViewByID;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
