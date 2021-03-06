/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MyTitanPlayerGUI;

import java.util.List;
import javax.management.Query;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import mytitanplayer.util.HibernateUtil;
import com.mytitanplayer.bll.Library;
import com.mytitanplayer.bll.Users;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Rocky
 */
public class logIn extends javax.swing.JFrame {

    /**
     * Creates new form logIn
     */
    public logIn() {
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

        logInLabel1 = new javax.swing.JLabel();
        logInUserIDLabel = new javax.swing.JLabel();
        logInPasswordLabel = new javax.swing.JLabel();
        logInUserID = new javax.swing.JTextField();
        logInPassword = new javax.swing.JPasswordField();
        logInLabel2 = new javax.swing.JLabel();
        logInButton = new javax.swing.JButton();
        signUpButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(6, 20));

        logInLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logInLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInLabel1.setText("Enter User ID and Password to Log in:");

        logInUserIDLabel.setText("User ID:");

        logInPasswordLabel.setText("Password:");

        logInPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInPasswordActionPerformed(evt);
            }
        });

        logInLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        logInLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logInLabel2.setText("Haven't Created Your ID Yet?");

        logInButton.setText("Log In");
        logInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInButtonActionPerformed(evt);
            }
        });

        signUpButton.setText("Sign Up");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TitanPlayer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(logInUserIDLabel)
                                        .addComponent(logInPasswordLabel))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(logInUserID, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                        .addComponent(logInPassword)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(logInButton)
                                    .addGap(37, 37, 37))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(signUpButton)
                                    .addGap(31, 31, 31)))
                            .addComponent(logInLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 30, Short.MAX_VALUE))
                    .addComponent(logInLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(logInLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logInUserIDLabel)
                    .addComponent(logInUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logInPasswordLabel)
                    .addComponent(logInPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(logInButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(logInLabel2)
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        // TODO add your handling code here:
        new NewUser().setVisible(true);
        
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInButtonActionPerformed
        // TODO add your handling code here:
        String enteredUserID = logInUserID.getText();
        String userPass = new String(logInPassword.getPassword());
        boolean passwordOk = false;
        Users checkUser = new Users();
        
        String userIdQuery = "SELECT userid FROM Users where userid = ";
        //String userIDQuery = checkUser.
        String pwdQuery = "SELECT password FROM Users where userId = ";
        List queryResultsId = executeHQLQuery(userIdQuery +"'"+enteredUserID+"'");
        List queryResultsPwd = executeHQLQuery(pwdQuery +"'"+enteredUserID+"'");
        //List queryResults = executeHQLQuery(userQuery);
        
        
        if(!queryResultsId.isEmpty()){
            System.out.println(queryResultsId.get(0));
            System.out.println(queryResultsPwd.get(0));
            
            String encUserPass = crypt(userPass);
            System.out.println("Encrypted password entered = " + encUserPass);
            
            passwordOk = validatePassword(queryResultsPwd.get(0).toString(), encUserPass);
            if(!passwordOk){
                System.out.println("Password entered is invalid!");
            } else {
                new PlayerGUI(enteredUserID).setVisible(true);
                dispose();
            }
        } else {
            System.out.println("UserID " + enteredUserID + " Does Not Exist!");
            new NewUser().setVisible(true);
            
        }
        
            
    }//GEN-LAST:event_logInButtonActionPerformed

    private void logInPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logInPasswordActionPerformed

    private List executeHQLQuery(String hql) {
        List resultList = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
                org.hibernate.Query q = session.createQuery(hql);
                //org.hibernate.Query q = session.getNamedQuery("findByUserID")
                //        .setString("userid","Terry");
                        
            resultList = q.list();
            //displayResult(resultList);
            session.getTransaction().commit();
            return resultList;
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new logIn().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logInLabel1;
    private javax.swing.JLabel logInLabel2;
    private javax.swing.JPasswordField logInPassword;
    private javax.swing.JLabel logInPasswordLabel;
    private javax.swing.JTextField logInUserID;
    private javax.swing.JLabel logInUserIDLabel;
    private javax.swing.JButton signUpButton;
    // End of variables declaration//GEN-END:variables

    private boolean validatePassword(String userPass, String userPass1) {
        boolean passwordOk = false;
       
        if(userPass.equals(userPass1)){
            passwordOk = true;
        } else {
            passwordOk = false;
        }
        return passwordOk;
    }
    
    public static String crypt(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException(
                    "String to encrypt cannot be null or zero length");
        }

        StringBuffer hexString = new StringBuffer();

        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());
            byte[] hash = md.digest();

            for (int i = 0; i < hash.length; i++) {
                if ((0xff & hash[i]) < 0x10) {
                    hexString.append("0"
                         + Integer.toHexString((0xFF & hash[i])));
                } else {
                    hexString.append(Integer.toHexString(0xFF & hash[i]));
                }
            }
        } catch (NoSuchAlgorithmException e) {

        }

        return hexString.toString();
    }
}
