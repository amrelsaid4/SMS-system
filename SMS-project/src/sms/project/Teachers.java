/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sms.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static sms.project.Students.password;
import static sms.project.Students.url;
import static sms.project.Students.username;

/**
 *
 * @author Mohamed Ashraf
 */
public class Teachers extends javax.swing.JFrame {

    int counter = 0;

    /**
     * Creates new form Teachers
     */
    public Teachers() {
        initComponents();
        updateValues();
        updateValues();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrowBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        salary = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        subject = new javax.swing.JComboBox<>();
        add = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arrowBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sms/project/images/backarrow.png"))); // NOI18N
        arrowBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arrowBackMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Salary");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Subject");

        subject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        subject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arabic", "English", "French", "Math","Physics","Computer" }));

        add.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });

        id.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        id.setText("ID");
        id.setToolTipText("");
        id.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                idFocusLost(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        delete.setText("Remove");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Subject", "Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(arrowBack, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(salary)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(add)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(arrowBack, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(subject, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(add)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delete)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void arrowBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arrowBackMouseClicked
        // TODO add your handling code here:
        MainFrame main = new MainFrame();
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setVisible(true);
        dispose();
    }//GEN-LAST:event_arrowBackMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement statement = connection.prepareStatement("DELETE FROM teacher WHERE id = ?")) {
            int idValue = 0;
            if (!"ID".equals(id.getText())) {
                if (Integer.parseInt(id.getText()) <= counter) {
                    idValue = Integer.parseInt(id.getText());
                } else {
                    JOptionPane.showMessageDialog(this, "Enter Valid ID");
                    return;
                }
            } else {
                JOptionPane.showMessageDialog(this, "Enter Valid ID");
                return;
            }
            statement.setInt(1, idValue); // Set the ID for the WHERE clause
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Data deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Error deleting data.");
            }
            updateValues();
            updateValues();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_deleteMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        // TODO add your handling code here:
        String nameValue = name.getText();
        String subjectValue = subject.getSelectedItem().toString();
        int salaryValue = Integer.parseInt(salary.getText());
        try (Connection connection = DriverManager.getConnection(url, username, password); PreparedStatement statement = connection.prepareStatement("INSERT INTO teacher (name, salary,subject) VALUES (?, ?,?)")) {
            statement.setString(1, nameValue);
            statement.setInt(2, salaryValue);
            statement.setString(3, subjectValue);
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected == 1) {
                System.out.println("Data inserted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Error inserting data.");
            }
            updateValues();
            updateValues();
        } catch (SQLException e) {
        }
    }//GEN-LAST:event_addMouseClicked

    private void idFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusGained
        // TODO add your handling code here:
        if ("ID".equals(id.getText())) {
            id.setText("");
        }
    }//GEN-LAST:event_idFocusGained

    private void idFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idFocusLost
        // TODO add your handling code here:
        if ("".equals(id.getText())) {
            id.setText("ID");
        }
    }//GEN-LAST:event_idFocusLost
    private void updateValues() {
        counter = 0;
        int idValue = 0;
        String nameValue = "";
        double salValue = 0;
        String subValue = "";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (Connection connection = DriverManager.getConnection(url, username, password); Statement statement = connection.createStatement()) {
            ResultSet res = statement.executeQuery("select * from teacher");
            while (res.next()) {
                idValue = res.getInt("id");
                nameValue = res.getString("name");
                salValue = res.getInt("salary");
                subValue = res.getString("subject");
                model.addRow(new Object[]{idValue, nameValue, subValue, salValue});
                counter++;
            }
            statement.execute("SET foreign_key_checks = 0");
            statement.executeUpdate("SET @new_id := 0");
            statement.executeUpdate("UPDATE teacher SET id = @new_id := @new_id + 1");
            statement.execute("SET foreign_key_checks = 1");
            statement.close();
            connection.close();
        } catch (SQLException e) {
        }
    }

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
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teachers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Teachers().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton arrowBack;
    private javax.swing.JButton delete;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField salary;
    private javax.swing.JComboBox<String> subject;
    // End of variables declaration//GEN-END:variables
}
