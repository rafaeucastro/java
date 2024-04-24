package n2;

/**
 *
 * @author Lirio
 */
public class Subject {
    
    private String name;
    private String code;
    private String course;
    private int weeklyWorkload;
    private String professor;
    private char shift;
    private String weekday;
    private String schedule;
    private String classroomId;

    /**
     * Cria uma nova disciplinia
     *
     * @param name
     * @param code
     * @param course
     * @param weeklyWorkload deve ser 2 ou 4
     * @param professor
     * @param shift valores aceitáveis: "AB", "CD" ou "ABCD"
     * @param weekday
     * @param classroomId
     * @param schedule
     */
    public Subject(String name, String code, String course, int weeklyWorkload, String professor, char shift,
            String weekday, String classroomId, String schedule) {
        this.name = name;
        this.code = code;
        this.course = course;
        this.weeklyWorkload = weeklyWorkload;
        this.professor = professor;
        this.shift = shift;
        this.weekday = weekday;
        this.schedule = schedule;
        this.classroomId = classroomId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * O código referente a essa disciplina
     *
     * @return
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * O curso a qual essa disciplina pertence
     *
     * @return
     */
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    /**
     * A carga horária dessa disciplina
     *
     * @return 2 ou 4
     */
    public int getWeeklyWorkload() {
        return weeklyWorkload;
    }

    public void setWeeklyWorkload(int weeklyWorkload) {
        if (weeklyWorkload == 2 || weeklyWorkload == 4) {
            this.weeklyWorkload = weeklyWorkload;
        }
        assert (weeklyWorkload == 2 || weeklyWorkload == 4) : "A carg horária deve ser 2h ou 4h";
    }

    /**
     * O Professo que ensina a disciplina
     *
     * @return o nome do professor
     */
    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    /**
     * O turno da disciplina
     *
     * @return M para manhã, T para Tarde, N para noite
     */
    public char getShift() {
        return shift;
    }

    public void setShift(char shift) {
        if (shift == 'M' || shift == 'T' || shift == 'N') {
            this.shift = shift;
        }
        assert (shift == 'M' || shift == 'T' || shift == 'N') : "O turno deve ser M, T ou N";
    }

    /**
     * O dia da semana
     *
     * @return
     */
    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    /**
     * O horário da disciplina
     *
     * @return "AB", "CD" ou "ABCD"
     */
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        if (schedule.equals("AB") || schedule.equals("CD")
                || schedule.equals("ABCD")) {
            this.schedule = schedule;
        }
    }

    public String getClassroomId() {
        return classroomId;
    }

    /**
     * O Identificador da sala
     *
     * @param classroomId
     */
    public void setClassroomId(String classroomId) {
        this.classroomId = classroomId;
    }

    @Override
    public String toString() {
        return "Nome: " + name + "\nCódigo: " + code + "\nCurso: " + course
                + "\nCarga Horária Semanal: " + weeklyWorkload + "h"
                + "\nProfessor(a): " + professor + "\nTurno: " + Shift.getShiftAsString(shift)
                + "\nDia da  Semana: " + weekday + "\nHorário: " + schedule
                + "\nIdentificador da sala: " + classroomId;
    }
}
