
package com.ptit.restaurantmanagement.ui;

import com.ptit.restaurantmanagement.dao.EmployeesDao;
import com.ptit.restaurantmanagement.domain.model.Employee;
import com.ptit.restaurantmanagement.domain.model.EmployeeType;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeAddDialog extends javax.swing.JDialog {
    private MainJFrame mainJFrame = new MainJFrame();


    
    
       
    public EmployeeAddDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        mainJFrame = (MainJFrame)parent;
        initComponents();
        
        //To edit dialog center screen.
           Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth() /2 , size.height/2 - getHeight()/2 );
    }
    
    
    public void setTextFields (String name,String DOB, String address, String phone,
                                String type,int managerID, double Salary) {
        TextFieldEmployeeAddName.setText(name);
        TextFieldEmployeeAddDOB.setText(DOB);
        TextFieldEmployeeAddAddress.setText(address);
        TextFieldEmployeeAddPhoneNumber.setText(phone);
        ComboBoxTypeEmployee.setSelectedItem(type);
        TextFieldEmployeeManagerID.setText(String.valueOf(managerID));
        TextFieldEmployeeSalary.setText(String.valueOf(Salary));

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
            java.util.logging.Logger.getLogger(EmployeeAddDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeAddDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmployeeAddDialog dialog = new EmployeeAddDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextFieldEmployeeAddName = new javax.swing.JTextField();
        TextFieldEmployeeAddDOB = new javax.swing.JTextField();
        TextFieldEmployeeAddAddress = new javax.swing.JTextField();
        TextFieldEmployeeAddPhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btEmployeeOK = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ComboBoxTypeEmployee = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        TextFieldEmployeeSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextFieldEmployeeManagerID = new javax.swing.JTextField();
        btEmployeeEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Name:");

        jLabel2.setText("DOB:");

        jLabel3.setText("Address:");

        jLabel4.setText("Phone number:");

        TextFieldEmployeeAddDOB.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add & Edit Employee");

        btEmployeeOK.setText("Add");
        btEmployeeOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmployeeOKActionPerformed(evt);
            }
        });

        jLabel6.setText("Type:");

        ComboBoxTypeEmployee.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Manager", " " }));

        jLabel7.setText("Salary:");

        jLabel8.setText("Manager ID:");

        btEmployeeEdit.setText("Edit");
        btEmployeeEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEmployeeEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(13, 13, 13))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxTypeEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldEmployeeAddDOB)
                            .addComponent(TextFieldEmployeeAddAddress)
                            .addComponent(TextFieldEmployeeAddPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(TextFieldEmployeeAddName)
                            .addComponent(TextFieldEmployeeManagerID)
                            .addComponent(TextFieldEmployeeSalary))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btEmployeeOK, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btEmployeeEdit)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEmployeeAddName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEmployeeAddDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldEmployeeAddAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(TextFieldEmployeeAddPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ComboBoxTypeEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldEmployeeManagerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldEmployeeSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEmployeeOK)
                    .addComponent(btEmployeeEdit))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEmployeeOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmployeeOKActionPerformed
        
        
        String name = TextFieldEmployeeAddName.getText();
        String DOB = TextFieldEmployeeAddDOB.getText();
        String address = TextFieldEmployeeAddAddress.getText();
        String phone = TextFieldEmployeeAddPhoneNumber.getText();
        String type = ComboBoxTypeEmployee.getSelectedItem().toString();
        double salary = Double.parseDouble(TextFieldEmployeeSalary.getText());
        int managerID;
        
        if(TextFieldEmployeeManagerID.getText().equals("")){
            managerID = -1;
        } else {
             managerID = Integer.parseInt(TextFieldEmployeeManagerID.getText());
        }
            
        
        try {
            mainJFrame.addRowEmployee(name,DOB, address, type, phone, managerID, salary);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeAddDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }//GEN-LAST:event_btEmployeeOKActionPerformed

    private void btEmployeeEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEmployeeEditActionPerformed
        int row = mainJFrame.TableEmployee.getSelectedRow();
        
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeAddName.getText(),row, 1);
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeAddDOB.getText(),row, 2);
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeAddAddress.getText(),row, 3);
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeAddPhoneNumber.getText(),row, 4);
        mainJFrame.TableEmployee.setValueAt(ComboBoxTypeEmployee.getSelectedItem(),row, 5);
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeManagerID.getText(),row, 6);
        mainJFrame.TableEmployee.setValueAt(TextFieldEmployeeSalary.getText(),row, 7);
        
        
        String name = TextFieldEmployeeAddName.getText();
        String DOB = TextFieldEmployeeAddDOB.getText();
        Date dobDate;
        Calendar calendar = Calendar.getInstance();
        try {
            dobDate = new SimpleDateFormat("dd-MM-yyyy").parse(DOB);
            calendar.setTime(dobDate);
        } catch (ParseException ex) {
            Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        String address = TextFieldEmployeeAddAddress.getText();
        String phone = TextFieldEmployeeAddPhoneNumber.getText();
        String type = ComboBoxTypeEmployee.getSelectedItem().toString();
        double salary = Double.parseDouble(TextFieldEmployeeSalary.getText());
        int managerID ;
        if(TextFieldEmployeeManagerID.getText().equals("")){
            managerID = -1;
        }
        else{
            managerID = Integer.parseInt(TextFieldEmployeeManagerID.getText());
        }
         Employee employee = new Employee(name, calendar, address, phone, EmployeeType.MANAGER, managerID, salary);
         int id=Integer.parseInt(mainJFrame.TableEmployee.getValueAt(row,0).toString());
         try {
            EmployeesDao employeesDao = new EmployeesDao();
            employeesDao.updateEmployee(employee,id);
                
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeAddDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
       
    }//GEN-LAST:event_btEmployeeEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox ComboBoxTypeEmployee;
    public javax.swing.JTextField TextFieldEmployeeAddAddress;
    public javax.swing.JTextField TextFieldEmployeeAddDOB;
    public javax.swing.JTextField TextFieldEmployeeAddName;
    public javax.swing.JTextField TextFieldEmployeeAddPhoneNumber;
    public javax.swing.JTextField TextFieldEmployeeManagerID;
    public javax.swing.JTextField TextFieldEmployeeSalary;
    private javax.swing.JButton btEmployeeEdit;
    private javax.swing.JButton btEmployeeOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
