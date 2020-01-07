package dao;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements Dao<Student> {

    private List<Student> students;

    StudentDaoImpl() {
        students = new ArrayList<>();
        students.add(new Student("Joe", 123));
        students.add(new Student("Mike", 124));
        students.add(new Student("Helen", 125));
    }

    @Override
    public void save(Student student) {
        students.add(student);
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student get(long id) {
        return students
                .stream()
                .filter(student -> student.getRollNo() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void delete(Student student) {
        students.remove(student);
    }

    @Override
    public void update(Student student) {
        get(student.getRollNo()).setName(student.getName());
    }

}