package com.reactFirstDemo.reactFirstDemo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.reactFirstDemo.reactFirstDemo.ProjectTask;
import com.reactFirstDemo.reactFirstDemo.service.ProjectTaskService;

@RestController
//@RequestMapping("/api/projTask")
@CrossOrigin(origins = "*")
public class ProjectTaskController {

	@Autowired
	private ProjectTaskService projectTaskService;
	
	@PostMapping("/api/projTask/save")
	public ResponseEntity<?>saveOrUpdateProjectTask(@Valid @RequestBody ProjectTask projectTask,BindingResult result) {
		if(result.hasErrors()) {
			Map<String,String> errormap = new HashMap<String, String>();
			for(FieldError error:result.getFieldErrors()) {
				errormap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map>(errormap,HttpStatus.BAD_REQUEST);
		}
		System.out.println("coming to Controller");
		ProjectTask newPT = projectTaskService.saveOrUpdateProjectTask(projectTask);
		return new ResponseEntity<ProjectTask>(newPT,HttpStatus.CREATED);
	}
	@GetMapping("/api/projTask/getalldata")
	public ResponseEntity<?> getAllData() {
		List<ProjectTask> list = projectTaskService.getAllData();
		System.out.println("List is "+list);
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
