/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemapagosineso;
import java.util.logging.Logger;
import java.awt.Cursor;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;*/
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author camif
 */
public class ConsultaPagos1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPagos
     */
    
    
    
    
    public ConsultaPagos1() {
        initComponents();
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaRegistro_1.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfPaciente2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPagos2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateFilter1 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 25)); // NOI18N
        jLabel2.setText("Consulta de Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 230, 40));

        tfPaciente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaciente2ActionPerformed(evt);
            }
        });
        tfPaciente2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPaciente2KeyReleased(evt);
            }
        });
        jPanel1.add(tfPaciente2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 300, -1));

        tbPagos2.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        tbPagos2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre del Alumno ", "Nombre del Paciente", "Último Mes Pagado", "Concepto"
            }
        ));
        jScrollPane1.setViewportView(tbPagos2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 1030, 300));

        jButton2.setBackground(new java.awt.Color(218, 236, 243));
        jButton2.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        jButton2.setText("Generar Recibo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 200, 40));

        jPanel2.setBackground(new java.awt.Color(201, 70, 70));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración y Finanzas");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1380, 40));

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        jLabel3.setText("Nombre del Paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 210, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 600, 190, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 990, 60));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES2/logo-Inpro.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 90, -1, 60));

        jButton1.setBackground(new java.awt.Color(218, 236, 243));
        jButton1.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        jButton1.setText("Generar Reporte ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, 40));
        jPanel1.add(jDateFilter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 210, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(275, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            
  private void limpiartabla(DefaultTableModel modeloxx){
for (int i = 0; i < tbPagos2.getRowCount(); i++) {
modeloxx.removeRow(i);
i-=1;
}

}
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
          try {
            // TODO add your handling code here:
            MostrarRecibo();
            
            
            
        } catch (Exception ex) {
            Logger.getLogger(ConsultaPagos1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfPaciente2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPaciente2KeyReleased
        // TODO add your handling code here:
        
        String fecha= "";
        
        if (jDateFilter1.getCalendar() != null){
            int year = jDateFilter1.getCalendar().get(Calendar.YEAR);
            int mes = jDateFilter1.getCalendar().get(Calendar.MONTH) + 1;
            int dia = jDateFilter1.getCalendar().get(Calendar.DAY_OF_MONTH);
            
            String Smes = ((mes < 10) ? "0"+Integer.toString(mes) : Integer.toString(mes)); 

            fecha=""+year+"-"+Smes+"-"+dia;
        }
        
        
         
        String x=tfPaciente2.getText().toString();
        System.out.println(x);
        

        
        
      
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo = (DefaultTableModel)tbPagos2.getModel();
            
            limpiartabla(modelo);
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
            Statement stmt = con.createStatement();
          // ResultSet rs = stmt.executeQuery("SELECT * FROM registro WHERE Alumno LIKE '"+tfAlumno1.getText().toString()+"%'");
           ResultSet rs = stmt.executeQuery("SELECT * FROM inpro WHERE Paciente LIKE '%"+tfPaciente2.getText().toString()+"%' AND Fecha LIKE '%"+ fecha +"%'");
           
           
           
            
if(rs.next()) { //se valida si hay resultados
  do {
    	String[] fila = {rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6)};
    	modelo.addRow(fila);
  } while(rs.next()); //repita mientras existan más datos
}
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPagos1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_tfPaciente2KeyReleased

    private void tfPaciente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaciente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaciente2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            MostrarReporte(); 
            
            
                    } catch (JRException ex) {
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Clase renombrada "MostrarReporte();
    public void MostrarRecibo() throws Exception
        {
                 Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
       

                // InputStream jasperStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("report1.jasper");

                 //JasperReport reporte = (JasperReport) JRLoader.loadObject(jasperStream);
                 //JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("report1.jasper"));
              // JasperReport reporte = (JasperReport) JRLoader.loadObject("report1.jasper");
              JasperReport reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"/src/sistemapagosineso/report2_1.jrxml");
             
              Map parametrosx=new HashMap();
              //parametrosx.put("nombreingresado2", tfPaciente2.getText().toString
              parametrosx.put("nombreingresado2", tbPagos2.getValueAt(tbPagos2.getSelectedRow(), 1));
              
              JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, parametrosx, con);

              JasperViewer jviewer= new JasperViewer(jasperPrint,false);
                       jviewer.setTitle("Reporte de Ventas");
                       jviewer.setVisible(true);


               /*JRExporter exporter = new JRPdfExporter();

               exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
               exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reportePDF.pdf"));
               exporter.exportReport();
               System.out.println("PDF GENERADO, NOMBRE: reportePDF.pdf");*/
               
        }
    
    //Clase para el botón "Mostrar Reporte"
    private void MostrarReporte() throws SQLException, JRException {
        String fecha= "";
        
        if (jDateFilter1.getCalendar() != null){
            int year = jDateFilter1.getCalendar().get(Calendar.YEAR);
            int mes = jDateFilter1.getCalendar().get(Calendar.MONTH) + 1;
            int dia = jDateFilter1.getCalendar().get(Calendar.DAY_OF_MONTH);

            String Smes = ((mes < 10) ? "0"+Integer.toString(mes) : Integer.toString(mes)); 

            fecha=""+year+"-"+Smes+"-"+dia;
        }
        
        File f= new File ("");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");

        Map params = new HashMap();
        params.put("fecha", fecha);
        
       // JasperReport jr = JasperCompileManager.compileReport("src/sistemapagosineso/reportAcumuladoInpro.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(f.getAbsolutePath()+"\\src\\sistemapagosineso/reportAcumuladoInpro.jrxml");

        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
        JasperViewer jv = new JasperViewer(jp,false);
        jv.setVisible(true);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateFilter1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbPagos2;
    private javax.swing.JTextField tfPaciente2;
    // End of variables declaration//GEN-END:variables

    
}