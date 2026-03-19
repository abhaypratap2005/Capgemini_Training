package com.cms.departmentproject.repository;



import com.cms.departmentproject.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

    List<Department> findByDepartmentName(String departmentName);

    List<Department> findByManagerId(Long managerId);

    @Query("SELECT d FROM Department d WHERE LOWER(d.departmentName) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Department> searchByName(@Param("name") String name);
}
