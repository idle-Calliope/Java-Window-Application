 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Citizen;

// @author : 1923636 Ellaine Fontamillas

import AllUsers.LoginForm;
import AllUsers.MainForm;
import AllUsers.UserClass;
import AllUsers.UserDB;
import java.sql.Date;
import javax.swing.JOptionPane;

public class CitizenRegisterForm extends javax.swing.JFrame {

    public static CitizenRegisterForm rf = new CitizenRegisterForm();
    public static MainForm mf = new MainForm();
    /**
     * Creates new form Register
     */
    public CitizenRegisterForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblREGISTER = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblPassportID = new javax.swing.JLabel();
        lblSurname = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblEducation = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        txtPassportID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtSurname = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAddress = new javax.swing.JTextArea();
        txtCity = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblReturnToLogin = new javax.swing.JButton();
        txtPhoneNumber = new javax.swing.JTextField();
        txtQualification = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        btnGoBack = new javax.swing.JButton();
        dcDOB = new com.toedter.calendar.JDateChooser();
        chcGender = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Form - Lesotho Government Feedback Services");
        setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblREGISTER.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblREGISTER.setForeground(new java.awt.Color(255, 255, 255));
        lblREGISTER.setText("REGISTRATION FORM");

        lblName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");

        lblPassportID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassportID.setForeground(new java.awt.Color(255, 255, 255));
        lblPassportID.setText("*Passport ID");

        lblSurname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblSurname.setForeground(new java.awt.Color(255, 255, 255));
        lblSurname.setText("Surname");

        lblAddress.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Physical Address");

        lblPhoneNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneNumber.setText("Phone Number");

        lblDateOfBirth.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblDateOfBirth.setForeground(new java.awt.Color(255, 255, 255));
        lblDateOfBirth.setText("Date of Birth");

        lblGender.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblGender.setForeground(new java.awt.Color(255, 255, 255));
        lblGender.setText("Gender");

        lblNationality.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNationality.setForeground(new java.awt.Color(255, 255, 255));
        lblNationality.setText("Nationality");

        lblEducation.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEducation.setForeground(new java.awt.Color(255, 255, 255));
        lblEducation.setText("Educational Qualification");

        lblPassword.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("Password");

        lblCity.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCity.setForeground(new java.awt.Color(255, 255, 255));
        lblCity.setText("City");

        txtAreaAddress.setColumns(20);
        txtAreaAddress.setRows(5);
        jScrollPane1.setViewportView(txtAreaAddress);

        btnRegister.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        lblReturnToLogin.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblReturnToLogin.setText("Already have an account? Login");
        lblReturnToLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblReturnToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblReturnToLoginActionPerformed(evt);
            }
        });

        btnGoBack.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnGoBack.setText("Go Back");
        btnGoBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        chcGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select your gender", "Female", "Male" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblSurname)
                                        .addComponent(lblNationality)
                                        .addComponent(lblPhoneNumber)
                                        .addComponent(lblAddress)
                                        .addComponent(lblCity)
                                        .addComponent(lblName)
                                        .addComponent(lblPassportID)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEducation, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblGender))
                                        .addComponent(lblPassword)
                                        .addComponent(lblDateOfBirth))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dcDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(chcGender, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtQualification, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNationality, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PasswordField)
                                    .addComponent(txtPassportID)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblReturnToLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(59, 59, 59))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblREGISTER)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblREGISTER)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassportID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassportID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSurname)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNationality)
                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNumber)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(lblAddress)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtQualification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(chcGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDateOfBirth)
                    .addComponent(dcDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnRegister)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblReturnToLogin)
                    .addComponent(btnGoBack))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private static boolean validateString(String string) {
        char ch;
        boolean hasUpper = false;
        boolean hasNum = false;
        for(int i=0;i < string.length();i++) {
            ch = string.charAt(i);
            if( Character.isDigit(ch)) {
                hasNum = true;
            }
            else if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } 
            
            if(hasNum && hasUpper)
                return true;
        }
        return false;
    }

    
    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        try
        {                    
            int Phone = Integer.parseInt(txtPhoneNumber.getText());
            Date DOB = new Date(this.dcDOB.getDate().getTime());
            String dob = DOB.toString();
            
            String PID = txtPassportID.getText()
                 , Name = txtName.getText()
                 , Surname = txtSurname.getText()
                 , Nationality = txtNationality.getText()
                 , Address = txtAreaAddress.getText()
                 , City = txtCity.getText()
                 , Gender = chcGender.getSelectedItem().toString()
                 , Qualification = txtQualification.getText()
                 , Type = "citizen" // only citizen registers by default
                 , Password = new String(PasswordField.getPassword());
            
            char gender = Gender.charAt(0); // convert gender to char
            boolean pid = false,pwd = false;
            // validate length and charcters of password and passport no
                pid = validateString(PID);
                pwd = validateString(Password);
                
            if( ( PID.length() == 8 ) && ( txtPhoneNumber.getText().length() == 8 ) && ( Password.length() == 8 ) )    
            {
               if((pid == true && pwd == true))
                {
                    UserClass ud = new UserClass(PID, Name, Surname, Nationality, Phone, Address, City, dob, gender, Qualification,Type,Password);
                    UserDB.UserRegistration(ud);
                }
                else
                   JOptionPane.showMessageDialog(null,"Your passport no. and password need to be alphanumerical, where at least one letter is Uppercased","Error Message",JOptionPane.ERROR_MESSAGE);      
            }
            else {
                JOptionPane.showMessageDialog(null,"Your passport no. ,password and phone no. need to be 8 characters long","Error Message",JOptionPane.ERROR_MESSAGE);      
                rf.setVisible(true);
            }
            
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Please make sure the form is filled\nAnd your values are valid","Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        int input = JOptionPane.showConfirmDialog(null, "Are you sure you want to leave this page?\nYour progress may be lost","Confirm Message",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(input == 0)
        {
            this.setVisible(false);
            mf.setVisible(true);    
        }
        else 
            JOptionPane.showMessageDialog(null, "You have opted to not to go  out");     
    }//GEN-LAST:event_btnGoBackActionPerformed

    private void lblReturnToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblReturnToLoginActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginForm lf = new LoginForm();
        lf.setVisible(true);
    }//GEN-LAST:event_lblReturnToLoginActionPerformed

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
            java.util.logging.Logger.getLogger(CitizenRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CitizenRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CitizenRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CitizenRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                rf.setVisible(true);
                rf.setResizable(false);
                
                rf.txtQualification.setText("e.g., Diploma, BSc, BA, MA, PhD,etc");
                rf.txtPhoneNumber.setText("*Please enter an 8-digit phone number");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> chcGender;
    private com.toedter.calendar.JDateChooser dcDOB;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblEducation;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblPassportID;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblREGISTER;
    private javax.swing.JButton lblReturnToLogin;
    private javax.swing.JLabel lblSurname;
    private javax.swing.JTextArea txtAreaAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPassportID;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtQualification;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
