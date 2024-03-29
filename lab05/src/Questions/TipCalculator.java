/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Questions;

/**
 *
 * @author rwetz
 */
public class TipCalculator extends javax.swing.JFrame {

    /**
     * Creates new form TipCalculator
     */
    public TipCalculator() {
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

        jLabel1 = new javax.swing.JLabel();
        billAmountLabel = new javax.swing.JLabel();
        billDollarAmountLabel = new javax.swing.JTextField();
        tipButton10 = new javax.swing.JButton();
        tipButton15 = new javax.swing.JButton();
        tipButton20 = new javax.swing.JButton();
        tipToBeLeftLabel = new javax.swing.JLabel();
        tipDollarAmountLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("                                        Tip Calculator");

        billAmountLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        billAmountLabel.setText("Bill Amount:");

        billDollarAmountLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billDollarAmountLabelActionPerformed(evt);
            }
        });

        tipButton10.setText("10% Tip");
        tipButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipButton10ActionPerformed(evt);
            }
        });

        tipButton15.setText("15% Tip");
        tipButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipButton15ActionPerformed(evt);
            }
        });

        tipButton20.setText("20% Tip");
        tipButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipButton20ActionPerformed(evt);
            }
        });

        tipToBeLeftLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tipToBeLeftLabel.setText("The amount to be left as a tip is:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tipToBeLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(billAmountLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(billDollarAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tipButton20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tipButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tipDollarAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(billDollarAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tipButton10)
                .addGap(18, 18, 18)
                .addComponent(tipButton15)
                .addGap(18, 18, 18)
                .addComponent(tipButton20)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tipToBeLeftLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tipDollarAmountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        tipDollarAmountLabel.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void billDollarAmountLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billDollarAmountLabelActionPerformed
        
    }//GEN-LAST:event_billDollarAmountLabelActionPerformed

    private void tipButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipButton10ActionPerformed
        double billValue = Double.parseDouble(billDollarAmountLabel.getText());
        double result10 = billValue * 0.10;
        tipDollarAmountLabel.setText(String.valueOf(result10));
    }//GEN-LAST:event_tipButton10ActionPerformed

    private void tipButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipButton15ActionPerformed
        double billValue = Double.parseDouble(billDollarAmountLabel.getText());
        double result15 = billValue * 0.15;
        tipDollarAmountLabel.setText(String.valueOf(result15));
    }//GEN-LAST:event_tipButton15ActionPerformed

    private void tipButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipButton20ActionPerformed
        double billValue = Double.parseDouble(billDollarAmountLabel.getText());
        double result20 = billValue * 0.20;
        tipDollarAmountLabel.setText(String.valueOf(result20));
    }//GEN-LAST:event_tipButton20ActionPerformed
    
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
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TipCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TipCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel billAmountLabel;
    public javax.swing.JTextField billDollarAmountLabel;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JButton tipButton10;
    public javax.swing.JButton tipButton15;
    public javax.swing.JButton tipButton20;
    public javax.swing.JLabel tipDollarAmountLabel;
    public javax.swing.JLabel tipToBeLeftLabel;
    // End of variables declaration//GEN-END:variables
}
