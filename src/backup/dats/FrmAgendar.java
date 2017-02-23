/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup.dats;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author fernando
 */
public class FrmAgendar extends javax.swing.JFrame {

    /**
     * Creates new form FrmPost
     */
    public FrmAgendar() {
        initComponents();
    }
    String user, senha;
    Log logger;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        ckSegunda = new javax.swing.JCheckBox();
        ckTerca = new javax.swing.JCheckBox();
        ckQuarta = new javax.swing.JCheckBox();
        ckQuinta = new javax.swing.JCheckBox();
        cmbHorario = new javax.swing.JComboBox<>();
        ckSexta = new javax.swing.JCheckBox();
        ckSabado = new javax.swing.JCheckBox();
        ckDomingo = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btSalvaConfig = new javax.swing.JButton();
        btApagarTask = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Agendamento de backup"));

        ckSegunda.setSelected(true);
        ckSegunda.setText("Segunda");

        ckTerca.setSelected(true);
        ckTerca.setText("Terça");

        ckQuarta.setSelected(true);
        ckQuarta.setText("Quarta");

        ckQuinta.setSelected(true);
        ckQuinta.setText("Quinta");

        cmbHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00:00", "00:30", "01:00", "01:30", "02:00", "02:30", "03:00", "03:30", "04:00", "04:30", "05:00", "05:30", "06:00", "06:30", "07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00", "20:30", "21:00", "21:30", "22:00", "22:30", "23:00", "23:30" }));

        ckSexta.setSelected(true);
        ckSexta.setText("Sexta");

        ckSabado.setSelected(true);
        ckSabado.setText("Sabado");

        ckDomingo.setText("Domingo");

