package com.reactFirstDemo.reactFirstDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reactFirstDemo.reactFirstDemo.ProjectTask;
import com.reactFirstDemo.reactFirstDemo.repository.ProjectTaskRepository;

@Service
public class ProjectTaskService {

	@Autowired
	ProjectTaskRepository projectTaskRepository;
	
	public ProjectTask saveOrUpdateProjectTask(ProjectTask projectTask) {
		if(projectTask.getStatus()==null || projectTask.getStatus()=="") {
			projectTask.setStatus("To_Do");
	}
		return projectTaskRepository.save(projectTask);
}
	public List<ProjectTask> getAllData() {
		List<ProjectTask> list = projectTaskRepository.findAll();
		return list;
		
	}
	
}
