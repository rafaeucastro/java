package n2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lirio
 */
public class Shift {
    public static final char MORNING = 'M';
    public static final char AFTERNOON = 'T';
    public static final char EVENING = 'N';
    
    public static String getShiftAsString(char shift){
        switch (shift) {
            case 'M' -> {
                return "Manhã";
            }
            case 'T' -> {
                return "Tarde";
            }
            case 'N' -> {
                return "Noite";
            }
            default -> throw new AssertionError();
        }
    }
}
