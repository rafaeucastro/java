/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package correio;
import java.io.Console;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Classe que implementa uma interface simples (a caractere)
 * de manipulação de mensagens de correio eletrônico.
 * <p>
 * O programa manipula uma caixa postal de mensagens de correio eletrônico.
 * O funcionamento da interface é como segue. Um objeto dessa
 * classe deve ser criado com um argumento especificando o titular da caixa postal
 * a ser manipulada. Ao chamar o método principal (interfaceComUsuário()),
 * o conteúdo da caixa postal pode ser manipulado e novas mensagens podem ser enviadas.
 * Pode-se enviar correio textual ou de áudio.
 *
 * @author   Jacques Philippe Sauvé, jacques@dsc.ufpb.br
 * @version 1.1
 * <br>
 * Copyright (C) 1999 Universidade Federal da Paraíba.
 */

public class CorreioIUTemp1 {
    private CaixaPostal caixa;

    public CorreioIUTemp1(String titular) {
        caixa = new CaixaPostal(titular);
    }
    
    public void interfaceComUsuário() {
        Scanner entrada = new Scanner(System.in);
        Mensagem mensagem_corrente = caixa.lerMensagemCorrente(); 
        String remetente = mensagem_corrente.getRemetente();
        String assunto = mensagem_corrente.getAssunto();
        String conteúdo = "";
        Date data = mensagem_corrente.getDataEnvio();
        
        while(true) {
            mostraResumoDaCaixaPostal(caixa);
            System.out.println("O que você deseja fazer?");
            System.out.println("exibir, enviar, excluir, +, -, quit?");
            String cmd = entrada.next();
            
            if(cmd.startsWith("exi")){
                System.out.println("EXIBIÇÃO DE MENSAGEM");
                caixa.lerMensagemCorrente().exibir();
                
            } else if(cmd.startsWith("en")){
                
                // obtem uma nova mensagem com esses dados
                System.out.println("Digite o remetente: ");
                remetente = entrada.next();
                System.out.println("Assunto: ");
                assunto = entrada.next();
                System.out.println("Sua mensagem: ");
                conteúdo = entrada.next();
                
                // criar uma nova mensagem com esses dados
                Mensagem message = new Mensagem(remetente, assunto, conteúdo);
                // armazenar a mensagem na caixa postal do destinatário
                caixa.inserir(message);
                
            } else if(cmd.startsWith("exc")){
                System.out.println("Exclusao da mensagem");
                caixa.excluirMensagem();
                
            } else if(cmd.startsWith("+")) {
                System.out.println("Avanca para a proxima mensagem");
                caixa.avancar();
                
            } else if(cmd.startsWith("-")) {
                System.out.println("Recua para a mensagem anterior");
                caixa.recuar();
                
            } else if(cmd.startsWith("q")){
                System.out.println("Salvar CaixaPostal? ");
                cmd = entrada.next();
                
                if(cmd.startsWith("s")) {
                    System.out.println("Salvamento de caixa postal");
                    caixa.salvar();
                }
                break;
                
            } else {
                System.out.println("Comando <" + cmd + "> desconhecido");
            }
        }
    }
    
    void mostraResumoDaCaixaPostal(CaixaPostal caixa) {
        Mensagem mensagem_corrente = caixa.lerMensagemCorrente();
            
            if(caixa.númeroDeMensagens() > 0){
                System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
                System.out.println("Resumo da caixa postal para o usuário");
                System.out.printf("Destinatário: %s | Data: %s | Assunto: %s\n", mensagem_corrente.getRemetente(), mensagem_corrente.getDataEnvio().toString(), mensagem_corrente.getAssunto());
            }
    }
}