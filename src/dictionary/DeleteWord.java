/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dictionary;

import javax.swing.JOptionPane;

/**
 *
 * @author dv
 */
public class DeleteWord extends javax.swing.JFrame {

    /**
     * Creates new form DeleteWord
     */
    public DeleteWord() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        delete_btn = new javax.swing.JButton();
        Enterword_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        back_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 515));
        setMinimumSize(new java.awt.Dimension(800, 515));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204,150));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setText("Dictionary");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 50, 250, 70);

        delete_btn.setBackground(new java.awt.Color(0, 0, 0));
        delete_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        delete_btn.setForeground(new java.awt.Color(255, 255, 255));
        delete_btn.setText("Delete");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });
        jPanel2.add(delete_btn);
        delete_btn.setBounds(280, 250, 110, 40);

        Enterword_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Enterword_txtActionPerformed(evt);
            }
        });
        jPanel2.add(Enterword_txt);
        Enterword_txt.setBounds(250, 170, 290, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Enter Word:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(130, 180, 130, 26);

        back_btn.setBackground(new java.awt.Color(0, 0, 0));
        back_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel2.add(back_btn);
        back_btn.setBounds(400, 250, 110, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(50, 40, 690, 400);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mainpage.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 480);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        Subclass sb = new Subclass();
       String word = Enterword_txt.getText();
       sb.LoadDictionary();
 DictionaryNode result = sb.Search(sb.root, word);

    if (result != null) {
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete the word?", "Delete Word", JOptionPane.YES_NO_OPTION);

        if (dialogResult == JOptionPane.YES_OPTION) {
            sb.root = sb.Delete(sb.root, word);
            sb.UpdateFile();
            JOptionPane.showMessageDialog(null, "Word deleted successfully.", "Deletion Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(null, "Word not found in the dictionary.", "Word Not Found", JOptionPane.WARNING_MESSAGE);
    }
// TODO add your handling code here:
    }//GEN-LAST:event_delete_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        mainpage mp = new mainpage();
        mp.show();
        dispose();   
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btnActionPerformed

    private void Enterword_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Enterword_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Enterword_txtActionPerformed

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
            java.util.logging.Logger.getLogger(DeleteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeleteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeleteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeleteWord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeleteWord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Enterword_txt;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton delete_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
