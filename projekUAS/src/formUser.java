

import report.hasil.hasil_tiket1;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


        


public class formUser extends javax.swing.JFrame {
  
     
    Connection connection1 = null;
	ResultSet result1 = null;
	PreparedStatement prepared1 = null;
	Statement statiket1;
        
        private void koneksi1() {
	try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/db_uas";
            String user="root";
            String pass=""; 
            connection1 = (Connection) DriverManager.getConnection(url,user,pass);
            statiket1 = (Statement) connection1.createStatement(result1.TYPE_SCROLL_SENSITIVE,result1.CONCUR_UPDATABLE);
            result1 = statiket1.executeQuery("select * from user");
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                System.exit(0);
            }
    }
        
	private void display1(){
        try{
            String sql1="select * from user";
            prepared1 = (PreparedStatement) connection1.prepareStatement(sql1);
            result1 = prepared1.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(result1));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
 }
         private void Clear(){
        f_user_id1.setText(null);
        f_nama1.setText(null);
        f_waktu.setText(null);

        
    
  }
         public String cbtujuan;
         public String f_harga ;
         public String f_jadwal20;
         public String txt_jadd;
         
         
         
           
    public formUser() {
        initComponents();
        koneksi1();
        display1();
        
    }
   
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_create1 = new javax.swing.JButton();
        btn_delete1 = new javax.swing.JButton();
        btn_update1 = new javax.swing.JButton();
        btn_exit1 = new javax.swing.JButton();
        f_user_id1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btn_list1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        f_waktu = new javax.swing.JTextField();
        txt_jad = new javax.swing.JTextField();
        f_harga2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        f_tujuan1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        f_nama1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Reseptor\\Downloads\\Untitled_design__2_-removebg-preview.png")); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Reseptor\\Downloads\\Untitled design (4).png")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID_TIKET                            :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, -1, 30));

        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SILAHKAN PILIH TIKET YANG ANDA BUTUHKAN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 930, 20));

        jLabel4.setText("WAKTU PEMBELIAN            :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, 30));

        btn_create1.setText("Create");
        btn_create1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_create1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_create1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 90, 30));

        btn_delete1.setText("Delete");
        btn_delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_delete1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 80, 30));

        btn_update1.setText("Update");
        btn_update1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_update1MouseClicked(evt);
            }
        });
        btn_update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 90, 30));

        btn_exit1.setText("Back");
        btn_exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exit1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 30));
        getContentPane().add(f_user_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 170, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID TIKET", "NAMA", "TUJUAN KEBERANGKATAN", "WAKTU PEMBELIAN", "JADWAL KEBERANGKATAN", "HARGA"
            }
        ));
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 920, 60));

        btn_list1.setText("Next");
        btn_list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_list1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_list1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 540, 120, 30));

        jLabel8.setFont(new java.awt.Font("Goudy Stout", 0, 14)); // NOI18N
        jLabel8.setText("DAFTAR PEMBELIAN TIKET ANDA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, 30));

        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("SUMEDANG AIRPORT");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 930, 20));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(f_waktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 160, 30));
        jPanel1.add(txt_jad, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 170, 160, 30));

        f_harga2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_harga2ActionPerformed(evt);
            }
        });
        jPanel1.add(f_harga2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, 160, 30));

        jLabel6.setText("HARGA                                :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, -1, 30));

        f_tujuan1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bandung", "Cirebon", "Jakarta", "Batam" }));
        f_tujuan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_tujuan1ActionPerformed(evt);
            }
        });
        jPanel1.add(f_tujuan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 170, 30));

        jLabel7.setText("TUJUAN KEBERANGKATAN :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, 30));

        f_nama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_nama1ActionPerformed(evt);
            }
        });
        jPanel1.add(f_nama1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 170, 30));

        jLabel2.setText("NAMA (NO WA)                  :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, 30));

        jLabel5.setText("JADWAL KEBERANGKATAN :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-70, -10, 1060, 640));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_create1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_create1ActionPerformed
try{
            koneksi1();
            statiket1 = (Statement) connection1.createStatement();

            String SQL1 = "insert into user values('"+f_user_id1.getText()+"','"+f_nama1.getText()+"','"+f_tujuan1.getSelectedItem().toString()+"','"+txt_jad.getText()+"','"+f_waktu.getText()+"','"+f_harga2.getText()+"')";
            statiket1.executeUpdate(SQL1);
            display1();
            statiket1.close();
            connection1.close();
            Clear();
            JOptionPane.showMessageDialog(null, "berhasil simpan");
            
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }        
    }//GEN-LAST:event_btn_create1ActionPerformed

    private void btn_delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_delete1ActionPerformed
     try{
            koneksi1();
            statiket1 = (Statement) connection1.createStatement();
            String SQL1 = "DELETE FROM user WHERE id_tiket= '"+f_user_id1.getText()+"'";
            statiket1.executeUpdate(SQL1);
            display1();
            statiket1.close();
            connection1.close();
            JOptionPane.showMessageDialog(null, "berhasil hapus");
           
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_btn_delete1ActionPerformed

    private void btn_update1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_update1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_update1MouseClicked

    private void btn_update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update1ActionPerformed
       try{
            koneksi1();
            statiket1 = (Statement) connection1.createStatement();
            String SQL1 = "update user SET id_tiket = '"+f_user_id1.getText()+"', nama1 = '"+f_nama1.getText()+"', tujuan_keb1 = '"+f_tujuan1.getSelectedItem().toString()+"', waktu_pembelian1 = '"+f_waktu.getText()+"', jadwal_keb1 = '"+txt_jad.getText()+"', harga1 = '"+f_harga2.getText()+"' WHERE id_tiket= '"+f_user_id1.getText()+"'";
            statiket1.executeUpdate(SQL1);
            display1();
            statiket1.close();
            connection1.close();
            Clear();
            JOptionPane.showMessageDialog(null, "berhasil edit");
           
        }catch(Exception exc){
            System.err.println(exc.getMessage());
        }
    }//GEN-LAST:event_btn_update1ActionPerformed

    private void btn_exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exit1ActionPerformed
       new loginUser().setVisible(true);
    }//GEN-LAST:event_btn_exit1ActionPerformed

    private void btn_list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_list1ActionPerformed
       new hasil_tiket1().setVisible(true); 
      
    }//GEN-LAST:event_btn_list1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        try {
            koneksi1();
            int row1 =jTable2.getSelectedRow();
            String tabel_klik1=(jTable2.getModel().getValueAt(row1, 0).toString());
            java.sql.Statement stm1 = connection1.createStatement();
            java.sql.ResultSet sql1 = stm1.executeQuery("select * from user where id_tiket='"+tabel_klik1+"'");
            if(sql1.next()){
                String id1 = sql1.getString("id_tiket");
                f_user_id1.setText(id1);
                String nama1 = sql1.getString("nama1");
                f_nama1.setText(nama1);
                
            }
        } catch (Exception e) {}
    }//GEN-LAST:event_jTable2MouseClicked

    private void f_nama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_nama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_nama1ActionPerformed

    private void f_tujuan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_tujuan1ActionPerformed
        cbtujuan = (String) f_tujuan1.getSelectedItem();
        if (cbtujuan == "Bandung"){
            f_harga = "90000";
            txt_jadd = "senin";
        }else if(cbtujuan == "Cirebon"){
            f_harga = "100000";
            txt_jadd = "selasa";
        }else if(cbtujuan == "Jakarta"){
            f_harga = "150000";
            txt_jadd = "rabu";
        }else if(cbtujuan == "Batam"){
            f_harga = "500000";
            txt_jadd = "kamis";
        }
                txt_jad.setText(String.valueOf(txt_jadd));
               f_harga2.setText(String.valueOf(f_harga));
        
    }//GEN-LAST:event_f_tujuan1ActionPerformed

    private void f_harga2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_harga2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_harga2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
     
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_create1;
    private javax.swing.JButton btn_delete1;
    private javax.swing.JButton btn_exit1;
    private javax.swing.JButton btn_list1;
    private javax.swing.JButton btn_update1;
    private javax.swing.JTextField f_harga2;
    private javax.swing.JTextField f_nama1;
    private javax.swing.JComboBox<String> f_tujuan1;
    private javax.swing.JTextField f_user_id1;
    private javax.swing.JTextField f_waktu;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txt_jad;
    // End of variables declaration//GEN-END:variables
}
