package com.cms.departmentproject.controller;

import com.cms.departmentproject.entity.Department;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tools.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/json")
public class JsonDemoController {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> getExceptionDetails(Exception e) {
        Map<String, String> map = new HashMap<>();
        map.put("message", e.getMessage());
        map.put("code", HttpStatus.BAD_REQUEST.toString());
        return map;
    }

    @GetMapping("/department")
    public String getDepartmentjson() throws Exception {

        Department obj = null;

        // FORCE exception
        obj.getDepartmentName();  // NullPointerException

        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(obj);
    }
}