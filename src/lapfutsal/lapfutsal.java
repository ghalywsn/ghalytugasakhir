
package lapfutsal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author macbook
 */
public class lapfutsal extends javax.swing.JFrame {

    DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY");
    Date date = new Date();
    Calendar cal = Calendar.getInstance();
    DefaultTableModel model;
    
    
    public lapfutsal() {
        initComponents();
        
        model = (DefaultTableModel) jTable2.getModel();
        dateTF.setText(" "+ dateFormat.format(date));
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Telfon = new javax.swing.JTextField();
        Team = new javax.swing.JTextField();
        PESAN = new javax.swing.JButton();
        KELUAR = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BOOK = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dateTF = new javax.swing.JTextField();
        Lapangan = new javax.swing.JTextField();
        Hapus = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Luminari", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOKING LAPANGAN FUTSAL GWSN");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 340, 34));

        jLabel2.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA PEMESAN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 90, 138, 39));

        jLabel3.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NO. TELFON");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 146, 138, -1));

        jLabel4.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("NAMA TEAM");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 185, 138, 28));

        jLabel5.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PILIH LAPANGAN");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 232, 158, 25));
        getContentPane().add(Nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 95, 187, -1));
        getContentPane().add(Telfon, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 141, 187, -1));
        getContentPane().add(Team, new org.netbeans.lib.awtextra.AbsoluteConstraints(279, 185, 187, -1));

        PESAN.setFont(new java.awt.Font("Luminari", 0, 13)); // NOI18N
        PESAN.setText("KONFIRMASI PESANAN");
        PESAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PESANActionPerformed(evt);
            }
        });
        getContentPane().add(PESAN, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 476, 190, 30));

        KELUAR.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        KELUAR.setText("KELUAR");
        KELUAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KELUARActionPerformed(evt);
            }
        });
        getContentPane().add(KELUAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 110, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama", "No. Telfon", "Nama Team", "Tanggal Pesan", "Lapangan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 140));

        BOOK.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        BOOK.setText("BOOK");
        BOOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOOKActionPerformed(evt);
            }
        });
        getContentPane().add(BOOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 110, 30));

        jLabel7.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tanggal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 80, -1));

        dateTF.setEditable(false);
        getContentPane().add(dateTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 110, -1));
        getContentPane().add(Lapangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 190, -1));

        Hapus.setFont(new java.awt.Font("Luminari", 1, 13)); // NOI18N
        Hapus.setText("HAPUS");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 110, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("/Users/macbook/Documents/ronaldinho.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 0, 660, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KELUARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KELUARActionPerformed
         if (JOptionPane.showConfirmDialog(null, "Anda Yakin ingin keluar?","Keluar", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
             JOptionPane.showMessageDialog(null, "Terima Kasih sudah berkunjung, ditunggu kehadirannya lagi di GWSN Futsal");
         System.exit(0);
    }//GEN-LAST:event_KELUARActionPerformed

    private void PESANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PESANActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Anda yakin ingin pesan tiket booking? pesanan yang sudah di pesan tidak dapat dibatalkan","Konfirmasi", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
             JOptionPane.showMessageDialog(null, "Booking anda sudah terkonfirmasi, harap menunggu di ruang tunggu");
         dispose();
    }//GEN-LAST:event_PESANActionPerformed

    private void BOOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOOKActionPerformed
        model.insertRow(model.getRowCount(),new Object[]{Nama.getText(),Telfon.getText(),Team.getText(),dateTF.getText(),Lapangan.getText()});
        
    }//GEN-LAST:event_BOOKActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Telfon.setText("");
        Team.setText("");
        Lapangan.setText("");
    }//GEN-LAST:event_HapusActionPerformed

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
            java.util.logging.Logger.getLogger(lapfutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(lapfutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(lapfutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(lapfutsal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new lapfutsal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BOOK;
    private javax.swing.JButton Hapus;
    private javax.swing.JButton KELUAR;
    private javax.swing.JTextField Lapangan;
    private javax.swing.JTextField Nama;
    private javax.swing.JButton PESAN;
    private javax.swing.JTextField Team;
    private javax.swing.JTextField Telfon;
    private javax.swing.JTextField dateTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
