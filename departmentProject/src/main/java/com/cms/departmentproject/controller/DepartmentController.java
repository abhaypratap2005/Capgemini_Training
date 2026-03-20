package com.cms.departmentproject.controller;

import com.cms.departmentproject.entity.Department;
import com.cms.departmentproject.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping
    public List<Department> getAll() {
        return service.getAllDepartments();
    }
  //remember to check the call
    @GetMapping("/name/{name}")
    public List<Department> getByName(@PathVariable String name) {
        return service.getByDepartmentName(name);
    }

    @GetMapping("/manager/{id}")
    public List<Department> getByManager(@PathVariable Long id) {
        return service.getByManagerId(id);
    }

    @PostMapping
    public Department addDepartment(@RequestBody Department dept) {
        return service.saveDepartment(dept);
    }
}
