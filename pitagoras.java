/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Windows 10
 */
public class pitagoras extends javax.swing.JFrame {

    /**
     * Creates new form pitagoras
     */
    public pitagoras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title1 = new javax.swing.JLabel();
        formula1 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        formula2 = new javax.swing.JLabel();
        button1 = new javax.swing.JButton();
        exibir = new javax.swing.JLabel();
        button2 = new javax.swing.JButton();
        exibir3 = new javax.swing.JLabel();
        exibir2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 102, 0));
        title1.setText("PITAGORAS");

        formula1.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        formula1.setText("Fórmula: H² = C² + C²");

        a.setBackground(new java.awt.Color(255, 102, 0));
        a.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });

        jLabel3.setText("²");

        jLabel1.setText("=");

        b.setBackground(new java.awt.Color(255, 102, 0));
        b.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        b.setForeground(new java.awt.Color(255, 255, 255));
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });

        jLabel4.setText("²");

        jLabel2.setText("+");

        c.setBackground(new java.awt.Color(255, 102, 0));
        c.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        c.setForeground(new java.awt.Color(255, 255, 255));
        c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cActionPerformed(evt);
            }
        });

        jLabel5.setText("²");

        formula2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        formula2.setText("Digite \"0\" na medida não conhecida");

        button1.setBackground(new java.awt.Color(255, 102, 0));
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Calcular");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        exibir.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        exibir.setForeground(new java.awt.Color(255, 102, 0));
        exibir.setText("jLabel6");
        exibir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                exibirAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        button2.setBackground(new java.awt.Color(255, 102, 0));
        button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Limpar");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        exibir3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        exibir3.setForeground(new java.awt.Color(255, 102, 0));
        exibir3.setText("jLabel6");
        exibir3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                exibir3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        exibir2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        exibir2.setForeground(new java.awt.Color(255, 102, 0));
        exibir2.setText("jLabel6");
        exibir2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                exibir2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(button2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(113, 113, 113))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(title1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formula1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formula2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exibir3)
                            .addComponent(exibir)
                            .addComponent(exibir2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(formula1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formula2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)))))
                .addGap(18, 18, 18)
                .addComponent(button1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button2)
                .addGap(30, 30, 30)
                .addComponent(exibir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exibir2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exibir3)
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bActionPerformed

    private void cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        double hipotenusa, cateto1, cateto2; // declarando variaveis do tipo double
        double calculo;
        //copiando valores colocado nas caixas de texto
        hipotenusa = Double.parseDouble(a.getText());
        cateto1 = Double.parseDouble(b.getText());
        cateto2 = Double.parseDouble(c.getText());

      
            if (hipotenusa == 0) {
                calculo = (cateto1 * cateto1) + (cateto2 * cateto2);
                exibir.setText("• Hipotenusa: " + Math.sqrt(calculo));
                exibir2.setText("1º Cateto: " + cateto1);
                exibir3.setText("2º Cateto: " + cateto2);
            } else if (cateto1 == 0) {
                calculo = cateto1 = (hipotenusa * hipotenusa) - (cateto2 * cateto2);
                exibir.setText("Hipotenusa: " + hipotenusa);
                exibir2.setText("• 1º Cateto : " + Math.sqrt(calculo));
                exibir3.setText("2º Cateto: " + cateto2);
            } else if (cateto2 == 0) {
                calculo = cateto2 = (hipotenusa * hipotenusa) - (cateto1 * cateto1);
                exibir.setText("Hipotenusa: " + hipotenusa);
                exibir2.setText("1º Cateto: " + cateto1);
                exibir3.setText("• 2º Cateto: " + Math.sqrt(calculo));
            } else {
                exibir.setText("Foram digitados todos os lados");
            }


    }//GEN-LAST:event_button1ActionPerformed

    private void exibirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_exibirAncestorAdded
        exibir.setText(null);
    }//GEN-LAST:event_exibirAncestorAdded

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        a.setText(null);
        b.setText(null);
        c.setText(null);
        exibir.setText(null);
        exibir2.setText(null);
        exibir3.setText(null);
        a.requestFocus();
    }//GEN-LAST:event_button2ActionPerformed

    private void exibir3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_exibir3AncestorAdded
        exibir3.setText(null);
    }//GEN-LAST:event_exibir3AncestorAdded

    private void exibir2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_exibir2AncestorAdded
        exibir2.setText(null);
    }//GEN-LAST:event_exibir2AncestorAdded

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
            java.util.logging.Logger.getLogger(pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pitagoras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pitagoras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.JTextField b;
    private javax.swing.JButton button1;
    private javax.swing.JButton button2;
    private javax.swing.JTextField c;
    private javax.swing.JLabel exibir;
    private javax.swing.JLabel exibir2;
    private javax.swing.JLabel exibir3;
    private javax.swing.JLabel formula1;
    private javax.swing.JLabel formula2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel title1;
    // End of variables declaration//GEN-END:variables
}
