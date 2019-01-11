/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author User
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form VentanaCalculadora
     */
    public VentanaCalculadora() {
        initComponents();
    }
    
    private void numeroPulsado(String numero){
        if(pantalla.getText()=="0"){
            pantalla.setText(numero);
        }
        else{
         pantalla.setText(pantalla.getText() + numero);   
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

        pantalla = new javax.swing.JLabel();
        boton07 = new javax.swing.JButton();
        boton08 = new javax.swing.JButton();
        boton09 = new javax.swing.JButton();
        botonsuma = new javax.swing.JButton();
        boton04 = new javax.swing.JButton();
        boton05 = new javax.swing.JButton();
        boton06 = new javax.swing.JButton();
        botonmenos = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonmultiplicar = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        botonigual = new javax.swing.JButton();
        botondividir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);

        boton07.setBackground(new java.awt.Color(0, 0, 0));
        boton07.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton07.setForeground(new java.awt.Color(51, 255, 51));
        boton07.setText("7");
        boton07.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton07MousePressed(evt);
            }
        });
        boton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton07ActionPerformed(evt);
            }
        });

        boton08.setBackground(new java.awt.Color(0, 0, 0));
        boton08.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton08.setForeground(new java.awt.Color(51, 255, 51));
        boton08.setText("8");
        boton08.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton08MousePressed(evt);
            }
        });

        boton09.setBackground(new java.awt.Color(0, 0, 0));
        boton09.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton09.setForeground(new java.awt.Color(51, 255, 51));
        boton09.setText("9");
        boton09.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton09MousePressed(evt);
            }
        });

        botonsuma.setBackground(new java.awt.Color(0, 0, 0));
        botonsuma.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        botonsuma.setForeground(new java.awt.Color(51, 255, 51));
        botonsuma.setText("+");
        botonsuma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonsumaMousePressed(evt);
            }
        });

        boton04.setBackground(new java.awt.Color(0, 0, 0));
        boton04.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton04.setForeground(new java.awt.Color(51, 255, 51));
        boton04.setText("4");
        boton04.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton04MousePressed(evt);
            }
        });

        boton05.setBackground(new java.awt.Color(0, 0, 0));
        boton05.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton05.setForeground(new java.awt.Color(51, 255, 51));
        boton05.setText("5");
        boton05.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton05MousePressed(evt);
            }
        });

        boton06.setBackground(new java.awt.Color(0, 0, 0));
        boton06.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton06.setForeground(new java.awt.Color(51, 255, 51));
        boton06.setText("6");
        boton06.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton06MousePressed(evt);
            }
        });

        botonmenos.setBackground(new java.awt.Color(0, 0, 0));
        botonmenos.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        botonmenos.setForeground(new java.awt.Color(51, 255, 51));
        botonmenos.setText("-");
        botonmenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonmenosMousePressed(evt);
            }
        });

        boton1.setBackground(new java.awt.Color(0, 0, 0));
        boton1.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton1.setForeground(new java.awt.Color(51, 255, 51));
        boton1.setText("1");
        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton1MousePressed(evt);
            }
        });

        boton2.setBackground(new java.awt.Color(0, 0, 0));
        boton2.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton2.setForeground(new java.awt.Color(51, 255, 51));
        boton2.setText("2");
        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton2MousePressed(evt);
            }
        });

        boton3.setBackground(new java.awt.Color(0, 0, 0));
        boton3.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        boton3.setForeground(new java.awt.Color(51, 255, 51));
        boton3.setText("3");
        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                boton3MousePressed(evt);
            }
        });

        botonmultiplicar.setBackground(new java.awt.Color(0, 0, 0));
        botonmultiplicar.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        botonmultiplicar.setForeground(new java.awt.Color(51, 255, 51));
        botonmultiplicar.setText("*");
        botonmultiplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonmultiplicarMousePressed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jButton13.setForeground(new java.awt.Color(51, 255, 51));
        jButton13.setText("0");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });

        botonigual.setBackground(new java.awt.Color(0, 0, 0));
        botonigual.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        botonigual.setForeground(new java.awt.Color(51, 255, 51));
        botonigual.setText("=");
        botonigual.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonigualMousePressed(evt);
            }
        });

        botondividir.setBackground(new java.awt.Color(0, 0, 0));
        botondividir.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        botondividir.setForeground(new java.awt.Color(51, 255, 51));
        botondividir.setText("/");
        botondividir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botondividirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton07, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botondividir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton07, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonmultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(botonigual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botondividir, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton07MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton07MousePressed
        numeroPulsado("7");
    }//GEN-LAST:event_boton07MousePressed

    private void boton08MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton08MousePressed
        numeroPulsado("8");
    }//GEN-LAST:event_boton08MousePressed

    private void boton09MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton09MousePressed
        numeroPulsado("9");
    }//GEN-LAST:event_boton09MousePressed

    private void botonsumaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonsumaMousePressed
        numeroPulsado("+");
    }//GEN-LAST:event_botonsumaMousePressed

    private void boton04MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton04MousePressed
        numeroPulsado("4");
    }//GEN-LAST:event_boton04MousePressed

    private void boton05MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton05MousePressed
        numeroPulsado("5");
    }//GEN-LAST:event_boton05MousePressed

    private void boton06MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton06MousePressed
        numeroPulsado("6");
    }//GEN-LAST:event_boton06MousePressed

    private void botonmenosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmenosMousePressed
        numeroPulsado("-");
    }//GEN-LAST:event_botonmenosMousePressed

    private void boton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MousePressed
        numeroPulsado("1");
    }//GEN-LAST:event_boton1MousePressed

    private void boton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MousePressed
        numeroPulsado("2");
    }//GEN-LAST:event_boton2MousePressed

    private void boton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MousePressed
        numeroPulsado("3");
    }//GEN-LAST:event_boton3MousePressed

    private void botonmultiplicarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonmultiplicarMousePressed
        numeroPulsado("*");
    }//GEN-LAST:event_botonmultiplicarMousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        numeroPulsado("0");
    }//GEN-LAST:event_jButton13MousePressed

    private void botonigualMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonigualMousePressed
        numeroPulsado("=");
    }//GEN-LAST:event_botonigualMousePressed

    private void botondividirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botondividirMousePressed
        numeroPulsado("/");
    }//GEN-LAST:event_botondividirMousePressed

    private void boton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton07ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boton07ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton04;
    private javax.swing.JButton boton05;
    private javax.swing.JButton boton06;
    private javax.swing.JButton boton07;
    private javax.swing.JButton boton08;
    private javax.swing.JButton boton09;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton botondividir;
    private javax.swing.JButton botonigual;
    private javax.swing.JButton botonmenos;
    private javax.swing.JButton botonmultiplicar;
    private javax.swing.JButton botonsuma;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
