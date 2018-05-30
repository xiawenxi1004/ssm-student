package com.xi.services;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xi.bean.Student;
import com.xi.dao.IStudentDao;
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Resource(name="IStudentDao")
	private IStudentDao dao;
	public void setDao(IStudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public void addStudent(Student student) {
		dao.insertStudent(student);
	}

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		List<Student> stus = dao.selectAllStudents();
		//System.out.println(stus);
		return stus;
	}

	
	@Transactional
	public void  removeStuById(int id) {
		
		dao.deleteStuById(id);
	}

	@Override
	@Transactional
	public Student getStuById(int id) {
		Student student = dao.selectStuById(id);
		return student;
	}

	@Override
	@Transactional
	public void changeStudent(Student student) {
		dao.updateStudent(student);
		System.out.println("Service的输出情况");
		System.out.println(student);
	}

	@Override
	@Transactional
	public List<Student> list(int start, int count) {
		return dao.list(start, count);
		
	}

	@Override
	@Transactional
	public int getTotal() {
		return dao.getTotal();
	}




}
