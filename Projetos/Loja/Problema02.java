/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

import java.util.ArrayList;

/**
 *
 * @author Alunos
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Produto> carrinho = new ArrayList();
        carrinho.add(new Mouse("Mouse ótico", "Saída USB. 1.600 dpi "));
        carrinho.add(new Livro("Drummond de Andrade", "O menino catador "));
        carrinho.add(new Livro("Fabiano Gino", "Hoje e sempre "));
        
        carrinho.forEach((produto) -> {
            System.out.println(produto.getDescrição());
        });
    }
    
}
