/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions;

import java.util.Random;

/**
 *
 * @author ryan.wetzstein
 */
public class NumberGuess extends javax.swing.JFrame {

    /**
     * Creates new form NumberGuess
     */
    public NumberGuess() {
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

        instructionsLabel = new javax.swing.JLabel();
        guessTextField = new javax.swing.JTextField();
        numberRangeLabel = new javax.swing.JLabel();
        guessSubmitButton = new javax.swing.JButton();
        newSecretNumButton = new javax.swing.JButton();
        guessResultField = new javax.swing.JLabel();
        yourGuessLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        instructionsLabel.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        instructionsLabel.setText("ENTER YOUR GUESS");

        guessTextField.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        guessTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessTextFieldActionPerformed(evt);
            }
        });

        numberRangeLabel.setText("The number is from 1-100...");

        guessSubmitButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        guessSubmitButton.setText("SUBMIT YOUR GUESS");
        guessSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guessSubmitButtonActionPerformed(evt);
            }
        });

        newSecretNumButton.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        newSecretNumButton.setText("GET NEW SECRET NUMBER");
        newSecretNumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newSecretNumButtonActionPerformed(evt);
            }
        });

        guessResultField.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N

        yourGuessLabel.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        yourGuessLabel.setText("Your guess was:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructionsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numberRangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(guessTextField)
                            .addComponent(newSecretNumButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guessSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yourGuessLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guessResultField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(numberRangeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(guessTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(guessSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(newSecretNumButton, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(guessResultField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yourGuessLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Random rand = new Random();
    int newNumber = rand.nextInt(100) + 1;
    int compareNumber = rand.nextInt(100) + 1;

    //guess entry text box//
    private void guessTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessTextFieldActionPerformed
        
    }//GEN-LAST:event_guessTextFieldActionPerformed
    //guess submit button//
    private void guessSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guessSubmitButtonActionPerformed
        Integer inputNumber = Integer.parseInt(guessTextField.getText());
        if (inputNumber < compareNumber) {
            guessResultField.setText("too low");
        } else if (inputNumber > compareNumber) {
            guessResultField.setText("too high");
        } else {
            guessResultField.setText("correct");
        }

        if (inputNumber < newNumber) {
            guessResultField.setText("too low");
        } else if (inputNumber > newNumber) {
            guessResultField.setText("too high");
        } else {
            guessResultField.setText("correct");
        }


    }//GEN-LAST:event_guessSubmitButtonActionPerformed
    //new number button//
    private void newSecretNumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newSecretNumButtonActionPerformed
        newNumber = rand.nextInt(100) + 1;
    }//GEN-LAST:event_newSecretNumButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NumberGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NumberGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NumberGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NumberGuess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberGuess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel guessResultField;
    private javax.swing.JButton guessSubmitButton;
    private javax.swing.JTextField guessTextField;
    private javax.swing.JLabel instructionsLabel;
    private javax.swing.JButton newSecretNumButton;
    private javax.swing.JLabel numberRangeLabel;
    private javax.swing.JLabel yourGuessLabel;
    // End of variables declaration//GEN-END:variables
}
