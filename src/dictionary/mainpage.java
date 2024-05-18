/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dictionary;

/**
 *
 * @author dv
 */
public class mainpage extends javax.swing.JFrame {

    /**
     * Creates new form mainpage
     */
    public mainpage() {
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
        exit_btn = new javax.swing.JButton();
        addword_btn = new javax.swing.JButton();
        deleteword_btn = new javax.swing.JButton();
        searchword_btn = new javax.swing.JButton();
        suggestword_btn = new javax.swing.JButton();
        updateword_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dictionary");
        setMaximumSize(new java.awt.Dimension(800, 515));
        setMinimumSize(new java.awt.Dimension(800, 515));

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204,150));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setText("Dictionary");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(220, 40, 250, 70);

        exit_btn.setBackground(new java.awt.Color(0, 0, 0));
        exit_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        exit_btn.setForeground(new java.awt.Color(255, 255, 255));
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });
        jPanel2.add(exit_btn);
        exit_btn.setBounds(380, 250, 160, 40);

        addword_btn.setBackground(new java.awt.Color(0, 0, 0));
        addword_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        addword_btn.setForeground(new java.awt.Color(255, 255, 255));
        addword_btn.setText("Add Word");
        addword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addword_btnActionPerformed(evt);
            }
        });
        jPanel2.add(addword_btn);
        addword_btn.setBounds(150, 150, 160, 40);

        deleteword_btn.setBackground(new java.awt.Color(0, 0, 0));
        deleteword_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        deleteword_btn.setForeground(new java.awt.Color(255, 255, 255));
        deleteword_btn.setText("Delete Word");
        deleteword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteword_btnActionPerformed(evt);
            }
        });
        jPanel2.add(deleteword_btn);
        deleteword_btn.setBounds(380, 150, 160, 40);

        searchword_btn.setBackground(new java.awt.Color(0, 0, 0));
        searchword_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        searchword_btn.setForeground(new java.awt.Color(255, 255, 255));
        searchword_btn.setText("Search Word");
        searchword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchword_btnActionPerformed(evt);
            }
        });
        jPanel2.add(searchword_btn);
        searchword_btn.setBounds(150, 200, 160, 40);

        suggestword_btn.setBackground(new java.awt.Color(0, 0, 0));
        suggestword_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        suggestword_btn.setForeground(new java.awt.Color(255, 255, 255));
        suggestword_btn.setText("Suggest Word");
        suggestword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suggestword_btnActionPerformed(evt);
            }
        });
        jPanel2.add(suggestword_btn);
        suggestword_btn.setBounds(150, 250, 160, 40);

        updateword_btn.setBackground(new java.awt.Color(0, 0, 0));
        updateword_btn.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        updateword_btn.setForeground(new java.awt.Color(255, 255, 255));
        updateword_btn.setText("Update Word");
        updateword_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateword_btnActionPerformed(evt);
            }
        });
        jPanel2.add(updateword_btn);
        updateword_btn.setBounds(380, 200, 160, 40);

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

    private void addword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addword_btnActionPerformed
        AddWord aw = new AddWord();
        aw.show();
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_addword_btnActionPerformed

    private void searchword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchword_btnActionPerformed
        SearchWord sw = new SearchWord();
        sw.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_searchword_btnActionPerformed

    private void deleteword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteword_btnActionPerformed
        DeleteWord dw = new DeleteWord();
        dw.show();
        dispose();        
// TODO add your handling code here:
    }//GEN-LAST:event_deleteword_btnActionPerformed

    private void updateword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateword_btnActionPerformed
        UpdateWord uw = new UpdateWord();
        uw.show();
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_updateword_btnActionPerformed

    private void suggestword_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suggestword_btnActionPerformed
        SuggestWord sgw = new SuggestWord();
        sgw.show();
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_suggestword_btnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        this.dispose();        
// TODO add your handling code here:
    }//GEN-LAST:event_exit_btnActionPerformed

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
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addword_btn;
    private javax.swing.JButton deleteword_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton searchword_btn;
    private javax.swing.JButton suggestword_btn;
    private javax.swing.JButton updateword_btn;
    // End of variables declaration//GEN-END:variables
}