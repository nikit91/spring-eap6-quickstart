package com.nikana.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nikana.bean.ResponseBean;
import com.nikana.constant.EMConstants;
import com.nikana.controller.StudentController;
@CrossOrigin(origins = EMConstants.X_ORIGIN_URL)
@RestController
@RequestMapping("/student")
public class StudentRestCtrl {
	@Autowired
	private StudentController studCtrl;
	@RequestMapping("/getStudents")
	public ResponseBean getStudents(){
		return studCtrl.getStudents();
	}
}
