package com.cms.departmentproject.controller;

import com.cms.departmentproject.entity.Department;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tools.jackson.databind.ObjectMapper;


@RestController
@RequestMapping("/json")

public class JsonDemoController {

    @GetMapping("/department")

    public ResponseEntity<String> getDepartmentjson(){
        Department obj = new Department();

        obj.setDepartmentName("Test Department");
        obj.setDepartmentId(345L);
        obj.setManagerId(23L);

        ObjectMapper mapper = new ObjectMapper();
        String str = mapper.writeValueAsString(obj);

        //reflection Api :

        ResponseEntity.ok().body(str);
        ResponseEntity.status(HttpStatus.CREATED).body(str);
        ResponseEntity.status(HttpStatus.NO_CONTENT);
        ResponseEntity.ok().header("content-type", "application/json").body(str);

        return ResponseEntity
                .ok()
                .header("Content-Type", "application/json")
                .body(str);
    }

}
