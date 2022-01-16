/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientet4;

import java.util.ArrayList;
import java.util.List;
import tarea6.WebServiceT6;
import tarea6.WebServiceT6_Service;
import tarea6.Pais;
import tarea6.Moneda;
import tarea6.Zona;

/**
 *
 * @author Nico
 */
public class Interfaz extends javax.swing.JFrame {

    WebServiceT6_Service s = null;
    WebServiceT6 conexion = null;

    public Interfaz() {
        initComponents();
        this.setTitle("Tarea 4");
        this.setSize(1100, 700);
        this.setLocationRelativeTo(null);

        s = new WebServiceT6_Service();
        conexion = s.getWebServiceT6Port();

        if (conexion != null) {
            System.out.println(""
                    + "********************************************************\n"
                    + "*         PSP - Tarea Individual 4 - Web Services      *\n"
                    + "********************************************************\n"
                    + "*               Nicolás Esteban Bórquez                  *\n"
                    + "********************************************************\n"
                    + "*                    55124290Y                         *\n"
                    + "******************************************************** ");
        } else {
            System.out.println("Error al iniciar el WebService.");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboListados = new javax.swing.JComboBox<>();
        btnPaisesMoneda = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMoneda = new javax.swing.JTextField();
        txtZonaGeografica = new javax.swing.JTextField();
        btnListadosGeneral = new javax.swing.JButton();
        btnPaisesZona = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtNombrePais = new javax.swing.JTextField();
        btnInfoPais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel1.setText("PSP Tarea 4 - Aplicación Cliente");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        jLabel2.setText("Operaciones:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        comboListados.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        comboListados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Listado de zonas geográficas", "Listado de monedas", "Listado de países completo" }));
        getContentPane().add(comboListados, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 155, -1, -1));

        btnPaisesMoneda.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        btnPaisesMoneda.setText("Ejecutar");
        btnPaisesMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaisesMonedaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaisesMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 320, -1, -1));

        txtArea.setColumns(20);
        txtArea.setFont(new java.awt.Font("Gadugi", 0, 12)); // NOI18N
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 340, 480));

        jLabel3.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel3.setText("Listado de países por zona geográfica:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel4.setText("Listado de países por moneda:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel5.setText("Listados:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel6.setText("Inserte el nombre de la moneda:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 325, -1, -1));

        jLabel7.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel7.setText("Inserte el nombre de la zona geográfica:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 245, -1, -1));

        txtMoneda.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        getContentPane().add(txtMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 100, -1));

        txtZonaGeografica.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        getContentPane().add(txtZonaGeografica, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 100, -1));

        btnListadosGeneral.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        btnListadosGeneral.setText("Ejecutar");
        btnListadosGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListadosGeneralActionPerformed(evt);
            }
        });
        getContentPane().add(btnListadosGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 155, -1, -1));

        btnPaisesZona.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        btnPaisesZona.setText("Ejecutar");
        btnPaisesZona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaisesZonaActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaisesZona, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel8.setText("Obtener información del país:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        jLabel9.setText("Seleccione un país:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, -1, -1));

        txtNombrePais.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        getContentPane().add(txtNombrePais, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, 100, -1));

        btnInfoPais.setFont(new java.awt.Font("Gadugi", 0, 15)); // NOI18N
        btnInfoPais.setText("Ejecutar");
        btnInfoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPaisActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfoPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 400, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListadosGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListadosGeneralActionPerformed

        switch (comboListados.getSelectedIndex()) {
            case 0:
                txtArea.setText("");
                txtArea.append("[----- LISTADO DE ZONAS GEOGRÁFICAS -----]" + "\n\n");
                List<Zona> listaZonas = conexion.getZonas();
                for (Zona z : listaZonas) {
                    txtArea.append("ID: " + String.valueOf(z.getId()) + "\n");
                    txtArea.append("Nombre: " + z.getNombre() + "\n\n");
                }
                break;

            case 1:
                txtArea.setText("");
                txtArea.append("[----- LISTADO DE MONEDAS -----]" + "\n\n");
                List<Moneda> listaMonedas = conexion.getMonedas();
                for (Moneda m : listaMonedas) {
                    txtArea.append("Código: " + m.getCodigo() + "\n");
                    txtArea.append("Nombre: " + m.getNombre() + "\n\n");
                }
                break;

            case 2:
                txtArea.setText("");
                txtArea.append("[----- LISTADO DE PAISES -----]" + "\n\n");
                List<Pais> listaPaises = conexion.getPaises();
                for (Pais p : listaPaises) {
                    txtArea.append("ID: " + p.getId() + "\n");
                    txtArea.append("Nombre: " + p.getNombre() + "\n");
                    txtArea.append("idArea: " + p.getIdArea() + "\n");
                    txtArea.append("Cod. Divisa: " + p.getCodigoDivisa() + "\n");
                    txtArea.append("Cod. Bandera: " + p.getCodigoBandera() + "\n");
                    txtArea.append("Cod. NIC: " + p.getCodigoNic() + "\n\n");
                }
                break;
        }
    }//GEN-LAST:event_btnListadosGeneralActionPerformed

    private void btnPaisesZonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaisesZonaActionPerformed

        //Zona geográfica introducida por el usuario
        String nombreZonaGeografica = this.txtZonaGeografica.getText();

        //Obtención del ID de la zona geográfica introducida por el usuario:
        //Lista con todos las zonas almacenados
        List<Zona> listaZonas = conexion.getZonas();
        long idZonaGeografica = 0;
        for (Zona z : listaZonas) {
            if (z.getNombre().equals(nombreZonaGeografica)) {
                //Se obtiene el ID de la zona geofráfica introducida por el usuario
                idZonaGeografica = z.getId();
            }
        }

        //Lista con todos los países almacenados
        List<Pais> listaPaises = conexion.getPaises();

        //ArrayList que almacena los paises de la zona geofráfica elegida
        ArrayList<Pais> listaPaisesSeleccionados = new ArrayList<Pais>();
        for (Pais p1 : listaPaises) {
            if (p1.getIdArea() == idZonaGeografica) {
                listaPaisesSeleccionados.add(p1);
            }
        }

        //La lista de paises de la zona geográfica seleccionada se muestra en el TextArea
        txtArea.setText("");
        txtArea.append("[----- PAISES DE: " + nombreZonaGeografica.toUpperCase() + " -----]" + "\n\n");
        for (Pais p : listaPaisesSeleccionados) {
            txtArea.append("ID: " + p.getId() + "\n");
            txtArea.append("Nombre: " + p.getNombre() + "\n");
            txtArea.append("ID Area: " + p.getIdArea() + "\n");
            txtArea.append("Nombre Area: " + nombreZonaGeografica + "\n");
            txtArea.append("Cod. Divisa: " + p.getCodigoDivisa() + "\n");
            txtArea.append("Cod. Bandera: " + p.getCodigoBandera() + "\n");
            txtArea.append("Cod. NIC: " + p.getCodigoNic() + "\n\n");
        }
        this.txtZonaGeografica.setText("");
    }//GEN-LAST:event_btnPaisesZonaActionPerformed

    private void btnPaisesMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaisesMonedaActionPerformed

        //Moneda introducida por el usuario
        String nombreMoneda = this.txtMoneda.getText();

        //Obtención del ID de la moneda introducida por el usuario:
        //Lista con todos las monedas almacenados
        List<Moneda> listaMonedas = conexion.getMonedas();
        String idMoneda = "";
        for (Moneda m : listaMonedas) {
            if (m.getNombre().equals(nombreMoneda)) {
                //Se obtiene el ID de la moneda introducida por el usuario
                idMoneda = m.getCodigo();
            }
        }

        //Lista con todos los países almacenados
        List<Pais> listaPaises = conexion.getPaises();

        //ArrayList que almacena los paises cuya moneda es la elegida por el usuario
        ArrayList<Pais> listaPaisesSeleccionados = new ArrayList<Pais>();
        for (Pais p1 : listaPaises) {
            if (p1.getCodigoDivisa().equals(idMoneda)) {
                listaPaisesSeleccionados.add(p1);
            }
        }

        //La lista de paises seleccionados se muestra en el TextArea
        txtArea.setText("");
        txtArea.append("[----- PAISES CUYA MONEDA ES: " + nombreMoneda.toUpperCase() + " -----]" + "\n\n");
        for (Pais p : listaPaisesSeleccionados) {
            txtArea.append("ID: " + p.getId() + "\n");
            txtArea.append("Nombre: " + p.getNombre() + "\n");
            txtArea.append("ID Area: " + p.getIdArea() + "\n");
            txtArea.append("Cod. Divisa: " + p.getCodigoDivisa() + "\n");
            txtArea.append("Nombre Divisa: " + nombreMoneda + "\n");
            txtArea.append("Cod. Bandera: " + p.getCodigoBandera() + "\n");
            txtArea.append("Cod. NIC: " + p.getCodigoNic() + "\n\n");
        }
        this.txtMoneda.setText("");
    }//GEN-LAST:event_btnPaisesMonedaActionPerformed

    private void btnInfoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPaisActionPerformed

        //Nombre del pais introducido por el usuario
        String nombrePais = this.txtNombrePais.getText();

        //Lista con todos los países almacenados
        List<Pais> listaPaises = conexion.getPaises();

        //Objeto Pais que almacenará la información del país introducido por el usuario
        Pais paisSeleccionado = null;
        for (Pais pais : listaPaises) {
            if (pais.getNombre().equals(nombrePais)) {
                paisSeleccionado = pais;
            }
        }

        //Obtención del nombre de la zona geográfica a partir de su ID:
        //Lista con todos las zonas almacenados
        List<Zona> listaZonas = conexion.getZonas();
        String nombreZonaGeografica = "";
        for (Zona z : listaZonas) {
            if (z.getId() == paisSeleccionado.getIdArea()) {
                //Nombre de la zona geográfica del país introducido por el usuario
                nombreZonaGeografica = z.getNombre();
            }
        }

        //Obtención del nombre de la moneda a partir de su ID:
        //Lista con todos las monedas almacenados
        List<Moneda> listaMonedas = conexion.getMonedas();
        String nombreMoneda = "";
        for (Moneda m : listaMonedas) {
            if (m.getCodigo().equals(paisSeleccionado.getCodigoDivisa())) {
                //Nombre de la moneda del país introducido por el usuario
                nombreMoneda = m.getNombre();
            }
        }

        //La información del país introducido se muestra en el TextArea
        txtArea.setText("");
        txtArea.append("[----- INFORMACIÓN DE: " + nombrePais.toUpperCase() + " -----]" + "\n\n");
        txtArea.append("Nombre: " + paisSeleccionado.getNombre() + "\n");
        txtArea.append("Zona geográfica: " + nombreZonaGeografica + "\n");
        txtArea.append("Nombre Divisa: " + nombreMoneda + "\n");
        txtArea.append("Cod. Bandera: " + paisSeleccionado.getCodigoBandera() + "\n");
        txtArea.append("Cod. NIC: " + paisSeleccionado.getCodigoNic() + "\n\n");

        this.txtNombrePais.setText("");
    }//GEN-LAST:event_btnInfoPaisActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInfoPais;
    private javax.swing.JButton btnListadosGeneral;
    private javax.swing.JButton btnPaisesMoneda;
    private javax.swing.JButton btnPaisesZona;
    private javax.swing.JComboBox<String> comboListados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtMoneda;
    private javax.swing.JTextField txtNombrePais;
    private javax.swing.JTextField txtZonaGeografica;
    // End of variables declaration//GEN-END:variables
}
