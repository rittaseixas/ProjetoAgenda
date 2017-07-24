/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.MateriaController;
import javax.swing.JOptionPane;
import model.Compromisso;
import model.Materia;

/**
 *
 * @author lucas
 */
public class MenuMaterias extends javax.swing.JDialog {

    MateriaController materiaController;

    public MenuMaterias(java.awt.Frame parent, boolean modal, Materia materia) {
        super(parent, modal);

        initComponents();
        txtCodMateria.setText(String.valueOf(materia.getCodMateria()));
        txtCodMateria.setVisible(false);
        txtNomeMateria.setText(materia.getNomeMateria());
        materiaController = new MateriaController();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNomeMateria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnEditarMateria = new javax.swing.JButton();
        btnExcluirMateria = new javax.swing.JButton();
        txtCodMateria = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.white);

        txtNomeMateria.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtNomeMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, null));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        jLabel5.setText("Matéria");

        btnEditarMateria.setBackground(new java.awt.Color(255, 255, 255));
        btnEditarMateria.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnEditarMateria.setText("Editar");
        btnEditarMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarMateria.setPreferredSize(new java.awt.Dimension(76, 25));
        btnEditarMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarMateriaActionPerformed(evt);
            }
        });

        btnExcluirMateria.setBackground(new java.awt.Color(255, 255, 255));
        btnExcluirMateria.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnExcluirMateria.setText("Excluir");
        btnExcluirMateria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirMateria.setPreferredSize(new java.awt.Dimension(76, 25));
        btnExcluirMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirMateriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCodMateria)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEditarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(btnExcluirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(txtCodMateria))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtNomeMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarMateriaActionPerformed
        Materia materia = new Materia();
        materia.setNomeMateria(txtNomeMateria.getText());
        materia.setCodMateria(Integer.parseInt(txtCodMateria.getText()));
        String status = materiaController.editarMateria(materia);
        if (status.equals("sucesso")) {
            this.dispose();
        }
    }//GEN-LAST:event_btnEditarMateriaActionPerformed

    private void btnExcluirMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirMateriaActionPerformed
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir a matéria?", "Atenção", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (op == JOptionPane.YES_OPTION) {
            Materia materia = new Materia();
            materia.setCodMateria(Integer.parseInt(txtCodMateria.getText()));
            String status = materiaController.excluirMateria(materia);
            if (status.equals("sucesso")) {
                this.dispose();
            }
        }
    }//GEN-LAST:event_btnExcluirMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMaterias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuMaterias dialog = new MenuMaterias(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditarMateria;
    private javax.swing.JButton btnExcluirMateria;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel txtCodMateria;
    private javax.swing.JTextField txtNomeMateria;
    // End of variables declaration//GEN-END:variables
}
