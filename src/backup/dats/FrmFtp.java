/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup.dats;

import it.sauronsoftware.ftp4j.FTPAbortedException;
import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPDataTransferException;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPIllegalReplyException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class FrmFtp extends javax.swing.JFrame {

    /**
     * Creates new form FrmPost
     */
    Log logger;

    public FrmFtp() {
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

        jPanel2 = new javax.swing.JPanel();
        txtServidor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPorta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        btTestarConexao = new javax.swing.JButton();
        btSalvaConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Servidor FTP"));

        jLabel1.setText("Servidor");

        jLabel2.setText("Usuário");

        jLabel4.setText("Pasta de Destino");

        jLabel5.setText("Porta");

        jLabel3.setText("Senha");

        btTestarConexao.setText("Testar Conexão");
        btTestarConexao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTestarConexaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addComponent(txtDestino))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btTestarConexao))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(txtServidor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPorta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26)))
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btTestarConexao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSalvaConfig.setBackground(new java.awt.Color(1, 109, 187));
        btSalvaConfig.setForeground(new java.awt.Color(255, 255, 255));
        btSalvaConfig.setText("Salvar configurações");
        btSalvaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvaConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btSalvaConfig)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalvaConfig)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btTestarConexaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTestarConexaoActionPerformed
        verificarFtp();
    }//GEN-LAST:event_btTestarConexaoActionPerformed

    private void verificarFtp() {
        try {
            testarFTP();
            JOptionPane.showMessageDialog(null, "Tudo certo com a conexão FTP!");
            logger.info("Sucesso no teste de FTP");
        } catch (IllegalStateException | FTPIllegalReplyException | FTPException | FileNotFoundException | FTPDataTransferException | FTPAbortedException ex) {
            if (ex.getMessage().contains("Arquivo ou diretório não encontrado")) {
                try {
                    criarPastaFTP();
                } catch (IOException | IllegalStateException | FTPIllegalReplyException | FTPException | FTPDataTransferException | FTPAbortedException ex1) {
                    logger.erro(ex1.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Houve um prolema com a conexão:\n\n" + ex.getMessage());
                logger.erro("Erro ao testar FTP: " + ex.getMessage());
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Houve um prolema com a conexão:\n\n" + ex.getMessage());
            logger.erro("Erro ao testar FTP: " + ex.getMessage());
        }
    }

    private void testarFTP() throws IOException, IllegalStateException, FTPIllegalReplyException, FTPException, FileNotFoundException, FTPDataTransferException, FTPAbortedException {
        final FTPClient client = new FTPClient();
        Configuracoes cfg = new Configuracoes();

        String host = txtServidor.getText();
        String porta = txtPorta.getText();
        String user = txtUsuario.getText();
        String pass = String.valueOf(txtSenha.getPassword());
        
        File arquivo = new File("C:/ftpTest.txt");
        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        String uploadPath = txtDestino.getText();
        logger.info("Testando servidor FTP, host: "+host+":"+porta+" usuário: "+ user+" pasta: "+uploadPath);
        if (porta.equals("")) {
            client.connect(host);
        } else {
            client.connect(host, Integer.valueOf(porta));
        }
        client.login(user, pass);
        client.changeDirectory(uploadPath);
        client.upload(arquivo);
        client.disconnect(true);
        arquivo.delete();

    }

    private void criarPastaFTP() throws IOException, IllegalStateException, FTPIllegalReplyException, FTPException, FileNotFoundException, FTPDataTransferException, FTPAbortedException {
        if (JOptionPane.showConfirmDialog(null, "Essa pasta não existe no servidor.\nDeseja criar agora?", "Criar Pasta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            final FTPClient client = new FTPClient();
            Configuracoes cfg = new Configuracoes();
            String host = txtServidor.getText();
            String porta = txtPorta.getText();
            String user = txtUsuario.getText();
            String pass = String.valueOf(txtSenha.getPassword());
            String uploadPath = txtDestino.getText();
            if (porta.equals("")) {
                client.connect(host);
            } else {
                client.connect(host, Integer.valueOf(porta));
            }
            client.login(user, pass);
            logger.info("Tentando criar pasta no FTP: " + uploadPath);
            client.createDirectory(uploadPath);
            logger.info("Pasta criada");
            client.disconnect(false);
            verificarFtp();
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        try {
            logger = new Log();
            Configuracoes cfg = new Configuracoes();
            txtServidor.setText(cfg.getPropriedade("ftp_servidor"));
            txtPorta.setText(cfg.getPropriedade("ftp_porta"));
            txtUsuario.setText(cfg.getPropriedade("ftp_usuario"));
            txtSenha.setText(cfg.getPropriedade("ftp_senha"));
            txtDestino.setText(cfg.getPropriedade("ftp_caminho"));
        } catch (UnsupportedEncodingException ex) {
            logger.erro(ex.getMessage());
        } catch (IOException ex) {
            logger.erro(ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btSalvaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvaConfigActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            Configuracoes cfg = new Configuracoes();
            cfg.setPropriedade("ftp_servidor", txtServidor.getText());
            cfg.setPropriedade("ftp_porta", txtPorta.getText());
            cfg.setPropriedade("ftp_usuario", txtUsuario.getText());
            cfg.setPropriedade("ftp_senha", String.valueOf(txtSenha.getPassword()));
            cfg.setPropriedade("ftp_caminho", txtDestino.getText());
            setVisible(false);
        } catch (UnsupportedEncodingException ex) {
            logger.erro(ex.getMessage());
        } catch (IOException ex) {
            logger.erro(ex.getMessage());
        }
    }//GEN-LAST:event_btSalvaConfigActionPerformed

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
            java.util.logging.Logger.getLogger(FrmFtp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmFtp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvaConfig;
    private javax.swing.JButton btTestarConexao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtPorta;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtServidor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
