package com.association.controller;

import com.association.model.Project;
import com.association.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    //projectId is or to getProjects
    @GetMapping(value = {"/getProjects", "/{projectId}"})
    public List<Project> getProjects(@PathVariable(required = false) Long projectId) {
        return projectService.getProjectDetails(projectId);
    }
}
