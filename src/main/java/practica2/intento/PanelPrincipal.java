
package practica2.intento;

import practica2.intento.datos.InicioSesion;
import practica2.intento.datos.Jugadores;
import practica2.intento.datos.Registrarse;
import practica2.intento.juegos.damas.Damas01;
import practica2.intento.juegos.piramide.Piramide;
import practica2.intento.util.Mensaje;

/**
 *
 * @author Bohem
 */
public class PanelPrincipal extends javax.swing.JFrame {


    public PanelPrincipal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemSesion = new javax.swing.JMenuItem();
        jMenuItemRegistrar = new javax.swing.JMenuItem();
        jMenuItemEstadis = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuMenu = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Damas");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Piramide");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Jugar");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("sin jugador");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Jugador");

        jMenu1.setText("Usuario");

        jMenuItemSesion.setText("Iniciar sesion");
        jMenuItemSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemSesionMouseClicked(evt);
            }
        });
        jMenuItemSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSesionActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemSesion);

        jMenuItemRegistrar.setText("Registrase");
        jMenuItemRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRegistrarActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemRegistrar);

        jMenuItemEstadis.setText("Estadisticas");
        jMenuItemEstadis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemEstadisMouseClicked(evt);
            }
        });
        jMenuItemEstadis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEstadisActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemEstadis);

        jMenuItem1.setText("Cerrar sesion");
        jMenu1.add(jMenuItem1);

        jMenuMenu.setText("Salir");
        jMenuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMenuActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText(" ");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemEstadisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemEstadisMouseClicked

    }//GEN-LAST:event_jMenuItemEstadisMouseClicked

    private void jMenuItemEstadisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEstadisActionPerformed
  Jugadores abrir= new Jugadores();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemEstadisActionPerformed

    private void jMenuItemRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRegistrarActionPerformed
     
        Registrarse abrir= new Registrarse();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenuItemRegistrarActionPerformed

    private void jMenuItemSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSesionActionPerformed
       
        InicioSesion abrir = new InicioSesion();
        abrir.setVisible(true);
    }//GEN-LAST:event_jMenuItemSesionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
       Damas01 abrir = new Damas01();
       abrir.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Piramide abrir = new Piramide();
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMenuActionPerformed
        
        ///// salir XD
    }//GEN-LAST:event_jMenuMenuActionPerformed

    private void jMenuItemSesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemSesionMouseClicked
       Mensaje.mostarMensajeError(" hola señores"," ¨Bienvenido");
    }//GEN-LAST:event_jMenuItemSesionMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemEstadis;
    private javax.swing.JMenuItem jMenuItemRegistrar;
    private javax.swing.JMenuItem jMenuItemSesion;
    private javax.swing.JMenu jMenuMenu;
    // End of variables declaration//GEN-END:variables
}
