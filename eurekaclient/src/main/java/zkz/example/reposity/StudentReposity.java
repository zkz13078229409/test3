package zkz.example.reposity;

import zkz.example.entity.Student;

import java.util.Collection;

public interface StudentReposity {

    public Collection<Student> findAll();
    public Student getById(long id);
    public void saveOrUpdate(Student student);
    public void delById(long id);


}
