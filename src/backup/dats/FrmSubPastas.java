/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup.dats;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fernando
 */
public class FrmSubPastas extends javax.swing.JFrame {

    /**
     * Creates new form FrmExtensoes
     */
    public FrmSubPastas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPastas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtNovaPasta = new javax.swing.JTextField();
        btAddPasta = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ignorar Subpastas");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabelaPastas.setAutoCreateRowSorter(true);
        tabelaPastas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ignorar", "Pasta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPastas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tabelaPastas.setMaximumSize(new java.awt.Dimension(80, 0));
        tabelaPastas.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaPastas);
        if (tabelaPastas.getColumnModel().getColumnCount() > 0) {
            tabelaPastas.getColumnModel().getColumn(0).setResizable(false);
            tabelaPastas.getColumnModel().getColumn(0).setPreferredWidth(15);
        }

        jLabel1.setText("Adicionar Pasta");

        btAddPasta.setText("Adicionar");
        btAddPasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPastaActionPerformed(evt);
            }
        });

        btSalvar.setBackground(new java.awt.Color(1, 109, 187));
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setText("Salvar pastas");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNovaPasta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAddPasta))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNovaPasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddPasta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvar)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            Configuracoes cfg = new Configuracoes();
            List<String> pastas = Arrays.asList(cfg.getPropriedade("pastas_ignoradas").split(","));
            DefaultTableModel model = (DefaultTableModel) tabelaPastas.getModel();
            for (String cada : pastas) {
                model.addRow(new Object[]{true, cada});
            }
            tabelaPastas.getRowSorter().toggleSortOrder(1);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FrmSubPastas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmSubPastas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btAddPastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPastaActionPerformed
        // TODO add your handling code here:
        if (!txtNovaPasta.getText().equals("")) {
            DefaultTableModel model = (DefaultTableModel) tabelaPastas.getModel();
            model.addRow(new Object[]{true, txtNovaPasta.getText().replace("/", "").replace("\\","")});
            txtNovaPasta.setText("");
        }
    }//GEN-LAST:event_btAddPastaActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        try {
            // TODO add your handling code here:
            DefaultTableModel model = (DefaultTableModel) tabelaPastas.getModel();
            int qtdFiles = model.getRowCount();
            Configuracoes cfg = new Configuracoes();
            String pastaSelec = "";
            for (int i = 0; i < qtdFiles; i++) {
                boolean selec = (boolean) model.getValueAt(i, 0);
                if (selec) {
                    pastaSelec =  (String) model.getValueAt(i, 1)+ "," + pastaSelec;
                }
            }
            cfg.setPropriedade("pastas_ignoradas", pastaSelec);
            setVisible(false);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(FrmSubPastas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmSubPastas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSubPastas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSubPastas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPasta;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPastas;
    private javax.swing.JTextField txtNovaPasta;
    // End of variables declaration//GEN-END:variables
}
