/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.database_funcoes_DAO;

/**
 *
 * @author yasmi
 */
public class item_DGV_GUI extends javax.swing.JFrame {

    /**
     * Creates new form chave_DGV_GUI
     */
    public item_DGV_GUI() {
        initComponents();
        
        try {
            database_funcoes_DAO.updateRegistroItens();
            database_funcoes_DAO.carregaProfessoresItem();
            database_funcoes_DAO.carregaItem();
        } catch (SQLException ex) {
            Logger.getLogger(item_DGV_GUI.class.getName()).log(Level.SEVERE, null, ex);
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

        FundoPrincipal = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        PainelPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        profCBX = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        itemCBX = new javax.swing.JComboBox();
        voltar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        remover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        registros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciamento de Chaves");
        setUndecorated(true);

        FundoPrincipal.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpg"))); // NOI18N

        PainelPrincipal.setLayout(null);

        jLabel1.setText("Professores");
        PainelPrincipal.add(jLabel1);
        jLabel1.setBounds(10, 10, 190, 20);

        PainelPrincipal.add(profCBX);
        profCBX.setBounds(10, 30, 190, 30);

        jLabel3.setText("Item");
        PainelPrincipal.add(jLabel3);
        jLabel3.setBounds(210, 10, 180, 20);

        itemCBX.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        PainelPrincipal.add(itemCBX);
        itemCBX.setBounds(210, 30, 180, 30);

        voltar.setText("Voltar");
        voltar.setToolTipText("Registra novas chaves para a tabela.");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        PainelPrincipal.add(voltar);
        voltar.setBounds(620, 20, 80, 50);

        registrar.setText("Registrar");
        registrar.setToolTipText("Remova do registro as chaves que já foram entregues.");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        PainelPrincipal.add(registrar);
        registrar.setBounds(530, 20, 90, 50);

        remover.setText("Remover");
        remover.setToolTipText("Remova do registro as chaves que já foram entregues.");
        remover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerActionPerformed(evt);
            }
        });
        PainelPrincipal.add(remover);
        remover.setBounds(440, 20, 90, 50);

        registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Professor", "Item", "Horário"
            }
        ));
        jScrollPane1.setViewportView(registros);

        PainelPrincipal.add(jScrollPane1);
        jScrollPane1.setBounds(10, 80, 690, 370);

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        FundoPrincipal.add(panelImage1);
        panelImage1.setBounds(0, 0, 730, 490);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FundoPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(730, 489));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void removerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerActionPerformed
        
        database_funcoes_DAO.desregistraItem();
        
    }//GEN-LAST:event_removerActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        
        database_funcoes_DAO.registraItem();
        
    }//GEN-LAST:event_registrarActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        
        new home_DGV_GUI().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(item_DGV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(item_DGV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(item_DGV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(item_DGV_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new item_DGV_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FundoPrincipal;
    private javax.swing.JPanel PainelPrincipal;
    public static javax.swing.JComboBox itemCBX;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    public static javax.swing.JComboBox profCBX;
    private javax.swing.JButton registrar;
    public static javax.swing.JTable registros;
    private javax.swing.JButton remover;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
