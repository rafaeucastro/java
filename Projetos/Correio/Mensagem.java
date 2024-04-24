package correio;
import java.time.Instant;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alunos
 */
public class Mensagem {
    private static final int LIDA = 0x1;
    private static final int EXCLUÍDA = 0x2;
    private static final int NOVO = ~(LIDA | EXCLUÍDA);
    
    private String remetente;
    private String assunto;
    private String conteúdo;
    private Date dataEnvio;
    private int estado;
    /**
     * Contrutor para minha mensagem
     * @param remetente
     * @param assunto
     * @param conteúdo 
     */
    public Mensagem(String remetente, String assunto, String conteúdo) {
        this.remetente = remetente;
        this.assunto = assunto;
        this.conteúdo = conteúdo;
        this.dataEnvio = Date.from(Instant.now());
    }

    public static int getLIDA() {
        return LIDA;
    }

    public static int getEXCLUÍDA() {
        return EXCLUÍDA;
    }

    public static int getNOVO() {
        return NOVO;
    }

    public String getRemetente() {
        return remetente;
    }

    public String getAssunto() {
        return assunto;
    }

    public String getConteúdo() {
        return conteúdo;
    }

    public Date getDataEnvio() {
        return dataEnvio;
    }

    public int getEstado() {
        return estado;
    }
    
    public boolean foiLida() {
        return (this.estado  == LIDA);
    }
    
    public boolean foiExcluida() {
        return (this.estado == EXCLUÍDA);
    }
    
    public void excluir() {
        this.estado = EXCLUÍDA;
    }
    
    /**
     * Exibir a mensagem
     */
    public void exibir() {
        this.estado = LIDA;
        System.out.println("De: " + this.remetente);
        System.out.println("Data: " + this.dataEnvio);
        System.out.println("Assunto: " + this.assunto);
    }
    
    public void print(String value){
        System.out.println(value);
    }
}
