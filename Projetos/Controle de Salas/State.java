package n2;

import java.util.HashMap;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Lirio
 */
public class State {

    private final Map<String, Classroom> rooms;
    private final Map<String, Subject> subjects;

    public State() {
        this.rooms = new HashMap<>();
        this.subjects = new HashMap<>();
    }

    public Map<String, Classroom> getRooms() {
        return rooms;
    }

    public Map<String, Subject> getSubjects() {
        return subjects;
    }

    void addNewRoom(Classroom classroom) {
        rooms.put(classroom.getId(), classroom);
    }

    void addNewSubject(Subject subject) {
        subjects.put(subject.getCode(), subject);
    }

    Classroom getClassroom(String id) {
        return rooms.get(id);
    }

    Subject getSubject(String code) {
        return subjects.get(code);
    }

    void deleteClassroom(String id) {
        rooms.remove(id);
    }

    void deleteSubject(String code) {
        subjects.remove(code);
    }

}
