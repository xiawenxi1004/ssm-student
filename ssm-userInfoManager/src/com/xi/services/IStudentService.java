package com.xi.services;

import java.util.List;

import com.xi.bean.Student;

public interface IStudentService {

	void addStudent(Student student);
	List<Student> getAllStudents();
	void removeStuById(int id);
	Student getStuById(int id);
	void changeStudent(Student student);
	List<Student> list(int start, int count);
	int getTotal();
}
