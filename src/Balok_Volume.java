
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Filsafalasafi
 */
public class Balok_Volume extends javax.swing.JFrame {

    
    public Balok_Volume() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_panjang = new javax.swing.JTextField();
        txt_lebar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_tinggi = new javax.swing.JTextField();
        txt_hasil = new javax.swing.JTextField();
        btn_hasil = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_proses = new javax.swing.JTextArea();
        btn_kembali = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Volume Balok");
        setResizable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/volumeTabung.png"))); // NOI18N

        jLabel2.setText("Masukkan Panjang");

        jLabel3.setText("Masukkan Lebar");

        txt_panjang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_panjangActionPerformed(evt);
            }
        });

        txt_lebar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lebarActionPerformed(evt);
            }
        });

        jLabel4.setText("Masukkan Tinggi");

        txt_tinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tinggiActionPerformed(evt);
            }
        });

        txt_hasil.setEditable(false);
        txt_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hasilActionPerformed(evt);
            }
        });

        btn_hasil.setText("Hasil");
        btn_hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hasilActionPerformed(evt);
            }
        });

        jLabel6.setText("Hasil Proses Pengerjaan");

        jLabel7.setText("Hasil Volume");

        txt_proses.setEditable(false);
        txt_proses.setColumns(20);
        txt_proses.setRows(5);
        jScrollPane2.setViewportView(txt_proses);

        btn_kembali.setText("Kembali");
        btn_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_kembali)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(txt_panjang)
                            .addComponent(txt_lebar)
                            .addComponent(txt_tinggi)
                            .addComponent(btn_hasil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(6, 6, 6)
                        .addComponent(txt_panjang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(txt_lebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(txt_tinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(btn_hasil)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addComponent(txt_hasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_kembali)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_panjangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_panjangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_panjangActionPerformed

    private void txt_lebarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lebarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lebarActionPerformed

    private void txt_tinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tinggiActionPerformed

    private void txt_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hasilActionPerformed

    private void btn_hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hasilActionPerformed
        try  {
        double panjang = Double.parseDouble(txt_panjang.getText());
        double tinggi = Double.parseDouble(txt_tinggi.getText());
        double lebar = Double.parseDouble(txt_lebar.getText());
        
        Balok b = new Balok();
        b.setPanjang(panjang);
        b.setTinggi(tinggi);
        b.setLebar(lebar);
        
        txt_hasil.setText(String.valueOf(b.volume()));
        txt_proses.setText(" Volume = "+ b.getPanjang() + " x " + b.getLebar() + " x " + b.getTinggi() +"\n"
                          +" Volume = " + b.luas() + " x " + b.getTinggi() + "\n"
                          +" Volume = " + b.volume());
        }
        catch(Exception xx){
            JOptionPane.showMessageDialog(null,"Inputan anda kosong / tidak sesuai , Keterangan : " + xx.getMessage());
        }
        
    }//GEN-LAST:event_btn_hasilActionPerformed

    private void btn_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kembaliActionPerformed
        this.setVisible(false);
        new Balok_Menu().setVisible(true);
    }//GEN-LAST:event_btn_kembaliActionPerformed

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
            java.util.logging.Logger.getLogger(Balok_Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Balok_Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Balok_Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Balok_Volume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Balok_Volume().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_hasil;
    private javax.swing.JButton btn_kembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_hasil;
    private javax.swing.JTextField txt_lebar;
    private javax.swing.JTextField txt_panjang;
    private javax.swing.JTextArea txt_proses;
    private javax.swing.JTextField txt_tinggi;
    // End of variables declaration//GEN-END:variables
}
