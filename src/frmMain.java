


import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Akbar
 */
public class frmMain extends javax.swing.JFrame {

    String nol_jam;
    String nol_menit;
    String nol_detik;
    
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        selectData();
        setJam();
        setTanggal();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupJK = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        labelWaktu = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        labelTanggal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textFieldNIS = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFieldNama = new javax.swing.JTextField();
        textFieldKelas = new javax.swing.JTextField();
        radioButtonP = new javax.swing.JRadioButton();
        radioButtonL = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaAlamat = new javax.swing.JTextArea();
        textFieldTempatLahir = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textFieldTanggalLahir = new com.toedter.calendar.JDateChooser();
        jPanel5 = new javax.swing.JPanel();
        buttonPrint = new javax.swing.JButton();
        buttonSave = new javax.swing.JButton();
        buttonDelete = new javax.swing.JButton();
        buttonClear = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 51));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FORM BIODATA SISWA SMK TELKOM MALANG");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 10, 480, 40);

        labelWaktu.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        labelWaktu.setForeground(new java.awt.Color(255, 255, 255));
        labelWaktu.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelWaktu.setText("Waktu");
        jPanel1.add(labelWaktu);
        labelWaktu.setBounds(740, 40, 120, 30);

        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("The Real Informatic School");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(30, 40, 270, 30);

        labelTanggal.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        labelTanggal.setForeground(new java.awt.Color(255, 255, 255));
        labelTanggal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        labelTanggal.setText("Tanggal");
        jPanel1.add(labelTanggal);
        labelTanggal.setBounds(740, 10, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 890, 80);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(239, 239, 239));
        jPanel3.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(239, 239, 239));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ISIAN DATA SISWA");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 250, 30);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 90, 250, 30);

        jPanel4.setBackground(new java.awt.Color(239, 239, 239));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel2.setText("NIS");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 0, 70, 30);

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel3.setText("Alamat");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(10, 420, 90, 30);

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel4.setText("Nama");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(10, 60, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel5.setText("Jenis Kelamin");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(10, 120, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel6.setText("Kelas");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(10, 300, 90, 30);

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel7.setText("Email");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(10, 360, 90, 30);
        jPanel4.add(textFieldNIS);
        textFieldNIS.setBounds(10, 30, 230, 30);
        jPanel4.add(textFieldEmail);
        textFieldEmail.setBounds(10, 390, 230, 30);
        jPanel4.add(textFieldNama);
        textFieldNama.setBounds(10, 90, 230, 30);
        jPanel4.add(textFieldKelas);
        textFieldKelas.setBounds(10, 330, 230, 30);

        buttonGroupJK.add(radioButtonP);
        radioButtonP.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        radioButtonP.setText("Perempuan");
        jPanel4.add(radioButtonP);
        radioButtonP.setBounds(120, 150, 120, 30);

        buttonGroupJK.add(radioButtonL);
        radioButtonL.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 16)); // NOI18N
        radioButtonL.setText("Laki-Laki");
        jPanel4.add(radioButtonL);
        radioButtonL.setBounds(10, 150, 110, 30);

        textAreaAlamat.setColumns(20);
        textAreaAlamat.setRows(5);
        jScrollPane1.setViewportView(textAreaAlamat);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(10, 450, 230, 110);
        jPanel4.add(textFieldTempatLahir);
        textFieldTempatLahir.setBounds(10, 210, 230, 30);

        jLabel12.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel12.setText("Tempat Lahir");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(10, 180, 90, 30);

        jLabel13.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        jLabel13.setText("Tanggal Lahir");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(10, 240, 90, 30);
        jPanel4.add(textFieldTanggalLahir);
        textFieldTanggalLahir.setBounds(10, 270, 230, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(10, 130, 250, 570);

        jPanel5.setBackground(new java.awt.Color(239, 239, 239));
        jPanel5.setLayout(null);

        buttonPrint.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonPrint.setText("PRINT");
        buttonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrintActionPerformed(evt);
            }
        });
        jPanel5.add(buttonPrint);
        buttonPrint.setBounds(510, 10, 90, 30);

        buttonSave.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonSave.setText("SAVE");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });
        jPanel5.add(buttonSave);
        buttonSave.setBounds(10, 10, 90, 30);

        buttonDelete.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonDelete.setText("DELETE");
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });
        jPanel5.add(buttonDelete);
        buttonDelete.setBounds(110, 10, 90, 30);

        buttonClear.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonClear.setText("CLEAR");
        buttonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonClearActionPerformed(evt);
            }
        });
        jPanel5.add(buttonClear);
        buttonClear.setBounds(210, 10, 90, 30);

        buttonRefresh.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonRefresh.setText("REFRESH");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });
        jPanel5.add(buttonRefresh);
        buttonRefresh.setBounds(310, 10, 90, 30);

        buttonEdit.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        buttonEdit.setText("EDIT");
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });
        jPanel5.add(buttonEdit);
        buttonEdit.setBounds(410, 10, 90, 30);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(270, 90, 610, 50);

        jPanel6.setBackground(new java.awt.Color(239, 239, 239));
        jPanel6.setLayout(null);

        tabelData.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 14)); // NOI18N
        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama Siswa", "Jenis Kelamin", "Tempat Lahir", "Tanggal Lahir", "Kelas", "Email", "Alamat"
            }
        ));
        tabelData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelData);

        jPanel6.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 590, 530);

        jPasswordField1.setText("jPasswordField1");
        jPanel6.add(jPasswordField1);
        jPasswordField1.setBounds(310, 230, 111, 20);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(270, 150, 610, 550);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 710);

        setSize(new java.awt.Dimension(907, 748));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setTanggal(){
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new
        java.text.SimpleDateFormat("dd/MM/yyyy");
        labelTanggal.setText("Tanggal " + kal.format(skrg));
    }
    
    public void setJam(){
        ActionListener taskPerformer = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                Date dt = new Date();
                int nilai_jam = dt.getHours();
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt. getSeconds();
                if (nilai_jam <= 9){
                     nol_jam = "0";
                }
                else{
                    nol_jam ="";
                }
                if (nilai_menit <= 9){
                     nol_menit = "0";
                }
                else{
                    nol_menit ="";
                }
                
                if (nilai_detik <= 9){
                     nol_detik = "0";
                }
                else{
                    nol_detik ="";
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);
                labelWaktu.setText("Jam "+jam+":" + menit + ":"+ detik);
                
            }
        }; new Timer(100, taskPerformer).start();
    }
    
    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(textFieldTanggalLahir.getDate());
        
        if ("".equals(textFieldNIS.getText())||"".equals(textAreaAlamat.getText())||"".equals(textFieldNama.getText())||"".equals(textFieldKelas.getText())||"".equals(textFieldEmail.getText())||"".equals(textFieldTempatLahir.getText())||"".equals(tanggal)){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
         String JK = "";
         if(radioButtonL.isSelected()){
             JK = "L";
         }
         else{
            JK = "P";
         }
         
         String SQL = "INSERT INTO t_siswa(NIS, NamaSiswa, JenisKelamin, tmptLahir, tglLahir, Kelas, Email, Alamat) " + "VALUES('"+textFieldNIS.getText()+"','"+textFieldNama.getText()+"','"+JK+"','"+textFieldTempatLahir.getText()+"','"+tanggal+"','"+textFieldKelas.getText()+"','"+textFieldEmail.getText()+"','"+textAreaAlamat.getText()+"')";
         int status = Koneksi_DB.execute(SQL);
         if (status == 1){
             JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
             selectData();
         }
         else{
             JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
         }
        }
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        int baris = tabelData.getSelectedRow();
        if (baris != -1){
            String NIS = tabelData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = Koneksi_DB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil di hapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else{
                JOptionPane.showMessageDialog(this, "Data Gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Pilih Baris terlebih dahulu sebelum menghapus", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void buttonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonClearActionPerformed
      textFieldNama.setText("");
      textFieldNIS.setText("");
      textFieldTempatLahir.setText("");
      textFieldTanggalLahir.setDate(null);
      textFieldKelas.setText("");
      textFieldEmail.setText("");
      textAreaAlamat.setText("");
      buttonGroupJK.clearSelection();
    }//GEN-LAST:event_buttonClearActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
       selectData();
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void buttonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrintActionPerformed
       MessageFormat header = new MessageFormat("Biodata Siswa SMK TELKOM MALANG");
       MessageFormat footer = new MessageFormat("Page {0,number,integer}");
       
       try {
           tabelData.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
       } catch (java.awt.print.PrinterException e) {
           System.err.format("Cannot Print %s&n", e.getMessage());
       } 
    }//GEN-LAST:event_buttonPrintActionPerformed

    private void tabelDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDataMouseClicked
      int baris = tabelData.getSelectedRow();
      if(baris!= -1){
          textFieldNIS.setText(tabelData.getValueAt(baris, 0).toString());
          textFieldNama.setText(tabelData.getValueAt(baris, 1).toString());
          if("Laki-Laki".equals(tabelData.getValueAt(baris, 2).toString())){
              radioButtonL.setSelected(true);
          }
          else{
              radioButtonP.setSelected(true);
          }
          textFieldTempatLahir.setText(tabelData.getValueAt(baris, 3).toString());
          
          SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try {
            dateFormat = date.parse(tabelData.getValueAt(baris, 4).toString());
            } catch (ParseException ex) {
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
            }

            textFieldTanggalLahir.setDate(dateFormat);
          
          textFieldKelas.setText(tabelData.getValueAt(baris, 5).toString());
          textFieldEmail.setText(tabelData.getValueAt(baris, 6).toString());
          textAreaAlamat.setText(tabelData.getValueAt(baris, 7).toString());
      }
    }//GEN-LAST:event_tabelDataMouseClicked

    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(textFieldTanggalLahir.getDate());
        
        if ("".equals(textFieldNIS.getText())||"".equals(textAreaAlamat.getText())||"".equals(textFieldNama.getText())||"".equals(textFieldKelas.getText())||"".equals(textFieldEmail.getText())||"".equals(textFieldTempatLahir.getText())||"".equals(tanggal)){
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else{
         String JK = "";
         if(radioButtonL.isSelected()){
             JK = "L";
         }
         else{
            JK = "P";
         }
         
            String SQL = "UPDATE t_siswa SET "
                    + "NamaSiswa='"+textFieldNama.getText()+"',"
                    + "JenisKelamin='" + JK + "',"
                    + "tmptLahir='"+textFieldTempatLahir.getText()+"',"
                    + "tglLahir='"+tanggal+"',"
                    + "Kelas='"+textFieldKelas.getText()+"',"
                    + "Email='" + textFieldEmail.getText() + "',"
                    + "Alamat='" + textAreaAlamat.getText()+"' "
                    + "WHERE NIS='"+textFieldNIS.getText()+"'";
            int status = Koneksi_DB.execute(SQL);
            if (status == 1) {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate","Sukses",JOptionPane.INFORMATION_MESSAGE);
                selectData();
            } else {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_buttonEditActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonClear;
    private javax.swing.JButton buttonDelete;
    private javax.swing.JButton buttonEdit;
    private javax.swing.ButtonGroup buttonGroupJK;
    private javax.swing.JButton buttonPrint;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelTanggal;
    private javax.swing.JLabel labelWaktu;
    private javax.swing.JRadioButton radioButtonL;
    private javax.swing.JRadioButton radioButtonP;
    private javax.swing.JTable tabelData;
    private javax.swing.JTextArea textAreaAlamat;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldKelas;
    private javax.swing.JTextField textFieldNIS;
    private javax.swing.JTextField textFieldNama;
    private com.toedter.calendar.JDateChooser textFieldTanggalLahir;
    private javax.swing.JTextField textFieldTempatLahir;
    // End of variables declaration//GEN-END:variables

    public void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Tempat Lahir","Tanggal Lahir","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM `t_siswa`";
        ResultSet rs = Koneksi_DB.executeQuery(SQL);
        try {
            while(rs.next()){
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if("L".equals(rs.getString(3))){
                JenisKelamin = "Laki-Laki";
                }
                else{
                JenisKelamin = "Perempuan";
                }
                String TempatLahir = rs.getString(4);
                String TanggalLahir = rs.getString(5);
                String Kelas = rs.getString(6);
                String Email = rs.getString(7);
                String Alamat = rs.getString(8);
                String data[] = {NIS, NamaSiswa, JenisKelamin, TempatLahir, TanggalLahir, Kelas, Email, Alamat};
                dtm.addRow(data);
            }
        } catch(SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tabelData.setModel(dtm);
    }
}