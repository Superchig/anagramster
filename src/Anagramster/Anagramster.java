/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagramster;

/**
 *
 * @author chiggie
 */
public class Anagramster extends javax.swing.JFrame
{

  /**
   * Creates new form Anagramster
   */
  public Anagramster()
  {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents()
  {

    jPanel1 = new javax.swing.JPanel();
    separator = new javax.swing.JSeparator();
    inputTextField = new javax.swing.JTextField();
    origTextField = new javax.swing.JTextField();
    origTextLabel = new javax.swing.JLabel();
    inputTextLabel = new javax.swing.JLabel();
    chosenLettersLabel = new javax.swing.JLabel();
    outputLabel = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Anagramster");
    setBackground(new java.awt.Color(0, 124, 163));

    jPanel1.setBackground(new java.awt.Color(135, 42, 44));

    separator.setBackground(new java.awt.Color(192, 70, 73));
    separator.setForeground(new java.awt.Color(192, 70, 73));

    inputTextField.setBackground(new java.awt.Color(168, 56, 59));
    inputTextField.addCaretListener(new javax.swing.event.CaretListener()
    {
      public void caretUpdate(javax.swing.event.CaretEvent evt)
      {
        inputTextFieldCaretUpdate(evt);
      }
    });

    origTextField.setBackground(new java.awt.Color(168, 56, 59));
    origTextField.addCaretListener(new javax.swing.event.CaretListener()
    {
      public void caretUpdate(javax.swing.event.CaretEvent evt)
      {
        origTextFieldCaretUpdate(evt);
      }
    });

    origTextLabel.setBackground(new java.awt.Color(168, 56, 59));
    origTextLabel.setForeground(new java.awt.Color(202, 73, 76));
    origTextLabel.setText("Original Text:");

    inputTextLabel.setBackground(new java.awt.Color(168, 56, 59));
    inputTextLabel.setForeground(new java.awt.Color(202, 73, 76));
    inputTextLabel.setText("Input Text:");

    chosenLettersLabel.setBackground(new java.awt.Color(168, 56, 59));
    chosenLettersLabel.setForeground(new java.awt.Color(202, 73, 76));
    chosenLettersLabel.setText("Chosen Letters:");

    outputLabel.setBackground(new java.awt.Color(168, 56, 59));
    outputLabel.setForeground(new java.awt.Color(202, 73, 76));
    outputLabel.setText("NO WORD");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(origTextLabel)
          .addComponent(inputTextLabel)
          .addComponent(chosenLettersLabel))
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(8, 8, 8)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(separator)
              .addComponent(inputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
              .addComponent(origTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
          .addGroup(jPanel1Layout.createSequentialGroup()
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(outputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(64, Short.MAX_VALUE))
    );

    jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputTextField, origTextField, outputLabel, separator});

    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel1Layout.createSequentialGroup()
        .addGap(28, 28, 28)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(origTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(origTextLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(inputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(inputTextLabel))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(chosenLettersLabel)
          .addComponent(outputLabel))
        .addContainerGap(127, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void inputTextFieldCaretUpdate(javax.swing.event.CaretEvent evt)//GEN-FIRST:event_inputTextFieldCaretUpdate
  {//GEN-HEADEREND:event_inputTextFieldCaretUpdate
    if (displayWord == null)
    {
      return;
    }
    
    displayWord.updateColors(inputTextField.getText());
    outputLabel.setText(displayWord.getHTML());
  }//GEN-LAST:event_inputTextFieldCaretUpdate

  private void origTextFieldCaretUpdate(javax.swing.event.CaretEvent evt)//GEN-FIRST:event_origTextFieldCaretUpdate
  {//GEN-HEADEREND:event_origTextFieldCaretUpdate
    displayWord = new DisplayWord(origTextField.getText());
    outputLabel.setText(displayWord.getHTML());
  }//GEN-LAST:event_origTextFieldCaretUpdate

  /**
   * @param args the command line arguments
   */
  public static void main(String args[])
  {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try
    {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
      {
        if ("Nimbus".equals(info.getName()))
        {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex)
    {
      java.util.logging.Logger.getLogger(Anagramster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex)
    {
      java.util.logging.Logger.getLogger(Anagramster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex)
    {
      java.util.logging.Logger.getLogger(Anagramster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex)
    {
      java.util.logging.Logger.getLogger(Anagramster.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        new Anagramster().setVisible(true);
      }
    });
  }
  
  // Custom variable declarations
  private DisplayWord displayWord;

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel chosenLettersLabel;
  private javax.swing.JTextField inputTextField;
  private javax.swing.JLabel inputTextLabel;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JTextField origTextField;
  private javax.swing.JLabel origTextLabel;
  private javax.swing.JLabel outputLabel;
  private javax.swing.JSeparator separator;
  // End of variables declaration//GEN-END:variables
}
