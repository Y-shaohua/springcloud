package com.yan.repository;

import com.yan.entity.Student;

import java.util.Collection;

public interface StudentRepository {

    public Collection<Student> findall();
    public Student findById(long id);
    public void SaveOrUpdate(Student student);
    public void deleteById(long id);

}
