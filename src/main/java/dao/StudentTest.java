package dao;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class StudentTest {

    public static void main(String[] args) {

        Dao<Student> studentDao = new StudentDaoImpl();

        log.info("=============== get all ================");
        printAllStudents(studentDao.getAll());
        log.info("================ save ===============");
        studentDao.save(new Student("Ross", 126));
        printAllStudents(studentDao.getAll());
        log.info("================ get by id ===============");
        Student student = studentDao.get(124);
        log.info(student.toString());
        log.info("=============== update ================");
        student.setName("Michael");
        studentDao.update(student);
        printAllStudents(studentDao.getAll());
        log.info("=============== delete ================");
        studentDao.delete(student);
        printAllStudents(studentDao.getAll());

    }

    public static void printAllStudents(List<Student> students) {
        students.forEach(student -> log.info(student.toString()));
    }

}