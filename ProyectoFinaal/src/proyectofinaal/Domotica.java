package proyectofinaal;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

public class Domotica extends javax.swing.JFrame {

    private final Document usuario;
    private String nombreUsuario; // Agrega esta variable
    
    public Domotica(Document usuario) {
        initComponents();
       
        this.usuario = usuario;

        // Obtener el valor del campo "usuario" del documento
        nombreUsuario = usuario.getString("nombre");

        // Configurar el texto del JLabelbienvenida
        jLabelbienvenida.setText("Bienvenido, " + nombreUsuario); 
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonLuces = new javax.swing.JButton();
        jButtonEstado = new javax.swing.JButton();
        jButtonTemperatura = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelbienvenida = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLuces.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\iconofocc (2).jpeg")); // NOI18N
        jButtonLuces.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLucesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLuces, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 100, 100));

        jButtonEstado.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\Registro (1).gif")); // NOI18N
        jButtonEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 100, 72));

        jButtonTemperatura.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\_515f4326-2e73-4979-b1b7-73fcc3b248ce (1).jpeg")); // NOI18N
        jButtonTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTemperaturaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 100, 100));

        jLabel4.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel4.setText("Usuarios");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 319, 120, 40));

        jLabel5.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel5.setText("Registro");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 110, 40));

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jLabel2.setText("Luces");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, 114, 40));

        jLabelbienvenida.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        getContentPane().add(jLabelbienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 280, 50));

        Fondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Desktop\\Proyecto Final POO\\FondoDomoticamenus.jpg")); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-300, 0, 670, 550));

        jButton1.setFont(new java.awt.Font("Edwardian Script ITC", 1, 36)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 120, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 370, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLucesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLucesActionPerformed
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    Luces menu = new Luces(usuario);
    
    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButtonLucesActionPerformed

    private void jButtonEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstadoActionPerformed
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    estado menu = new estado(usuario);
    
    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButtonEstadoActionPerformed

    private void jButtonTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTemperaturaActionPerformed
    // Cerrar la ventana actual
    dispose();

    // Crear una instancia de la ventana anterior (Menu)
    Usuarios menu = new Usuarios(usuario);
    
    // Hacer visible el JFrame
    menu.setVisible(true);
    }//GEN-LAST:event_jButtonTemperaturaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonEstado;
    private javax.swing.JButton jButtonLuces;
    private javax.swing.JButton jButtonTemperatura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelbienvenida;
    // End of variables declaration//GEN-END:variables
}
