public class problema3 {
    public static void main(String args[]) {
        int chico = 150;
        int ze = 110;
        int years = 0;

        while(ze <= chico) {
            chico += 2;
            ze += 3;
            years++;
        }

        System.out.println("Foi/Foram necessário(s) "+ years +" anos para zé ultrapassar chico em altura!");
    }
}