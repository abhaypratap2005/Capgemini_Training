package com.cms.departmentproject.service;

import com.cms.departmentproject.entity.Department;
import com.cms.departmentproject.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository repository;

    @Override
    public List<Department> getAllDepartments() {
        return repository.findAll();
    }

    @Override
    public List<Department> getByDepartmentName(String name) {
        return repository.findByDepartmentName(name);
    }

    @Override
    public List<Department> getByManagerId(Long managerId) {
        return repository.findByManagerId(managerId);
    }

    @Override
    public Department saveDepartment(Department department) {
        return repository.save(department);
    }
}
