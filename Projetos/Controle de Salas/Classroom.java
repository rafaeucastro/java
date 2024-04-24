package n2;

public class Classroom {

    private int number;
    private String type;
    private int block;
    private String id;
    private String status;
    private String responsible;

    /**
     * Create a new classroom
     *
     * @param block
     * @param type
     * @param number
     */
    public Classroom(int block, String type, int number) {
        this.block = block;
        this.type = type;
        this.number = number;
        this.id = "B" + block + "S" + number;
        this.status = "Disponível";
    }

    public String getId() {
        return id;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
        this.id = "B" + block + "S" + number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

//    public void setStatus(String status) {
//        if (Status.isValid(status)) {
//            this.status = status;
//        }
//        assert (Status.isValid(status)) : "Status inválido!";
//    }
    
    /**
     * Define a sala como ocupada
     */
    public void setAsBusy() {
        this.status = "Ocupado";
    }
    
    /**
     * Define sala como disponível
     */
    public void setAsFree() {
        this.status = "Disponível";
    }
    
    /**
     * Define sala como reservada
     */
    public void setAsReserved() {
        this.status = "Reservada";
    }

    public String getResponsible() {
        return responsible;
    }

    public void setResponsible(String responsible) {
        this.responsible = responsible;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        this.id = "B" + block + "S" + number;
    }

    @Override
    public String toString() {
        return "\nTipo: " + type + "\nBloco: " + block + "\nNúmero: " + number
            + "\nResponsável: " + responsible + "\nStatus: " + status + "\nID: " + id;
    }

}
