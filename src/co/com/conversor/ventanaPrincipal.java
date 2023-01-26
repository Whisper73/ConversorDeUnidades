
package co.com.conversor;

public class ventanaPrincipal extends javax.swing.JFrame {
    
    Monedas vMonedas = new Monedas();
    UnidadesDeMedida vUnidades = new UnidadesDeMedida ();
    UnidadesDeTemperatura vUnidadesT = new UnidadesDeTemperatura();
    int xMouse , yMouse;
    public ventanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGround = new javax.swing.JPanel();
        img = new javax.swing.JLabel();
        PanelSuperior = new javax.swing.JPanel();
        salirX = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();
        monedas = new javax.swing.JPanel();
        Lmonedas = new javax.swing.JLabel();
        uMedida = new javax.swing.JPanel();
        LuMedida = new javax.swing.JLabel();
        temperatura = new javax.swing.JPanel();
        Ltemperatura = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        backGround.setBackground(new java.awt.Color(255, 255, 255));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/imagenes/matematicas.png"))); // NOI18N
        img.setText("jLabel1");

        PanelSuperior.setBackground(new java.awt.Color(0, 153, 255));
        PanelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                PanelSuperiorMouseDragged(evt);
            }
        });
        PanelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PanelSuperiorMousePressed(evt);
            }
        });

        salirX.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        salirX.setForeground(new java.awt.Color(51, 51, 51));
        salirX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        salirX.setText("X");
        salirX.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        salirX.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salirX.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                salirXMouseDragged(evt);
            }
        });
        salirX.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirXMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirXMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirXMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirXMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(salirX)
                .addContainerGap(465, Short.MAX_VALUE))
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(salirX, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        titulo.setFont(new java.awt.Font("Candara", 1, 48)); // NOI18N
        titulo.setForeground(new java.awt.Color(51, 51, 51));
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Convierte !");

        subtitulo.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(51, 51, 51));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Conversor de monedas y unidades.");

        copy.setFont(new java.awt.Font("Candara", 1, 12)); // NOI18N
        copy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copy.setText("© 2023 Power by Java | Dev Whisper73");

        monedas.setBackground(new java.awt.Color(0, 153, 255));
        monedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monedasMouseClicked(evt);
            }
        });

        Lmonedas.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Lmonedas.setForeground(new java.awt.Color(255, 255, 255));
        Lmonedas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lmonedas.setText("Monedas");
        Lmonedas.setAlignmentY(0.0F);
        Lmonedas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout monedasLayout = new javax.swing.GroupLayout(monedas);
        monedas.setLayout(monedasLayout);
        monedasLayout.setHorizontalGroup(
            monedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monedasLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Lmonedas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        monedasLayout.setVerticalGroup(
            monedasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lmonedas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        uMedida.setBackground(new java.awt.Color(0, 153, 255));
        uMedida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uMedida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uMedidaMouseClicked(evt);
            }
        });

        LuMedida.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        LuMedida.setForeground(new java.awt.Color(255, 255, 255));
        LuMedida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LuMedida.setText("Unidades de medida");
        LuMedida.setAlignmentY(0.0F);

        javax.swing.GroupLayout uMedidaLayout = new javax.swing.GroupLayout(uMedida);
        uMedida.setLayout(uMedidaLayout);
        uMedidaLayout.setHorizontalGroup(
            uMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uMedidaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(LuMedida)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        uMedidaLayout.setVerticalGroup(
            uMedidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LuMedida, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        temperatura.setBackground(new java.awt.Color(0, 153, 255));
        temperatura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        temperatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                temperaturaMouseClicked(evt);
            }
        });

        Ltemperatura.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        Ltemperatura.setForeground(new java.awt.Color(255, 255, 255));
        Ltemperatura.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ltemperatura.setText("Temperatura");
        Ltemperatura.setAlignmentY(0.0F);

        javax.swing.GroupLayout temperaturaLayout = new javax.swing.GroupLayout(temperatura);
        temperatura.setLayout(temperaturaLayout);
        temperaturaLayout.setHorizontalGroup(
            temperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(temperaturaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Ltemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        temperaturaLayout.setVerticalGroup(
            temperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ltemperatura, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backGroundLayout = new javax.swing.GroupLayout(backGround);
        backGround.setLayout(backGroundLayout);
        backGroundLayout.setHorizontalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backGroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        backGroundLayout.setVerticalGroup(
            backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundLayout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(subtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(monedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(uMedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(temperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(copy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backGroundLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGround, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirXMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseClicked
        System.exit(0);
                   // TODO add your handling code here:
    }//GEN-LAST:event_salirXMouseClicked

    private void salirXMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseDragged
        
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);        // TODO add your handling code here:
    }//GEN-LAST:event_salirXMouseDragged

    private void salirXMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_salirXMousePressed

    private void PanelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();// TODO add your handling code here:
    }//GEN-LAST:event_PanelSuperiorMousePressed

    private void PanelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x-xMouse,y-yMouse);  // TODO add your handling code here:
    }//GEN-LAST:event_PanelSuperiorMouseDragged

    private void salirXMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseExited
           salirX.setForeground(new java.awt.Color(51, 51, 51));
           // TODO add your handling code here:
    }//GEN-LAST:event_salirXMouseExited

    private void salirXMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirXMouseEntered
        salirX.setForeground(new java.awt.Color(255, 0, 0));        // TODO add your handling code here:
    }//GEN-LAST:event_salirXMouseEntered

    private void monedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monedasMouseClicked
           this.setVisible(false);
           vMonedas.setVisible(true);
    }//GEN-LAST:event_monedasMouseClicked

    private void uMedidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uMedidaMouseClicked
         this.setVisible(false);
         vUnidades.setVisible(true);
    }//GEN-LAST:event_uMedidaMouseClicked

    private void temperaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_temperaturaMouseClicked
        this.setVisible(false);
         vUnidadesT.setVisible(true);
    }//GEN-LAST:event_temperaturaMouseClicked
    
    
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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lmonedas;
    private javax.swing.JLabel Ltemperatura;
    private javax.swing.JLabel LuMedida;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JPanel backGround;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel img;
    private javax.swing.JPanel monedas;
    private javax.swing.JLabel salirX;
    private javax.swing.JLabel subtitulo;
    private javax.swing.JPanel temperatura;
    private javax.swing.JLabel titulo;
    private javax.swing.JPanel uMedida;
    // End of variables declaration//GEN-END:variables
}
