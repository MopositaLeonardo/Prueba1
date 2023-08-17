/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinaal;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import org.bson.Document;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import jssc.SerialPort;
import jssc.SerialPortException;

/**
 *
 * @author User
 */
public class Luces extends javax.swing.JFrame {
    
    private Document usuario;
    private String nombreUsuario;
    private MongoClient mongoClient;
    private MongoDatabase database;
    private PanamaHitek_Arduino arduino;


    public Luces(Document usuario) {
    initComponents();
        String connectionString = "mongodb://localhost:27017";
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase("domotica");
        this.usuario = usuario;
        nombreUsuario = usuario.getString("nombre");

        try {
            arduino = new PanamaHitek_Arduino();
            arduino.arduinoTX("COM3", 9600); // Cambia "COM3" por el puerto correcto
        } catch (ArduinoException ex) {
            ex.printStackTrace();
        }
    
}
    /**
     * Creates new form Luces
     */
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        Encender = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitulo.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabelTitulo.setText("Luces");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, 50));

        Encender.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        Encender.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\prender lus.jpeg")); // NOI18N
        Encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncenderActionPerformed(evt);
            }
        });
        getContentPane().add(Encender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 100, 100));

        Apagar.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        Apagar.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\apagarluces.jpeg")); // NOI18N
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });
        getContentPane().add(Apagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 100, 100));

        jButtonRegresar.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 150, 50));

        jLabel5.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel5.setText("Apagar");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 150, 50));

        jLabel6.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel6.setText("Encender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 150, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\fondoluces.jpeg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 790, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncenderActionPerformed

    controlarLuces("Encendido");

        
    }//GEN-LAST:event_EncenderActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed

    controlarLuces("Apagado");

    }//GEN-LAST:event_ApagarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    Domotica menu = new Domotica(usuario);
    
    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

   private void controlarLuces(String accion) {
        try {
            if (accion.equals("Encendido")) {
                System.out.println("Enviando comando 'a' al Arduino");
                arduino.sendData("a");
            } else if (accion.equals("Apagado")) {
                System.out.println("Enviando comando 'x' al Arduino");
                arduino.sendData("x");
            }

            // Obtener la hora y fecha actual
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fechaHora = sdf.format(new Date());

            // Insertar registro en la colección "luces"
            MongoCollection<Document> lucesCollection = database.getCollection("luces");
            Document registroLuces = new Document()
                .append("usuario", nombreUsuario)
                .append("accion", accion)
                .append("fechaHora", fechaHora);
            lucesCollection.insertOne(registroLuces);

            JOptionPane.showMessageDialog(this, "Operación de " + accion + " realizada.");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al controlar las luces: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Encender;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
