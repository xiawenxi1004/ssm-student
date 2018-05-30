package com.xi.handles;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xi.bean.Student;
import com.xi.services.IStudentService;
import com.xi.util.Page;
@Controller

public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private IStudentService service;
	
	public void setService(IStudentService service) {
		this.service = service;
	}
	@RequestMapping("/register.do")
	public String doRegister(int age,String name )  {
		Student student=new Student(name,age);
		service.addStudent(student);
		System.out.println("������studentController");
		return ("/welcome.jsp");
		
	}

	@RequestMapping("/selectAll.do")
	public ModelAndView selectAll( )  {
		ModelAndView mv=new ModelAndView();
		List<Student> allStudents = service.getAllStudents();
		//System.out.println("controller��"+allStudents);
		mv.addObject("stus",allStudents);
		mv.setViewName("/stuManage.jsp");
		return mv;
		
	}
	
	@RequestMapping("/listStudent.do")
	public String listStudent(HttpServletRequest request,HttpServletResponse response )  {
		  // ��ȡ��ҳ����
        int start = 0;
        int count = 10;

        try {
            start = Integer.parseInt(request.getParameter("page.start"));
            count = Integer.parseInt(request.getParameter("page.count"));
        } catch (Exception e) {
        }
        Page page = new Page(start, count);
        
       List<Student> students = service.list(page.getStart(), page.getCount());
       int total = service.getTotal();
       page.setTotal(total);

       request.setAttribute("students", students);
       request.setAttribute("page", page);
       System.out.println("service��"+page);
		return 	("/stuManage2.jsp");
		
	}
	
	
	
	
	@RequestMapping("/deleteStu.do")
	public String removeStu(int id )  {
		ModelAndView mv=new ModelAndView();
		service.removeStuById(id);
		System.out.println("����ִ��ҳ����ת");
		//�ɹ�
		  return ("redirect:/selectAll.do");
		//�ɹ�
		//return("/selectAll.do");
	}
	/*��ת���༭ҳ��*/
	@RequestMapping("/editStu.do")
	public ModelAndView gotoUpdate(int id )  {
		ModelAndView mv=new ModelAndView();
		Student student = service.getStuById(id);
		mv.addObject("stu", student);
		System.out.println(student);
		//�ɹ�
		mv.setViewName("/edit.jsp");
		return mv;
	}
	
	/*�����޸�ѧ����Ϣ*/
	@RequestMapping("/updateStu.do")
	public String changeStu(HttpServletRequest request )  {
		Student student=new Student();
		int id = Integer.parseInt(request.getParameter("id"));
		 int age = Integer.parseInt(request.getParameter("age"));
		 String name = request.getParameter("name");
		 student.setId(id);
		 student.setAge(age);
		 student.setName(name);
		 System.out.println("id  :"+student.getId());
		 System.out.println("���ĺ��age  :"+student.getAge());
		 System.out.println("���ĺ��name  :"+student.getName());
		service.changeStudent(student);	 
		//�ɹ�
		return("/selectAll.do");
	}
}
