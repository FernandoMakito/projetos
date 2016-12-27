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
import java.util.Properties;

/**
 *
 * @author fernando
 */
public class Configuracoes {

    String nomeArquivo = "MakitoBackup.properties";
    File arquivoConfig = new File(nomeArquivo);

    public Configuracoes() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        if (!arquivoConfig.exists()) {
            criaArquivo();
        }
    }

    private void criaArquivo() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        boolean a = arquivoConfig.createNewFile();
        Properties novoArquivo = abreArquivo();
        novoArquivo.setProperty("modo", "dat");
        novoArquivo.setProperty("extensoes", "dat/fr3/hdr/k1/k2/k3/k4/k5/k6/k7/k8/tag/flx/exe/cfg/dll/txt/con/int");
        novoArquivo.setProperty("extensoes_ativas", "dat/fr3/con");
        novoArquivo.setProperty("pasta_origem", "");
        novoArquivo.setProperty("pasta_destino", "");
        novoArquivo.setProperty("compactacao", "7");
        novoArquivo.setProperty("executa_antes", "");
        novoArquivo.setProperty("executa_depois", "");
        novoArquivo.setProperty("caminho_post", "C:\\Program Files (x86)\\PostgreSQL\\9.3\\bin");
        novoArquivo.setProperty("banco_post", "");
        novoArquivo.setProperty("porta_post", "5432");
        novoArquivo.setProperty("servidor_post", "localhost");
        novoArquivo.setProperty("usuario_post", "postgres");
        novoArquivo.setProperty("senha_post", "postgres");
        novoArquivo.setProperty("backup_facil", "false");
        novoArquivo.setProperty("desliga_pc", "false");
        novoArquivo.setProperty("pastas_ignoradas", "tempor,FastEstrutura,FirefoxPortable,GoogleChromePortable,Log,LogEcf,LogTerminais,MkoLog,MONITOR,NFELOG,recebido,relcry,DownloadTmp");
        novoArquivo.setProperty("ftp_backup", "false");
        novoArquivo.setProperty("ftp_servidor", "177.92.10.162");
        novoArquivo.setProperty("ftp_porta", "21");
        novoArquivo.setProperty("ftp_usuario", "salva");
        novoArquivo.setProperty("ftp_senha", "");
        novoArquivo.setProperty("ftp_caminho", "SALVA/");
        novoArquivo.setProperty("agendamento_dias", "MON,TUE,WED,THU,FRI,SAT");
        novoArquivo.setProperty("agendamento_hora", "00:00");
        novoArquivo.setProperty("agendamento_ativo", "false");
        salvaArquivo(novoArquivo);

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
        config.setProperty(campo, valor);
        salvaArquivo(config);
    }

    public String getPropriedade(String propriedade) throws IOException {
        Properties prop = abreArquivo();
        String resultado = prop.getProperty(propriedade);
        return resultado;
    }

}
