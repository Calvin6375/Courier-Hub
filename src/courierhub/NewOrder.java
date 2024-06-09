package courierhub;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class NewOrder extends javax.swing.JFrame {

    public NewOrder() {
        initComponents();
        int weight=jWeight.getSelectedIndex();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSname = new javax.swing.JTextField();
        jRname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSaddress = new javax.swing.JTextField();
        jRaddress = new javax.swing.JTextField();
        jSemail = new javax.swing.JTextField();
        jRemail = new javax.swing.JTextField();
        jSnumber = new javax.swing.JTextField();
        jRnumber = new javax.swing.JTextField();
        jScounty = new javax.swing.JTextField();
        jRcounty = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jWeight = new javax.swing.JComboBox<>();
        jRate = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jType = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/courierhub/parcel-packing copy.jpg"))); // NOI18N

        jLabel2.setText("SENDER");

        jLabel3.setText("RECIVER");

        jLabel4.setText("NAME");

        jLabel5.setText("PICK UP/ DROP OFF ADDRESS");

        jLabel6.setText("EMAIL");

        jLabel7.setText("PHONE NUMBER ");

        jLabel8.setText("COUNTY");

        jLabel9.setText("PARCEL TYPE");

        jLabel10.setText("WEIGHT");

        jLabel11.setText("RATE");

        jWeight.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 to 5 Kg", "5 to10 Kg", "10 to 15kg", "15 to 20 Kg", "20 to 30 Kg", "Over 30 Kg" }));
        jWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jWeightActionPerformed(evt);
            }
        });

        jRate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Premium 2 Dys", "Gold 3 Dys", "Silver 5 Dys", "Bronze 9 Dys", " " }));
        jRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRateActionPerformed(evt);
            }
        });

        jButton1.setText("FINISH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("CLEAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTypeActionPerformed(evt);
            }
        });

        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(106, 106, 106)))
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRate, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(233, 233, 233)
                                    .addComponent(jButton3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSname, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSemail, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScounty, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jType, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(89, 89, 89)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jRname)
                                        .addComponent(jRaddress)
                                        .addComponent(jRemail)
                                        .addComponent(jRnumber)
                                        .addComponent(jRcounty, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jSaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jSemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jSnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRnumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jScounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRcounty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTypeActionPerformed
        
    }//GEN-LAST:event_jTypeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        
        try{           
            String SName=jSname.getText();
            String SAddress=jSaddress.getText();
            String SEmail=jSemail.getText();
            String SNumber=jSnumber.getText();
            String SCounty=jScounty.getText();
            String RName=jRname.getText();
            String RAddress=jRaddress.getText();
            String REmail=jRemail.getText();
            String RNumber=jRnumber.getText();
            String RCounty=jRcounty.getText();
            String Type=jType.getText();
            String wgt;
            wgt = (String) jWeight.getSelectedItem();
            String rate;
            rate = (String) jRate.getSelectedItem();            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/courier","root","");            
            PreparedStatement ps=con.prepareStatement ("insert into neworder(SenderName,SenderAddress,SenderEmail,SenderNumber,SenderCounty,ReceiverName,ReceiverAddress,ReceiverEmail,ReceiverNumber,ReceiverCounty,Type,Weight,Rate)values(?,?,?,?,?,?,?,?,?,?,?,?,?)");                                  
            
            ps.setString(1,SName);
            ps.setString(2,SAddress);
            ps.setString(3,SEmail);
            ps.setString(4,SNumber);
            ps.setString(5,SCounty);
            ps.setString(6,RName);
            ps.setString(7,RAddress);
            ps.setString(8,REmail);
            ps.setString(9,RNumber);
            ps.setString(10,RCounty);
            ps.setString(11,Type);            
            ps.setString(12, wgt);
            ps.setString(13, rate);
            
            ps.executeUpdate();      
            
            JOptionPane.showMessageDialog(this, "Order was successful");
            con.close();
           
            
            } catch (Exception e){
               JOptionPane.showMessageDialog(this, "Order not successful");
            }
          
          int total = 0;
            
          String weight=(String) jWeight.getSelectedItem();
          String rate=(String) jRate.getSelectedItem();
          
          if (weight.equals("1 to 5 Kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+1000;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+1000;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+1000;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+1000;}
                
          }else if (weight.equals("5 to10 Kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+1500;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+1500;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+1500;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+1500;} 
                
          }else if (weight.equals("10 to 15kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+2000;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+2000;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+2000;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+2000;}
                
          }else if (weight.equals("15 to 20 Kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+1500;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+2500;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+2500;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+2500;}
           
          } else if (weight.equals("20 to 30 Kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+3000;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+3000;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+3000;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+3000;}
                
         } else if (weight.equals("Over 30 Kg")){
                if (rate.equals("Premium 2 Dys")){
                    total=5000+10000;}
                else if (rate.equals("Gold 3 Dys")){
                    total=4000+10000;}
                else if (rate.equals("Silver 5 Dys")){
                    total=35000+10000;}
                else if (rate.equals("Bronze 9 Dys")){
                    total=2500+10000;}}           
          
          
           
            PayOption p = new PayOption();
            p.jTotal.setText(String.valueOf(total));
            p.setVisible(true);
            dispose();
         
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jWeightActionPerformed
       
    }//GEN-LAST:event_jWeightActionPerformed
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            jSname.setText("");
            jSaddress.setText("");
            jSemail.setText("");
            jSnumber.setText("");
            jScounty.setText("");
            jRname.setText("");
            jRaddress.setText("");
            jRemail.setText("");
            jRnumber.setText("");
            jRcounty.setText("");
            jType.setText("");
           
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRateActionPerformed
       
    }//GEN-LAST:event_jRateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Client c = new Client();
        c.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new NewOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jRaddress;
    private javax.swing.JComboBox<String> jRate;
    private javax.swing.JTextField jRcounty;
    private javax.swing.JTextField jRemail;
    private javax.swing.JTextField jRname;
    private javax.swing.JTextField jRnumber;
    private javax.swing.JTextField jSaddress;
    private javax.swing.JTextField jScounty;
    private javax.swing.JTextField jSemail;
    private javax.swing.JTextField jSname;
    private javax.swing.JTextField jSnumber;
    private javax.swing.JTextField jType;
    private javax.swing.JComboBox<String> jWeight;
    // End of variables declaration//GEN-END:variables
}
