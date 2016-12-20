package com.nikana.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nikana.bean.ResponseBean;
@Controller
public class StudentController {
	private final String STUDENT = "Student#";
	private final String CITY = "City#";
	@Autowired(required=true)
	private ResponseBean responseBean;
	public ResponseBean getStudents(){
		List<Student> studentList = new ArrayList<Student>();
		Student student;
		int a;
		for(int i=0;i<=10;i++){
			a=i+1;
			student = new Student(a, STUDENT+a, CITY+a);
			studentList.add(student);
		}
		responseBean.setPayload(studentList);
		return responseBean;
	}
}
