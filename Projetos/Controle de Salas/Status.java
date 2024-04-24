package n2;

public class Status {

    public static final String AVAILABLE = "Disponível";
    public static final String BUSY = "Ocupado";
    public static final String RESERVED = "Reservada";

    public static boolean isValid(String status) {
        return status.equals(Status.AVAILABLE)
                || status.equals(Status.BUSY)
                || status.equals(Status.RESERVED);
    }
}
