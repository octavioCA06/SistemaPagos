/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapagosineso;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author camif
 */
public class PantallaModificacion_1 extends javax.swing.JInternalFrame {
    int ax=1;
    double bx=1.0;
    String cx="adasdasdasdasdas";
    
    Connection con;
    
    /**
     * Creates new form PantallaRegistro
     */
    public PantallaModificacion_1(String folio) {
        initComponents();
        
        try {  
            Llenar(folio);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaModificacion_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        GrupoInpro = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Registrar2 = new javax.swing.JButton();
        Vaciar2 = new javax.swing.JButton();
        rbclinica3 = new javax.swing.JRadioButton();
        rbclinica2 = new javax.swing.JRadioButton();
        jDateFecha2 = new com.toedter.calendar.JDateChooser();
        tfAlumno2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfPaciente2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcbCiclo2 = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbGrupo2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservaciones2 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        tfFolio = new javax.swing.JTextField();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 278, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1438, 214, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel3.setText("Nombre Completo del Alumno:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 290, -1));

        Registrar2.setBackground(new java.awt.Color(218, 236, 243));
        Registrar2.setFont(new java.awt.Font("Dubai Medium", 0, 19)); // NOI18N
        Registrar2.setText("Modificar");
        Registrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Registrar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Registrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 120, -1));

        Vaciar2.setBackground(new java.awt.Color(218, 236, 243));
        Vaciar2.setFont(new java.awt.Font("Dubai Medium", 0, 19)); // NOI18N
        Vaciar2.setText("Vaciar");
        Vaciar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Vaciar2ActionPerformed(evt);
            }
        });
        jPanel1.add(Vaciar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, 120, -1));

        GrupoInpro.add(rbclinica3);
        rbclinica3.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        rbclinica3.setText("Clínica $300");
        jPanel1.add(rbclinica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 490, -1, -1));

        GrupoInpro.add(rbclinica2);
        rbclinica2.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        rbclinica2.setText("Clínica $200");
        rbclinica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbclinica2ActionPerformed(evt);
            }
        });
        jPanel1.add(rbclinica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 480, 150, -1));
        jPanel1.add(jDateFecha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 290, 30));
        jPanel1.add(tfAlumno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 290, -1));

        jLabel6.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel6.setText("Nombre Completo del Paciente:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        tfPaciente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaciente2ActionPerformed(evt);
            }
        });
        jPanel1.add(tfPaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 290, -1));

        jLabel11.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel11.setText("Fecha:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel7.setText("Grupo / Semestre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        jcbCiclo2.setBackground(new java.awt.Color(81, 154, 183));
        jcbCiclo2.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jcbCiclo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Septiembre - Febrero 2022", "Marzo - Agosto 2023" }));
        jcbCiclo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCiclo2ActionPerformed(evt);
            }
        });
        jPanel1.add(jcbCiclo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 320, -1));

        jPanel2.setBackground(new java.awt.Color(201, 70, 70));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración y Finanzas");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1370, 40));

        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 25)); // NOI18N
        jLabel2.setText("Registro de Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 230, 40));

        jcbGrupo2.setBackground(new java.awt.Color(81, 154, 183));
        jcbGrupo2.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jcbGrupo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Martes - Grupo 4 / 3° Semestre", "Miércoles - Grupo 3 / 4° Semestre", "Jueves - Grupo 2 / 2° Semestre", " " }));
        jPanel1.add(jcbGrupo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 320, -1));

        jLabel9.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel9.setText("Ciclo:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 210, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 600, 260, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 990, 60));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/logo-Inprooo.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai Light", 1, 17)); // NOI18N
        jLabel8.setText("Observaciones:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, -1));

        taObservaciones2.setColumns(20);
        taObservaciones2.setRows(5);
        jScrollPane1.setViewportView(taObservaciones2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 320, -1));

        jLabel15.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        jLabel15.setText("Folio:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        tfFolio.setEditable(false);
        jPanel1.add(tfFolio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 90, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPaciente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaciente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaciente2ActionPerformed

    private void rbclinica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbclinica2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbclinica2ActionPerformed

    private void Registrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Registrar2ActionPerformed
        // TODO add your handling code here:
        
        
        int year = jDateFecha2.getCalendar().get(Calendar.YEAR);
        int mes = jDateFecha2.getCalendar().get(Calendar.MONTH)+1;
        int dia = jDateFecha2.getCalendar().get(Calendar.DAY_OF_MONTH);
        
        String fecha=""+year+"-"+mes+"-"+dia;
        
        String concepto ="";

        if (rbclinica2.isSelected()) {
            concepto = "Clínica $200";
        }
        if (rbclinica3.isSelected()) {
            concepto = "Clínica $300";
        }
       
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE `inpro` SET `Alumno` = '"+ tfAlumno2.getText() +"' , "
                                                + "`Paciente` = '"+ tfPaciente2.getText() +"', "
                                                + "`Grupo` = '"+ jcbGrupo2.getSelectedItem() +"', "
                                                + "`Ciclo` = '"+ jcbCiclo2.getSelectedItem() +"', "
                                                + "`Fecha` = '"+ fecha +"', "
                                                + "`Concepto` = '"+ concepto +"', "
                                                + "`Observaciones` = '"+ taObservaciones2.getText() +"' "
                    + " WHERE `Folio` = "+ Integer.parseInt(tfFolio.getText()) +" ");
            JOptionPane.showMessageDialog(null,"Se ha modificado el registro exitosamente");
            this.setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(PantallaModificacion.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos");
        }
        
        
        
        
    }//GEN-LAST:event_Registrar2ActionPerformed

    private void jcbCiclo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCiclo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCiclo2ActionPerformed

    private void Vaciar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Vaciar2ActionPerformed
        // TODO add your handling code here:
        GrupoInpro.clearSelection();
        Vaciar();
    }//GEN-LAST:event_Vaciar2ActionPerformed


    private void Llenar(String folio) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
        Statement stmt = con.createStatement();
        // ResultSet rs = stmt.executeQuery("SELECT * FROM registro WHERE Alumno LIKE '"+tfAlumno1.getText().toString()+"%'");
        ResultSet rs = stmt.executeQuery("SELECT * FROM inpro WHERE Folio = " + folio);
        //ResultSet rs = stmt.executeQuery("SELECT * FROM ineso WHERE Paciente LIKE '%"+tfPaciente1.getText().toString()+"%'");
        if(rs.next()) { //se valida si hay resultados
            do {
                //String[] fila = {rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6)};
                String[] fila = {String.format("%05d",Integer.parseInt(rs.getString("Folio"))), 
                                rs.getString("Alumno"), 
                                rs.getString("Paciente"), 
                                rs.getString("Grupo"),
                                rs.getString("Ciclo"),
                                rs.getString("Fecha"), 
                                rs.getString("Concepto"),
                                rs.getString("Observaciones")};
                tfFolio.setText(folio);
                tfAlumno2.setText(fila[1]);
                tfPaciente2.setText(fila[2]);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    java.util.Date date = (java.util.Date) sdf.parse(fila[5]);
                    sdf.applyPattern("dd/MM/yyyy");
                    jDateFecha2.setDate(date);
                } catch (ParseException ex) {
                    Logger.getLogger(PantallaModificacion.class.getName()).log(Level.SEVERE, null, ex);
                }
                taObservaciones2.setText(fila[7]);
                jcbCiclo2.getModel().setSelectedItem(fila[4]);
                jcbGrupo2.getModel().setSelectedItem(fila[3]);
                if(fila[6].equals("Clínica $300")){
                    rbclinica3.setSelected(true);
                    rbclinica2.setSelected(false);
                }else{
                    rbclinica3.setSelected(false);
                    rbclinica2.setSelected(true);
                }
            } while(rs.next()); //repita mientras existan más datos
        }         
    }
    
    private void Vaciar() {
        tfAlumno2.setText("");
        tfPaciente2.setText("");
        jDateFecha2.setCalendar(null);  
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoInpro;
    private javax.swing.JButton Registrar2;
    private javax.swing.JButton Vaciar2;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser jDateFecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JComboBox<String> jcbCiclo2;
    private javax.swing.JComboBox<String> jcbGrupo2;
    private javax.swing.JRadioButton rbclinica2;
    private javax.swing.JRadioButton rbclinica3;
    private javax.swing.JTextArea taObservaciones2;
    private javax.swing.JTextField tfAlumno2;
    private javax.swing.JTextField tfFolio;
    private javax.swing.JTextField tfPaciente2;
    // End of variables declaration//GEN-END:variables
}
