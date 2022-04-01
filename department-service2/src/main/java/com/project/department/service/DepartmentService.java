package com.project.department.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.department.entity.Department;
import com.project.department.repository.DepartmentRepository;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepositoryImp;

    public Department saveDepartment(Department department) {
        return departmentRepositoryImp.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepositoryImp.findByDepartmentId(departmentId);
    }
}
