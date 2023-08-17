
package proyectofinaal;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.JOptionPane;

public class registro extends javax.swing.JFrame {

    private String nombre;
    private String usuario;
    private String contrasena;
    private MongoClient mongoClient;
    private MongoDatabase database;

    public registro() {
        initComponents();
        this.setLocationRelativeTo(null);
         String connectionString = "mongodb://localhost:27017"; // Cambia la URL y el puerto según tu configuración
        mongoClient = MongoClients.create(connectionString);
        database = mongoClient.getDatabase("domotica"); // Cambia el nombre de la base de datos si es necesario
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonRegidstrar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPassword = new javax.swing.JPasswordField();
        jLabelFondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel1.setText("Registro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 170, 50));

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel2.setText("Ingrese su Nombre");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 400, 40));

        jLabel3.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel3.setText("Ingrese su Usuario");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 250, 40));

        jLabel4.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel4.setText("Ingrese su Contrasena");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 300, 40));

        jButtonRegidstrar.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jButtonRegidstrar.setText("Registrar");
        jButtonRegidstrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegidstrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegidstrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 160, 50));

        jTextFieldNombre.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 310, 40));

        jTextFieldUsuario.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 310, 40));

        jPassword.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 310, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\fondoDomotica.jpeg")); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 580));

        jButton1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 510, 150, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\fondoceleste.jpg")); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 420, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegidstrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegidstrarActionPerformed
    nombre = jTextFieldNombre.getText();
    usuario = jTextFieldUsuario.getText();
    contrasena = new String(jPassword.getPassword());

    // Validación de formato de nombre, usuario y contraseña
    if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$")) {
        JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras y espacios.", "Formato inválido", JOptionPane.WARNING_MESSAGE);
    } else if (!usuario.matches("^[a-zA-Z0-9]+$")) {
        JOptionPane.showMessageDialog(this, "El usuario solo debe contener letras y números.", "Formato inválido", JOptionPane.WARNING_MESSAGE);
    } else {
        try {
            MongoCollection<Document> usuariosCollection = database.getCollection("usuarios");

            Document nuevoUsuario = new Document("nombre", nombre)
                .append("usuario", usuario)
                .append("contrasena", contrasena);

            usuariosCollection.insertOne(nuevoUsuario);

            JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente en la base de datos.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al guardar los datos en la base de datos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        JOptionPane.showMessageDialog(this, "Los datos se han guardado exitosamente.", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
        
        // Cerrar la ventana actual (Registro)
        dispose();
        
        // Crear una instancia de la ventana de inicio de sesión (login)
        login menu= new login();
        menu.setVisible(true);
    }
    }//GEN-LAST:event_jButtonRegidstrarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
    
    String nombreText = jTextFieldNombre.getText();
    
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
    
    String apellidoText = jTextFieldUsuario.getText();
    
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordActionPerformed
    char[] password = jPassword.getPassword(); // Obtener la contraseña ingresada como un arreglo de caracteres
    }//GEN-LAST:event_jPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    login menu = new login();
    
    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRegidstrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPasswordField jPassword;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
