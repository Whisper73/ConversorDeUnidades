
package co.com.conversor;

import java.awt.Color;
import co.com.codigo.*;

public class Monedas extends javax.swing.JFrame {
    
    int xMouse , yMouse;
    Validaciones validar = new Validaciones();
    public Monedas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        LpanelSup = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        subtitulo = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        de = new javax.swing.JLabel();
        menuDe = new javax.swing.JComboBox<>();
        a = new javax.swing.JLabel();
        menuA = new javax.swing.JComboBox<>();
        convertirBnt = new javax.swing.JPanel();
        convertirL = new javax.swing.JLabel();
        output = new javax.swing.JLabel();
        borrarBtn = new javax.swing.JPanel();
        borrarL = new javax.swing.JLabel();
        atrasBtn = new javax.swing.JLabel();
        copy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));

        panelSuperior.setBackground(new java.awt.Color(0, 153, 255));
        panelSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelSuperiorMouseDragged(evt);
            }
        });
        panelSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelSuperiorMousePressed(evt);
            }
        });

        LpanelSup.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        LpanelSup.setForeground(new java.awt.Color(255, 255, 255));
        LpanelSup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LpanelSup.setText("Conversor de Monedas.");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(LpanelSup)
                .addGap(35, 35, 35))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperiorLayout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(LpanelSup, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/com/imagenes/matematicas.png"))); // NOI18N
        img.setText("jLabel6");

        subtitulo.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        subtitulo.setForeground(new java.awt.Color(51, 51, 51));
        subtitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        subtitulo.setText("Ingresa el valor !");

        input.setBackground(new java.awt.Color(204, 204, 204));
        input.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        input.setForeground(new java.awt.Color(51, 51, 51));
        input.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        input.setBorder(new javax.swing.border.MatteBorder(null));
        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        de.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        de.setForeground(new java.awt.Color(51, 51, 51));
        de.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        de.setText("De :");

        menuDe.setBackground(new java.awt.Color(204, 204, 204));
        menuDe.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        menuDe.setForeground(new java.awt.Color(51, 51, 51));
        menuDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won Sur-coreano", "Peso - Colombiano" }));
        menuDe.setBorder(new javax.swing.border.MatteBorder(null));
        menuDe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        a.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        a.setForeground(new java.awt.Color(51, 51, 51));
        a.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a.setText("A :");

        menuA.setBackground(new java.awt.Color(204, 204, 204));
        menuA.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        menuA.setForeground(new java.awt.Color(51, 51, 51));
        menuA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólar", "Euro", "Libra Esterlina", "Yen Japonés", "Won Sur-coreano", "Peso - Colombiano" }));
        menuA.setBorder(new javax.swing.border.MatteBorder(null));
        menuA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        convertirBnt.setBackground(new java.awt.Color(0, 153, 255));
        convertirBnt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        convertirBnt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertirBntMouseClicked(evt);
            }
        });

        convertirL.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        convertirL.setForeground(new java.awt.Color(255, 255, 255));
        convertirL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        convertirL.setText("Convertir");

        javax.swing.GroupLayout convertirBntLayout = new javax.swing.GroupLayout(convertirBnt);
        convertirBnt.setLayout(convertirBntLayout);
        convertirBntLayout.setHorizontalGroup(
            convertirBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, convertirBntLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(convertirL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        convertirBntLayout.setVerticalGroup(
            convertirBntLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, convertirBntLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(convertirL)
                .addContainerGap())
        );

        output.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        output.setForeground(new java.awt.Color(51, 51, 51));
        output.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output.setText("0.00");
        output.setToolTipText("");
        output.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        borrarBtn.setBackground(new java.awt.Color(0, 153, 255));
        borrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        borrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                borrarBtnMouseClicked(evt);
            }
        });

        borrarL.setFont(new java.awt.Font("Candara", 1, 18)); // NOI18N
        borrarL.setForeground(new java.awt.Color(255, 255, 255));
        borrarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        borrarL.setText("Borrar");

        javax.swing.GroupLayout borrarBtnLayout = new javax.swing.GroupLayout(borrarBtn);
        borrarBtn.setLayout(borrarBtnLayout);
        borrarBtnLayout.setHorizontalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarBtnLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(borrarL, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        borrarBtnLayout.setVerticalGroup(
            borrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borrarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(borrarL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        atrasBtn.setFont(new java.awt.Font("Arial", 1, 55)); // NOI18N
        atrasBtn.setForeground(new java.awt.Color(51, 51, 51));
        atrasBtn.setText("←");
        atrasBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                atrasBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasBtnMouseExited(evt);
            }
        });

        copy.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        copy.setText("© 2023 Power by Java | Dev Whisper73");

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(de)
                        .addGap(32, 32, 32)
                        .addComponent(menuDe, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(menuA, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(copy)))
                .addGap(50, 50, 50)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(convertirBnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(subtitulo))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(a))
            .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(de)
                    .addComponent(menuDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(menuA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(copy))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(output, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(convertirBnt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(subtitulo))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(a))
            .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(borrarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBtnMouseEntered
        this.atrasBtn.setForeground(Color.red);        // TODO add your handling code here:
    }//GEN-LAST:event_atrasBtnMouseEntered

    private void atrasBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBtnMouseExited
         this.atrasBtn.setForeground(new java.awt.Color(51, 51, 51));         // TODO add your handling code here:
    }//GEN-LAST:event_atrasBtnMouseExited

    private void atrasBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasBtnMouseClicked
        ventanaPrincipal vp = new ventanaPrincipal();  
        this.setVisible(false);
        vp.setVisible(true);
           // TODO add your handling code here:
    }//GEN-LAST:event_atrasBtnMouseClicked

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        this.input.requestFocus();   
    }//GEN-LAST:event_inputActionPerformed

    private void convertirBntMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_convertirBntMouseClicked
        int index1, index2;
        double inputTxt = 0, outputTxt;
        
        
        if(this.validar.validarNumero(this.input.getText())){    
            inputTxt = Double.parseDouble((this.input.getText()));
        }else{
            this.input.setText("");
            this.input.requestFocus();   
        }
        
       

        index1 = this.menuDe.getSelectedIndex();
        index2 = this.menuA.getSelectedIndex();
        
       
        ConversorMonedas cm = new ConversorMonedas(inputTxt, index1, index2);
        cm.convertirAmonedaFinal();
        outputTxt=cm.getResultado();
        this.output.setText(String.valueOf(String.format("%.2f",outputTxt)));
    }//GEN-LAST:event_convertirBntMouseClicked

    private void panelSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMousePressed
            xMouse = evt.getX();
            yMouse = evt.getY();
            
    }//GEN-LAST:event_panelSuperiorMousePressed

    private void panelSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelSuperiorMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       
       this.setLocation(x-xMouse, y-yMouse);
    }//GEN-LAST:event_panelSuperiorMouseDragged

    private void borrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borrarBtnMouseClicked
        this.input.setText("");
        this.input.requestFocus();
        this.menuDe.setSelectedIndex(0);
        this.menuA.setSelectedIndex(0);
        this.output.setText("00,0");
        
    }//GEN-LAST:event_borrarBtnMouseClicked

    
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
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Monedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Monedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LpanelSup;
    private javax.swing.JLabel a;
    private javax.swing.JLabel atrasBtn;
    private javax.swing.JPanel background;
    private javax.swing.JPanel borrarBtn;
    private javax.swing.JLabel borrarL;
    private javax.swing.JPanel convertirBnt;
    private javax.swing.JLabel convertirL;
    private javax.swing.JLabel copy;
    private javax.swing.JLabel de;
    private javax.swing.JLabel img;
    private javax.swing.JTextField input;
    private javax.swing.JComboBox<String> menuA;
    private javax.swing.JComboBox<String> menuDe;
    private javax.swing.JLabel output;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JLabel subtitulo;
    // End of variables declaration//GEN-END:variables
}
