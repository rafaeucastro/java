/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package correio;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author Alunos
 */
public class CaixaPostal {
    private List mensagens;
    private int indiceMensagemCorrente;
    private String titular;

    public CaixaPostal() {
        this.titular = "";
    }

    public CaixaPostal(String titular) {
        this.titular = titular;
        
        ObjectInputStream in = null;
        
        try{
            try{
                // Opção 1 - abreindo arquivo com as mensagens
                // salvas na caixa postal do titular
                in = new ObjectInputStream(new FileInputStream(getNomeArquivo()));
                mensagens = (List) in.readObject();
                in.close();
                
            }catch(FileNotFoundException e){
                // Opção 2 - criando uma nova lista de mensagens
             mensagens = new ArrayList();
            }
        }catch(IOException | ClassNotFoundException e){
            System.err.print(e);
            System.exit(1);
        }
    }
    
    protected String getNomeArquivo() {
        return this.titular + ".correio";
    }
    
    public int númeroDeMensagens(){
        return mensagens.size();
    }
    
    public void inserir(Mensagem m) {
        mensagens.add(m);
        this.indiceMensagemCorrente = Math.max(indiceMensagemCorrente, 0);
    }
    
    public Mensagem lerMensagemCorrente() {
        if(mensagens.isEmpty()){
            return new Mensagem("", "", "");
        }
        if(this.indiceMensagemCorrente >= 0){
            return (Mensagem) mensagens.get(this.indiceMensagemCorrente);
        } else {
            return null;
        }
    }
    
    public void avancar() {
        this.indiceMensagemCorrente++;
        this.indiceMensagemCorrente = Math.min(indiceMensagemCorrente, mensagens.size()-1);
    }
    
    public void recuar() {
        this.indiceMensagemCorrente--;
        this.indiceMensagemCorrente = Math.max(indiceMensagemCorrente, 0);
    }
    
    public boolean excluirMensagem() {
        if(this.indiceMensagemCorrente >0 && this.indiceMensagemCorrente < mensagens.size()){
            lerMensagemCorrente().excluir();
            this.indiceMensagemCorrente = Math.min(indiceMensagemCorrente, mensagens.size()-1);
            return true;
        } else{
            return false;
        }
    }

    public void salvar() {
        Iterator it = mensagens.iterator();
        
        // Atualizei a lista de mensagem removendo as
        // mensagens marcadas como EXCLUÍDA
        while(it.hasNext()){
            Mensagem m = (Mensagem) it.next();
            if(m.foiExcluida()){
                it.remove();
            }
        }        
         
        ObjectOutputStream out = null;
        
        try{
            try{
                out = new ObjectOutputStream(new FileOutputStream(getNomeArquivo()));
            }catch(FileNotFoundException e){
                System.err.println("Não foi possível criar " + getNomeArquivo());
                System.exit(1);
            }
            out.writeObject(mensagens);
            out.close();
        }catch(IOException e){
            System.err.print(e);
            System.exit(1);
        }
        this.indiceMensagemCorrente = Math.min(indiceMensagemCorrente, mensagens.size()-1);
    }
}
