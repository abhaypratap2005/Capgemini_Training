package com.cms.departmentproject.service;



import com.cms.departmentproject.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepartments();

    List<Department> getByDepartmentName(String name);

    List<Department> getByManagerId(Long managerId);

    Department saveDepartment(Department department);
}