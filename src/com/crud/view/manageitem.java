/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.view;

import com.crud.control.dbConnection;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author calvin
 */
public class manageitem extends javax.swing.JFrame {
private Connection connection1;
String s;
    /**
     * Creates new form manageitem
     */
    public manageitem() {
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
        phots = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dept = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stcks1 = new javax.swing.JLabel();
        mpid = new javax.swing.JLabel();
        emID = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bday = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        mi = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        pot = new javax.swing.JTextField();
        gen = new javax.swing.JTextField();
        ots = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        deps = new javax.swing.JComboBox<>();
        adds = new javax.swing.JTextField();
        bp = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        phots.setBackground(new java.awt.Color(0, 153, 153));
        phots.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phots.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(phots, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 110, 350, 330));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Middle initial:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Birthdate:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 80, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Position:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Overtime hours rate:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 620, 170, 40));

        dept.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(dept, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 450, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Basic pay:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 550, 100, 40));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Search:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 50));

        stcks1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        stcks1.setText("Lastname:");
        jPanel1.add(stcks1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 100, 40));

        mpid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(mpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 160, 40));

        emID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emIDActionPerformed(evt);
            }
        });
        emID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emIDKeyReleased(evt);
            }
        });
        jPanel1.add(emID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 440, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Firstname:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 90, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Employee ID:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 120, 40));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Address:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 80, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Gender:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 80, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Employee photo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 480, 220, 30));

        bday.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdayActionPerformed(evt);
            }
        });
        jPanel1.add(bday, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, 180, 40));

        fname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 330, 40));

        mi.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        mi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miActionPerformed(evt);
            }
        });
        jPanel1.add(mi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 110, 40));

        lname.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 330, 40));

        pot.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                potActionPerformed(evt);
            }
        });
        jPanel1.add(pot, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 230, 40));

        gen.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        gen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genActionPerformed(evt);
            }
        });
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 160, 40));

        ots.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        ots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otsActionPerformed(evt);
            }
        });
        jPanel1.add(ots, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 620, 290, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Department:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 100, 40));

        deps.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        deps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Production","Human-Resource management","Logistics","Research and development","Purchasing","Marketing"}));
        jPanel1.add(deps, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 520, 40));

        adds.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        adds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsActionPerformed(evt);
            }
        });
        jPanel1.add(adds, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 390, 40));

        bp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        bp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpActionPerformed(evt);
            }
        });
        jPanel1.add(bp, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, 290, 40));

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 720, 230, 40));

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 720, 230, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 820));

        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emIDActionPerformed

    
    
    private void emIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emIDKeyReleased
       PreparedStatement pst;
       ResultSet rs;
       byte[] imagedata=null;
        try{
            dbConnection dbConnect = dbConnection.getdbConnection();
       connection1 = dbConnect.getConnection();
            String sql ="select * from employee where empno="+emID.getText();

            pst=connection1.prepareStatement(sql);
           
            rs=pst.executeQuery();
            if(rs.next()){
                String add1 =rs.getString(1);
                mpid.setText(add1);

                String add2 =rs.getString(3);
                fname.setText(add2);

                String add3 =rs.getString(4);
                mi.setText(add3);

                String add4 =rs.getString(5);
                lname.setText(add4);

                String add5 =rs.getString(6);
                bday.setText(add5);

                String add6 =rs.getString(7);
                adds.setText(add6);

                String add7 =rs.getString(8);
                gen.setText(add7);

                String add8 =rs.getString(9);
                dept.setText(add8);
                
                String add9 =rs.getString(11);
                bp.setText(add9);
                
                String add10 =rs.getString(12);
                ots.setText(add10);

                String add11 =rs.getString(10);
                pot.setText(add11);
                
        
            
            imagedata=rs.getBytes("photo");
            Image img=Toolkit.getDefaultToolkit().createImage(imagedata);
            ImageIcon icon=new ImageIcon(img);
           
                
        Image imge = icon.getImage();
        Image newImg = imge.getScaledInstance(phots.getWidth(), phots.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
  
            
            
            phots.setIcon(image);
            
            
            
        
            }
        }catch (SQLException ex) {
        Logger.getLogger(manageitem.class.getName()).log(Level.SEVERE, null, ex);
    }
        
 
       
           
    
       
    }//GEN-LAST:event_emIDKeyReleased

    private void bdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdayActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void miActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void potActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_potActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_potActionPerformed

    private void genActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genActionPerformed

    private void otsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_otsActionPerformed

    private void addsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addsActionPerformed

    private void bpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bpActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?","Update Record",JOptionPane.YES_NO_OPTION);
        if(p==0){
             PreparedStatement pst;
             ResultSet rs;
             byte[] imagedata=null;
                 dbConnection dbConnect = dbConnection.getdbConnection();
       connection1 = dbConnect.getConnection();
            try{
              

                String sql= "update employee set firstname='"+fname.getText()+"',MI='"+mi.getText()+"',lastname='"+lname.getText()+"',birthday='"+bday.getText()+"',Address='"+adds.getText()+"',Position='"+pot.getText()+"',Department='"+deps.getSelectedItem()+"',Dailypay="+bp.getText()+",Otpay="+ots.getText()+",Gender='"+gen.getText()+"' where empno="+mpid.getText();
                pst=connection1.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Record Updated");
                
                String sqls ="select * from employee where empno="+emID.getText();

            pst=connection1.prepareStatement(sqls);
           
            rs=pst.executeQuery();
            if(rs.next()){
                String add1 =rs.getString(1);
                mpid.setText(add1);

                String add2 =rs.getString(3);
                fname.setText(add2);

                String add3 =rs.getString(4);
                mi.setText(add3);

                String add4 =rs.getString(5);
                lname.setText(add4);

                String add5 =rs.getString(6);
                bday.setText(add5);

                String add6 =rs.getString(7);
                adds.setText(add6);

                String add7 =rs.getString(8);
                pot.setText(add7);

                String add8 =rs.getString(9);
                dept.setText(add8);
                
                String add9 =rs.getString(10);
                bp.setText(add9);
                
                String add10 =rs.getString(11);
                ots.setText(add10);

                String add11 =rs.getString(12);
                gen.setText(add11);
                
        
            
            imagedata=rs.getBytes("photo");
            Image img=Toolkit.getDefaultToolkit().createImage(imagedata);
            ImageIcon icon=new ImageIcon(img);
           
                
        Image imge = icon.getImage();
        Image newImg = imge.getScaledInstance(phots.getWidth(), phots.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
  
            
            
            phots.setIcon(image);
            
            } 
                
                
             }catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"Warning one of your input is invalid");
    }
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete record?","Delete",JOptionPane.YES_NO_OPTION);
        if(p==0){
       PreparedStatement pst;
            dbConnection dbConnect = dbConnection.getdbConnection();
       connection1 = dbConnect.getConnection();
            try{
                
                String sql ="delete from employee where empno =?";
                pst=connection1.prepareStatement(sql);
                pst.setString(1, mpid.getText());
                pst.execute();

            }catch (SQLException ex) {
        Logger.getLogger(manageitem.class.getName()).log(Level.SEVERE, null, ex);
    }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
         this.setVisible(false);
    new Menu().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(manageitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageitem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageitem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adds;
    private javax.swing.JTextField bday;
    private javax.swing.JTextField bp;
    private javax.swing.JComboBox<String> deps;
    private javax.swing.JLabel dept;
    private javax.swing.JTextField emID;
    private javax.swing.JTextField fname;
    private javax.swing.JTextField gen;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mi;
    private javax.swing.JLabel mpid;
    private javax.swing.JTextField ots;
    private javax.swing.JLabel phots;
    private javax.swing.JTextField pot;
    public javax.swing.JLabel stcks1;
    // End of variables declaration//GEN-END:variables
}