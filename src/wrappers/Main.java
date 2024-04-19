package wrappers;

public class Main {
    public static void main(String[] args) {
        Short num7 = new Short((short)7);
        Long num9 = new Long(90000l);
        Integer num100 = new Integer(100);
        Float num3 = new Float(3.5f);
        //outra forma de criar um wrapper para um double
        Double num5 = Double.valueOf(80); 
        Character b = new Character('b');

        //retorna o número de tipo primitivo
        int primitive = num7.shortValue();
        System.out.println(primitive); 

        //Autoboxing
        Byte meyByte = 8;
        
        //auto un-boxing
        int num13 = num100;
    }
}
