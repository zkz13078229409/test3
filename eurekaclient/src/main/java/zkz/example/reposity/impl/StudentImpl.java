package zkz.example.reposity.impl;

import org.springframework.stereotype.Repository;
import zkz.example.entity.Student;
import zkz.example.reposity.StudentReposity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentImpl implements StudentReposity {
    private static Map<Long,Student> studentMap;

    static {
        studentMap=new HashMap<>();
        studentMap.put(1L,new Student(1L,"康泽",33));
        studentMap.put(2L,new Student(2L,"hanzhe",33));
        studentMap.put(3L,new Student(3L,"kka",33));

    }
    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student getById(long id) {

        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
            studentMap.put(student.getId(),student);
    }

    @Override
    public void delById(long id) {
        studentMap.remove(id);
    }
}
