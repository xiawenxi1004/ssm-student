package com.xi.dao;

import java.util.List;

import com.xi.bean.Student;

public interface IStudentDao {

	void insertStudent(Student student);
	List<Student> selectAllStudents();
	void deleteStuById(int id);
	Student selectStuById(int id);
	void updateStudent(Student student);
	List<Student> list(int start, int count);
	int getTotal();
}
