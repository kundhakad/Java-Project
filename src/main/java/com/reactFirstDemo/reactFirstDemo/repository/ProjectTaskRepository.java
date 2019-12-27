package com.reactFirstDemo.reactFirstDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reactFirstDemo.reactFirstDemo.ProjectTask;
@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {

}
