package com.Travel;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMenuScreen extends javax.swing.JFrame {
    public MainMenuScreen() {
        initComponents();
        //===========
        Color backgroundcolor =new Color(200,204,255);
        this.getContentPane().setBackground(backgroundcolor);
        setVisible(true);
        setResizable(false);
        //===========
        ClockDisplay();
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblflightbooking = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();
        imgflight = new javax.swing.JLabel();
        imghotel = new javax.swing.JLabel();
        flightimg = new javax.swing.JLabel();
        hotelimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(850, 550));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        lblflightbooking.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblflightbooking.setForeground(new java.awt.Color(51, 0, 255));
        lblflightbooking.setText("Click here for Flight Booking");
        lblflightbooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblflightbookingMouseClicked(evt);
            }
        });

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Click here for Hotel Booking");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldate.setText("Date");

        lbltime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbltime.setText("Time");

        imgflight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgflightMouseClicked(evt);
            }
        });

        imghotel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imghotelMouseClicked(evt);
            }
        });

        flightimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Viraj\\Desktop\\NetBeans_Project\\flight.jpg")); // NOI18N
        flightimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                flightimgMouseClicked(evt);
            }
        });

        hotelimg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Viraj\\Desktop\\NetBeans_Project\\hotel.jpg")); // NOI18N
        hotelimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotelimgMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(imgflight))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblflightbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(flightimg))))
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imghotel)
                        .addGap(18, 18, 18)
                        .addComponent(hotelimg))
                    .addComponent(jLabel3))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltime)
                            .addComponent(lbldate))
                        .addGap(14, 14, 14)))
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(82, 82, 82))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(imgflight)
                            .addComponent(imghotel, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(flightimg)
                            .addComponent(hotelimg, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblflightbooking, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addComponent(lbldate)
                .addGap(31, 31, 31)
                .addComponent(lbltime)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblflightbookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblflightbookingMouseClicked
        try {
            FlightBooking fb =new FlightBooking();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lblflightbookingMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        HotelBooking hb=new HotelBooking();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            FlightBooking fb=new FlightBooking();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        HotelBooking hb=new HotelBooking();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void imgflightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgflightMouseClicked
        try {
            FlightBooking fb =new FlightBooking();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imgflightMouseClicked

    private void imghotelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imghotelMouseClicked
        HotelBooking hb=new HotelBooking();
    }//GEN-LAST:event_imghotelMouseClicked

    private void flightimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_flightimgMouseClicked
        try {
            FlightBooking fb = new FlightBooking();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_flightimgMouseClicked

    private void hotelimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotelimgMouseClicked
        HotelBooking hb=new HotelBooking();
    }//GEN-LAST:event_hotelimgMouseClicked
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
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel flightimg;
    private javax.swing.JLabel hotelimg;
    private javax.swing.JLabel imgflight;
    private javax.swing.JLabel imghotel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblflightbooking;
    private javax.swing.JLabel lbltime;
    // End of variables declaration//GEN-END:variables

    private void ClockDisplay()
    {
        Calendar cal=new GregorianCalendar();
        int month = cal.get(Calendar.MONTH);
        int date = cal.get(Calendar.DATE);
        int year = cal.get(Calendar.YEAR);
        lbldate.setText("DATE :"+date+"/"+(month+1)+"/"+year);
        //=======================================================
        
        Thread clocktime =new Thread()
        {
        public void run()
        {
            while(true)
            {
            Calendar c=new GregorianCalendar();
            int hrs = c.get(Calendar.HOUR);
            int min = c.get(Calendar.MINUTE);
            int sec = c.get(Calendar.SECOND);
            lbltime.setText("Time:"+hrs+":"+min+":"+sec);
            try
            {
                sleep(1000);
            }
            catch(InterruptedException ex)
            {
                Logger.getLogger(MainMenuScreen.class.getName()).log(Level.SEVERE,null,ex);
            }
        }
        }
    };
        clocktime.start();
}
}
