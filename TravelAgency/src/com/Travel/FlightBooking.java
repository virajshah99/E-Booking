package com.Travel;

import com.model.dbaseAccount;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;

public class FlightBooking extends javax.swing.JFrame {
    
    ResultSet rs,rs1;
    
    public FlightBooking() throws ClassNotFoundException, SQLException {
        initComponents();
        
        //============
        Color backgroundcolor =new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);

        fillcombobox();
        Date d = new Date();
        departuredate.setDate(d);
        int x=d.getDate();
        x+=1;
        d.setDate(x);
        returndate.setDate(d);
        
        
        
        setVisible(true);
        setResizable(false);
        //============
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbltitle = new javax.swing.JLabel();
        radiooneway = new javax.swing.JRadioButton();
        radioreturn = new javax.swing.JRadioButton();
        lblsource = new javax.swing.JLabel();
        lbldestination = new javax.swing.JLabel();
        lbldeparturedate = new javax.swing.JLabel();
        lblreturndate = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        btnconfirmbooking = new javax.swing.JButton();
        cmborigin = new javax.swing.JComboBox<>();
        cmbdestination = new javax.swing.JComboBox<>();
        departuredate = new com.toedter.calendar.JDateChooser();
        returndate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(850, 520));

        lbltitle.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(255, 51, 51));
        lbltitle.setText("Lets Select the best flight for YOU!");

        radiooneway.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        radiooneway.setText("One Way");
        radiooneway.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioonewayMouseClicked(evt);
            }
        });

        radioreturn.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        radioreturn.setText("Return");
        radioreturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                radioreturnMouseClicked(evt);
            }
        });

        lblsource.setText("City of Origin");

        lbldestination.setText("Destination");

        lbldeparturedate.setText("Departure Date");

        lblreturndate.setText("Return Date");

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        btnconfirmbooking.setText("Confirm Booking");

        cmborigin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmborigin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbdestination.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbdestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radiooneway)
                        .addGap(46, 46, 46)
                        .addComponent(radioreturn))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnconfirmbooking, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                        .addComponent(btncancel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsearch, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblsource)
                            .addComponent(lbldestination)
                            .addComponent(lbldeparturedate)
                            .addComponent(lblreturndate))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmborigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departuredate, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(returndate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(371, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbltitle)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radiooneway)
                            .addComponent(radioreturn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblsource)
                            .addComponent(cmborigin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbldestination)
                            .addComponent(cmbdestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(lbldeparturedate))
                    .addComponent(departuredate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblreturndate)
                    .addComponent(returndate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnsearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancel)
                .addGap(37, 37, 37)
                .addComponent(btnconfirmbooking)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioonewayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioonewayMouseClicked
        radioreturn.setEnabled(false);
    }//GEN-LAST:event_radioonewayMouseClicked

    private void radioreturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_radioreturnMouseClicked
         radiooneway.setEnabled(false);
    }//GEN-LAST:event_radioreturnMouseClicked

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        this.dispose();
    }//GEN-LAST:event_btncancelMouseClicked
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
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FlightBooking().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                } catch (SQLException ex) {
                    Logger.getLogger(FlightBooking.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnconfirmbooking;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbdestination;
    private javax.swing.JComboBox<String> cmborigin;
    private com.toedter.calendar.JDateChooser departuredate;
    private javax.swing.JLabel lbldeparturedate;
    private javax.swing.JLabel lbldestination;
    private javax.swing.JLabel lblreturndate;
    private javax.swing.JLabel lblsource;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JRadioButton radiooneway;
    private javax.swing.JRadioButton radioreturn;
    private com.toedter.calendar.JDateChooser returndate;
    // End of variables declaration//GEN-END:variables

    private void fillcombobox() throws ClassNotFoundException, SQLException
    {
        cmborigin.removeAllItems();
        cmbdestination.removeAllItems();
        
        dbaseAccount dba =new dbaseAccount();
        rs = dba.getSourceCity();
        while(rs.next()==true)
        {
        cmborigin.addItem(rs.getString("source"));            
        }
        rs1 = dba.getDestinationCity();
        while(rs1.next()==true)
        {
        cmbdestination.addItem(rs1.getString("destination"));            
        }
    }
    
}
