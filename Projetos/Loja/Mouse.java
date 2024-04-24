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
public class Mouse extends Produto{
    String tipo;

    public Mouse(String tipo, String descrição) {
        this.tipo = tipo;
        setDescrição(descrição);
    }
    
    @Override
    public String getDescrição() {
        return super.getDescrição() + " - " + tipo;
    }
}
