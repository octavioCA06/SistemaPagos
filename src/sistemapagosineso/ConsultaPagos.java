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
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

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
public class ConsultaPagos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultaPagos
     */
    
    
    static Logger log= Logger.getLogger(ConsultaPagos.class.getName());
    
     // Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
    
    public ConsultaPagos() {
        initComponents();
        //jDateFilter.setDate(new java.util.Date());
     
        
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PantallaRegistro.class.getName()).log(Level.SEVERE, null, ex);
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
        tfPaciente1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPagos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jDateFilter = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jcbTratamientoFilter = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(6, 6));
        jPanel1.setPreferredSize(new java.awt.Dimension(6, 6));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai Light", 1, 25)); // NOI18N
        jLabel2.setText("Consulta de Pagos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 310, 40));

        tfPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPaciente1ActionPerformed(evt);
            }
        });
        tfPaciente1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfPaciente1KeyReleased(evt);
            }
        });
        jPanel1.add(tfPaciente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 300, -1));

        tbPagos.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        tbPagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Folio", "Nombre del Alumno ", "Nombre del Paciente", "Último Mes Pagado", "Concepto"
            }
        ));
        jScrollPane1.setViewportView(tbPagos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 1030, 300));

        jButton2.setBackground(new java.awt.Color(218, 236, 243));
        jButton2.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        jButton2.setText("Generar Recibo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 540, 180, 40));

        jPanel2.setBackground(new java.awt.Color(81, 154, 183));

        jLabel1.setFont(new java.awt.Font("Dubai Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración y Finanzas");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1380, 40));

        jLabel3.setFont(new java.awt.Font("Dubai Light", 1, 20)); // NOI18N
        jLabel3.setText("Nombre del Paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 600, 210, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 600, 280, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 990, 60));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 130, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/MUELA2.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 90, -1, -1));

        jButton1.setBackground(new java.awt.Color(218, 236, 243));
        jButton1.setFont(new java.awt.Font("Dubai Light", 1, 19)); // NOI18N
        jButton1.setText("Generar Reporte ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 540, -1, 40));
        jPanel1.add(jDateFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 130, 250, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setText("Fecha:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 100, -1, 30));

        jcbTratamientoFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Seleccione...", "Ortodoncia", "Ortopedia" }));
        jPanel1.add(jcbTratamientoFilter, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 550, 150, -1));

        jLabel7.setText("Tratamiento:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 530, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1484, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            
  private void limpiartabla(DefaultTableModel modeloxx){
for (int i = 0; i < tbPagos.getRowCount(); i++) {
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
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tfPaciente1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPaciente1KeyReleased
        // TODO add your handling code here:
        
        String fecha= "";
        
        if (jDateFilter.getCalendar() != null){
            int year = jDateFilter.getCalendar().get(Calendar.YEAR);
            int mes = jDateFilter.getCalendar().get(Calendar.MONTH) + 1;
            int dia = jDateFilter.getCalendar().get(Calendar.DAY_OF_MONTH);
            
            String Smes = ((mes < 10) ? "0"+Integer.toString(mes) : Integer.toString(mes)); 

            fecha=""+year+"-"+Smes+"-"+dia;
        }
         
        //String x=tfPaciente1.getText().toString();
        //System.out.println(x + "; " + fecha);
        

        
        
      
        try {
            // TODO add your handling code here:
            DefaultTableModel modelo = (DefaultTableModel)tbPagos.getModel();
            
            limpiartabla(modelo);
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
            Statement stmt = con.createStatement();
          // ResultSet rs = stmt.executeQuery("SELECT * FROM registro WHERE Alumno LIKE '"+tfAlumno1.getText().toString()+"%'");
         ResultSet rs = stmt.executeQuery("SELECT * FROM ineso WHERE Paciente LIKE '%"+tfPaciente1.getText().toString()+"%' AND Fecha LIKE '%"+ fecha +"%'");
         //ResultSet rs = stmt.executeQuery("SELECT * FROM ineso WHERE Paciente LIKE '%"+tfPaciente1.getText().toString()+"%'");
           
           
           
            
if(rs.next()) { //se valida si hay resultados
  do {
    	//String[] fila = {rs.getString(1),rs.getString(2),rs.getString(5),rs.getString(6)};
        String[] fila = {String.format("%05d",Integer.parseInt(rs.getString("Folio"))), 
                        rs.getString("Alumno"), 
                        rs.getString("Paciente"), 
                        rs.getString("Fecha"), 
                        rs.getString("Concepto")};
    	modelo.addRow(fila);
  } while(rs.next()); //repita mientras existan más datos
}
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
    }//GEN-LAST:event_tfPaciente1KeyReleased

    private void tfPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPaciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPaciente1ActionPerformed

    public static void escribirLog(String rutaArchivo, String mensaje) {

    Logger logger = Logger.getLogger("MyLog");
    FileHandler fh;

    try {

        fh = new FileHandler(rutaArchivo, true);
        logger.addHandler(fh);

        SimpleFormatter formatter = new SimpleFormatter();

        fh.setFormatter(formatter);

        logger.info(mensaje);

        fh.close();

    } catch (SecurityException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        // no sirve // File f = new File(this.getClass().getResource("").getPath()); 
        //File f= new File ("");
        
        //JOptionPane.showMessageDialog(null,""+f.getAbsolutePath());
          
 
        
        try {
       
            MostrarReporte();
            
        } catch (JRException ex) {
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
           // escribirLog("src/sistemapagosineso/", ex.getMessage());
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //Clase renombrada "Mostrar Reporte()"
    public void MostrarRecibo() throws Exception
        {
                 Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
       

                // InputStream jasperStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("report1.jasper");

                 //JasperReport reporte = (JasperReport) JRLoader.loadObject(jasperStream);
                 //JasperReport reporte = (JasperReport) JRLoader.loadObject(new File("report1.jasper"));
              // JasperReport reporte = (JasperReport) JRLoader.loadObject("report1.jasper");
              JasperReport reporte = JasperCompileManager.compileReport(new File("").getAbsolutePath()+"/src/sistemapagosineso/report2.jrxml");
             
              Map parametrosx=new HashMap();
              //parametrosx.put("nombreingresado", tfPaciente1.getText().toString());
              String folioSelected = (String) tbPagos.getValueAt(tbPagos.getSelectedRow(), 0);
              parametrosx.put("folio", folioSelected.replaceFirst("^0+(?!$)", ""));
              
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
    
    //Clase nueva para el botón "Mostrar Reprote"
    private void MostrarReporte() throws JRException, SQLException{
        
        String fecha= "";
        
        if (jDateFilter.getCalendar() != null){
            int year = jDateFilter.getCalendar().get(Calendar.YEAR);
            int mes = jDateFilter.getCalendar().get(Calendar.MONTH) + 1;
            int dia = jDateFilter.getCalendar().get(Calendar.DAY_OF_MONTH);

            String Smes = ((mes < 10) ? "0"+Integer.toString(mes) : Integer.toString(mes)); 

            fecha=""+year+"-"+Smes+"-"+dia;
        }
        String tratamiento = (jcbTratamientoFilter.getSelectedIndex() == 0) ? ("") : (jcbTratamientoFilter.getSelectedItem().toString());
        //System.out.println(fecha);
        
        File f= new File ("");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemapagos","root","");
        
        Map params = new HashMap();
        params.put("fecha", fecha);
        params.put("tratamiento", tratamiento);
        //System.out.println(params.isEmpty());
        //JasperReport jr = JasperCompileManager.compileReport("/src/sistemapagosineso/reportAcumuladoIneso.jrxml");
        // JasperReport jr = JasperCompileManager.compileReport("C:\\Users\\camif\\OneDrive\\Documentos\\NetBeansProjects\\SistemaPagosIneso\\src\\sistemapagosineso/reportAcumuladoIneso.jrxml");
        JasperReport jr = JasperCompileManager.compileReport(f.getAbsolutePath()+"/src/sistemapagosineso/reportAcumuladoIneso.jrxml");
        
        JasperPrint jp = JasperFillManager.fillReport(jr,params,con);
            
            
        JasperViewer jv = new JasperViewer(jp,false);
        jv.setVisible(true);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateFilter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbTratamientoFilter;
    private javax.swing.JTable tbPagos;
    private javax.swing.JTextField tfPaciente1;
    // End of variables declaration//GEN-END:variables

    
}