        jLabel1.setText("Dias da semana");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Horário");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ckSegunda)
                            .addComponent(ckTerca)
                            .addComponent(ckQuinta)
                            .addComponent(ckSabado)
                            .addComponent(ckDomingo)
                            .addComponent(ckQuarta)
                            .addComponent(ckSexta))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ckSegunda)
                    .addComponent(cmbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckTerca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckQuarta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckQuinta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckSexta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckSabado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckDomingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btSalvaConfig.setBackground(new java.awt.Color(1, 109, 187));
        btSalvaConfig.setForeground(new java.awt.Color(255, 255, 255));
        btSalvaConfig.setText("Agendar");
        btSalvaConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvaConfigActionPerformed(evt);
            }
        });

        btApagarTask.setText("Excluir Tarefa");
        btApagarTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarTaskActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btApagarTask)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvaConfig)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvaConfig)
                    .addComponent(btApagarTask))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            logger = new Log();
            btApagarTask.setVisible(false);
            Configuracoes cfg = new Configuracoes();
            List<String> dias = Arrays.asList(cfg.getPropriedade("agendamento_dias").split(","));
            cmbHorario.setSelectedItem(cfg.getPropriedade("agendamento_hora"));
            if (cfg.getPropriedade("agendamento_ativo").equals("true")) {
                btApagarTask.setVisible(true);
            }
            selecionaDias(dias);
        } catch (UnsupportedEncodingException ex) {
           logger.erro(ex.getMessage());
        } catch (IOException ex) {
           logger.erro(ex.getMessage());
        }
    }//GEN-LAST:event_formWindowOpened

    private void btSalvaConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvaConfigActionPerformed
        try {
            confereUser();
            Configuracoes cfg = new Configuracoes();
            if (criarTask()) {
                cfg.setPropriedade("agendamento_ativo", "true");
                cfg.setPropriedade("agendamento_dias", diasSelecionados());
                cfg.setPropriedade("agendamento_hora", cmbHorario.getSelectedItem().toString());
                fecharForm();
            }
        } catch (FileNotFoundException | UnsupportedEncodingException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n" + ex.getMessage(), "Erro ao agendar backup", JOptionPane.ERROR_MESSAGE);
        } catch (IOException | InterruptedException ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n" + ex.getMessage(), "Erro ao agendar backup", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvaConfigActionPerformed

    private void btApagarTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarTaskActionPerformed
        apagaTask();
        logger.info("Agendamento apagado");
    }//GEN-LAST:event_btApagarTaskActionPerformed

    private void apagaTask() {
        try {
            executaComandos("SchTasks /Delete /TN BackupMakito -f");
            Configuracoes cfg = new Configuracoes();
            cfg.setPropriedade("agendamento_ativo", "false");
            fecharForm();
        } catch (IOException | InterruptedException ex) {
           logger.erro(ex.getMessage());
        }
    }

    private void confereUser() {
        user = String.valueOf(JOptionPane.showInputDialog(this, "Qual o usuário do Windows?", System.getProperty("user.name")));
        if (user.equals("") || user.equals("null")) {
            confereUser();
            return;
        }
        if (!user.equals("system")) {
            senha = JOptionPane.showInputDialog(this, "Qual a senha para o usuário " + user + "?");
        } else {
            senha = "";
        }
    }

    private void selecionaDias(List<String> dias) {
        ckSegunda.setSelected(dias.contains("MON"));
        ckTerca.setSelected(dias.contains("TUE"));
        ckQuarta.setSelected(dias.contains("WED"));
        ckQuinta.setSelected(dias.contains("THU"));
        ckSexta.setSelected(dias.contains("FRI"));
        ckSabado.setSelected(dias.contains("SAT"));
        ckDomingo.setSelected(dias.contains("SUN"));
    }

    private String diasSelecionados() {
        List<String> dias = new ArrayList<>();
        if (ckSegunda.isSelected()) {
            dias.add("MON");
        }
        if (ckTerca.isSelected()) {
            dias.add("TUE");
        }
        if (ckQuarta.isSelected()) {
            dias.add("WED");
        }
        if (ckQuinta.isSelected()) {
            dias.add("THU");
        }
        if (ckSexta.isSelected()) {
            dias.add("FRI");
        }
        if (ckSabado.isSelected()) {
            dias.add("SAT");
        }
        if (ckDomingo.isSelected()) {
            dias.add("SUN");
        }
        return join(dias, ",");
    }

    private boolean criarTask() throws IOException, InterruptedException {
        apagaTask();
        String nomeArquivo = new File("").getAbsolutePath() + "\\MakitoBackup.exe";
        String dias = diasSelecionados();
        String cmdSenha = "";
        String cmdUsuario = "";
        if (!user.equals("")) {
            cmdUsuario = "/RU " + user;
            if (!senha.equals("")) {
                cmdSenha = "/RP " + senha;
            }
        }

        if (!dias.equals("")) {
            String comando = "SchTasks /Create /SC WEEKLY /D " + dias + " /TN BackupMakito /TR \"\\\"" + nomeArquivo + "\"\\\" /ST " + cmbHorario.getSelectedItem().toString() + " " + cmdUsuario + " " + cmdSenha + " -f";
            System.out.println(comando);
            executaComandos(comando);
            String log = "Tarefa agendada, dias:"+ dias + " horário: "+cmbHorario.getSelectedItem().toString() + " usuário: "+ cmdUsuario;
            queryTask(log);
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecione pelo menos um dia!");
            return false;
        }
    }

    private void executaComandos(final String comando) throws IOException, InterruptedException {
        try {
            Process p = Runtime.getRuntime().exec(comando);
            int count = 0;
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
//                JOptionPane.showMessageDialog(null, line.replace("�XITO: a", "A").replace("ÒXITO: a", "A").replace("ÓXITO: a", "A"));
//                count++;
//                if(count > 1 && !line.contains("corretamente")){
//                    JOptionPane.showMessageDialog(null, "Houve um problema na criação/exclusão da tarefa\n"+line+"\nTente agendar/excluir manualmente pelo agendador de tarefas do Windows");
//                    p.destroy();
//                    fecharForm();
//                }
            }
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro \n" + e.getMessage(), "Erro ao executar comando", JOptionPane.ERROR_MESSAGE);
            logger.erro("Ocorreu um erro ao agendar/excluir tarefa" + e.getMessage());
        }
    }

    private void queryTask(String log) throws IOException, InterruptedException {
        String resultado = "";
        try {
            Process p = Runtime.getRuntime().exec("SchTasks /query /Tn BackupMakito");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
                resultado = resultado + line + "\n";
            }
        } catch (IOException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao consultar a tarefa\n" + e.getMessage());
        }
        if (resultado.equals("")) {
            resultado = "Não foi possivel criar o agendamento, verifique por favor.";
        }
        logger.info(log);
        JOptionPane.showMessageDialog(null, resultado.replace("Pasta: \\", "A tarefa foi agendada"));

    }

    private void fecharForm() {
        setVisible(false);
    }

    public static String join(List<String> list, String delim) {
        StringBuilder sb = new StringBuilder();
        String loopDelim = "";
        for (String s : list) {
            sb.append(loopDelim);
            sb.append(s);
            loopDelim = delim;
        }
        return sb.toString();
    }

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
            java.util.logging.Logger.getLogger(FrmAgendar.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgendar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagarTask;
    private javax.swing.JButton btSalvaConfig;
    private javax.swing.JCheckBox ckDomingo;
    private javax.swing.JCheckBox ckQuarta;
    private javax.swing.JCheckBox ckQuinta;
    private javax.swing.JCheckBox ckSabado;
    private javax.swing.JCheckBox ckSegunda;
    private javax.swing.JCheckBox ckSexta;
    private javax.swing.JCheckBox ckTerca;
    private javax.swing.JComboBox<String> cmbHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
