package com.mycompany.scd_assignment_3.SCD_A3;
import javax.swing.JButton;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.TableCellEditor;

public class ViewAll extends javax.swing.JFrame {
    static final int arraySize = 100;
    public static int rowCount;
    public static String [] Array = new String[100];
    public static int Index = 0;
    public static int ID = 0;
    public ViewAll() {
        initComponents();
        loader();
        addRowToJTable();
    }
        private void loader(){
            Array = new String[100];
            Index = 0;
            String fileName = "data.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null && Index < arraySize) {
                Array[Index] = line;
                Index++;
            }
            System.out.println("\nLoaded items from file \""+fileName+"\"");
        } catch (IOException e) {
            System.out.println("Loading error");
            JOptionPane.showMessageDialog(null, "Loading error", "Error", JOptionPane.ERROR_MESSAGE);
        }
        }
    public static void saveFile(){
        ID = 0;
        String filePath = "data.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("");
            for (int i = 0; i<Index; i++) {
                String line = Array[i];
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File updated.");
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            JOptionPane.showMessageDialog(null, "An error occurred while writing to the file", "Error", JOptionPane.ERROR_MESSAGE);}
    }
    class ButtonEditor extends AbstractCellEditor implements TableCellEditor {
    private final JButton button;
    private int id;
    public ButtonEditor() {
        button = new JButton("Read Now");
        button.addActionListener((ActionEvent e) -> {
            Read rd = new Read(id);
            rd.setVisible(true);
            setVisible(false);
            updatePopCount(id-1);
            fireEditingStopped();
        });
    }
    public void updatePopCount(int id){
        String words = ViewAll.Array[id]; 
        String [] arr = words.split(",");
        arr[0] = arr[0].trim();
        String title = arr[0];
        arr[1] = arr[1].trim();
        String author = arr[1];
        arr[2] = arr[2].trim();
        String year = arr[2];
        arr[3] = arr[3].trim();
        int popularityCount = Integer.parseInt(arr[3]) + 1;
        arr[4] = arr[4].trim();
        String price = arr[4];
        String book = title+", "+author+", "+year+", "+popularityCount+", "+price;
        ViewAll.Array[id] = book;
    }
    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        id = row+1;
        return button;
    }
    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
    class ButtonRenderer extends DefaultTableCellRenderer {
    private final JButton button;
    public ButtonRenderer() {
        button = new JButton("Read Now");
    }
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return button;
    }
    }
    private void addRowToJTable(){
        rowCount = 0;
        DefaultTableModel model = (DefaultTableModel) Books.getModel();
        Object rows[] = new Object[100];
        String []array = new String[Index];
        for (int i = 0; i<Index; i++){
            array[i] = Array[i];
        }
        for (int i = 0; i<array.length; i++){
            String words = array[i]; 
            String [] arr = words.split(",");
            rows[0] = ++ID;
            rows[1] = arr[0];
            rows[2] = arr[1];
            rows[3] = arr[2];
            rows[4] = arr[3];
            rows[5] = arr[4];
            int readBookColumnIndex = 6;
            Books.getColumnModel().getColumn(readBookColumnIndex).setCellRenderer(new ButtonRenderer());
            Books.getColumnModel().getColumn(readBookColumnIndex).setCellEditor(new ButtonEditor());
            model.addRow(rows);
            rowCount++;
        }        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Books = new javax.swing.JTable();
        View_Popularity = new javax.swing.JButton();
        ViewByID = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Edit = new javax.swing.JButton();
        Add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ViewAllItems");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(136, 185, 138));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 420));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 51, 51), new java.awt.Color(0, 102, 102)));

        Books.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Year", "Popularity Count", "Price", "Read Book"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Books.setToolTipText("Read");
        Books.setAutoscrolls(false);
        Books.setMaximumSize(new java.awt.Dimension(250, 0));
        Books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BooksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BooksMouseExited(evt);
                RowMouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(Books);
        if (Books.getColumnModel().getColumnCount() > 0) {
            Books.getColumnModel().getColumn(0).setResizable(false);
            Books.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        View_Popularity.setBackground(new java.awt.Color(216, 252, 230));
        View_Popularity.setText("View Popularity");
        View_Popularity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                View_PopularityActionPerformed(evt);
            }
        });

        ViewByID.setBackground(new java.awt.Color(216, 252, 230));
        ViewByID.setText("View Book by ID");
        ViewByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewByIDActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(216, 252, 230));
        Delete.setText("Delete a Book");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
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

        Add.setBackground(new java.awt.Color(216, 252, 230));
        Add.setText("Add a Book");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(View_Popularity, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ViewByID, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(View_Popularity)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Edit)
                    .addComponent(Add)
                    .addComponent(Delete)
                    .addComponent(ViewByID))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void View_PopularityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_View_PopularityActionPerformed
        PopularityBarChart pbc = new PopularityBarChart();
        pbc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_View_PopularityActionPerformed

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

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DeleteItem del = new DeleteItem();
        del.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_DeleteActionPerformed

    private void ViewByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewByIDActionPerformed
        ViewByID vwID = new ViewByID();
        vwID.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ViewByIDActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        Books.addMouseListener(new java.awt.event.MouseAdapter() {
        Color color = Books.getBackground();
        @Override
        public void mouseEntered(java.awt.event.MouseEvent evt) {
        int row = Books.rowAtPoint(evt.getPoint());
        Books.setRowSelectionInterval(row, row);
        Books.setSelectionBackground(new Color(204,204,255));
        Books.setSelectionForeground(Color.BLACK);
        }
        @Override
        public void mouseExited(java.awt.event.MouseEvent evt) {
        Books.setSelectionBackground(color);
        }
    });
    }//GEN-LAST:event_formMouseEntered

    private void BooksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_BooksMouseEntered

    private void BooksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BooksMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BooksMouseExited

    private void RowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RowMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_RowMouseEntered

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
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTable Books;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Edit;
    private javax.swing.JButton ViewByID;
    private javax.swing.JButton View_Popularity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
