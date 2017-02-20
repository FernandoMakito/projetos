/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backup.dats;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author fernando
 */
public class Configuracoes {

    String nomeArquivo = "MakitoBackup.properties";
    File arquivoConfig = new File(nomeArquivo);
    Log logger;
    Map<String, String> propriedades = new HashMap<>();

    public Configuracoes() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        logger = new Log();
        setPadrao();
        if (!arquivoConfig.exists()) {
            criaArquivo();
        } else {
            confereCampos();
        }
    }

    private void criaArquivo() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        logger.info("Criando arquivo de configurações");
        boolean a = arquivoConfig.createNewFile();
        Properties novoArquivo = abreArquivo();
        for (String key : propriedades.keySet()) {
            String value = propriedades.get(key);
            novoArquivo.setProperty(key, value);
        }
        salvaArquivo(novoArquivo);
        logger.info("Arquivo de configurações criado");
    }

    private void confereCampos() throws IOException {
            for (String key : propriedades.keySet()) {
                if (getPropriedade(key) == null) {
                    logger.info("Propriedade não encontrada nas configurações -> " + key);
                    String valorPadrao =  propriedades.get(key);
                    setPropriedade(key, valorPadrao);
                }
            }
    }

    private void setPadrao() {
        propriedades.put("nome_arquivo", "BackupMakito");
        propriedades.put("extensoes", "dat/fr3/hdr/k1/k2/k3/k4/k5/k6/k7/k8/tag/flx/rpt/exe/cfg/dll/txt/con/int");
        propriedades.put("extensoes_ativas", "dat/fr3/con");
        propriedades.put("pasta_origem", "");
        propriedades.put("pasta_destino", "");
        propriedades.put("compactacao", "7");
        propriedades.put("executa_antes", "");
        propriedades.put("executa_depois", "");
        propriedades.put("caminho_post", "C:\\Program Files (x86)\\PostgreSQL\\9.3\\bin");
        propriedades.put("banco_post", "");
        propriedades.put("porta_post", "5432");
        propriedades.put("servidor_post", "localhost");
        propriedades.put("usuario_post", "postgres");
        propriedades.put("senha_post", "postgres");
        propriedades.put("backup_facil", "false");
        propriedades.put("desliga_pc", "false");
        propriedades.put("pastas_ignoradas", "tempor,FastEstrutura,FirefoxPortable,GoogleChromePortable,Log,LogEcf,LogTerminais,MkoLog,MONITOR,NFELOG,recebido,relcry,DownloadTmp,MakitoBackupLogs");
        propriedades.put("ftp_backup", "false");
        propriedades.put("makitoPost_backup", "false");
        propriedades.put("edoc_backup", "false");
        propriedades.put("banco_edoc", "ManagerEDoc");
        propriedades.put("ftp_servidor", "177.92.10.162");
        propriedades.put("ftp_porta", "21");
        propriedades.put("ftp_usuario", "salva");
        propriedades.put("ftp_senha", "");
        propriedades.put("ftp_caminho", "SALVA/");
        propriedades.put("agendamento_dias", "MON,TUE,WED,THU,FRI,SAT");
        propriedades.put("agendamento_hora", "00:00");
        propriedades.put("agendamento_ativo", "false");
        propriedades.put("pasta_temp", "propria");

    }

    private String getPadrao(String propriedade) {
        for (String key : propriedades.keySet()) {
            if (key.equals(propriedade)) {
                String value = propriedades.get(key);
                return value;
            }
        }
        return "";
    }

    private Properties abreArquivo() throws FileNotFoundException, IOException {
        Properties props = new Properties();
        FileInputStream file = new FileInputStream(arquivoConfig);
        props.load(file);
        return props;
    }

    private void salvaArquivo(Properties arquivo) throws IOException {
        arquivo.store(new FileOutputStream(arquivoConfig), null);
    }

    public void setPropriedade(String campo, String valor) throws IOException {
        Properties config = abreArquivo();
        String configAtual = config.getProperty(campo);
        if (configAtual != null) {
            if (!configAtual.equals(valor)) {
                logger.info("Alterando " + campo + " de '" + configAtual + "' para '" + valor + "'");
            }
        } else {
            logger.info("Criando " + campo + " valor padrao '" + valor + "'");
        }
        config.setProperty(campo, valor);
        salvaArquivo(config);
    }

    public String getPropriedade(String propriedade) throws IOException {
        Properties prop = abreArquivo();
        String resultado = prop.getProperty(propriedade);
        if(resultado == null){
            setPropriedade(propriedade, getPadrao(propriedade));
            resultado = prop.getProperty(propriedade);
        }
        return resultado;
    }

}
