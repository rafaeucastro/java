/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema02;

/**
 *
 * @author Alunos
 */
public class Livro extends Produto {
    String autor;

    public Livro(String autor, String descrição) {
        this.autor = autor;
        setDescrição(descrição);
    }

    @Override
    public String getDescrição() {
        return super.getDescrição() + " - " + autor;
    }
}
