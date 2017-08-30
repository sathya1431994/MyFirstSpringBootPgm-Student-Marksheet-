package com.example.basic;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
class StudentController {

    @Autowired
    private StudentRepository studentrepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Student> getallmarks() {
        return studentrepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Student save(@RequestBody Student student) {
        return studentrepository.save(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student find(@PathVariable Long id) {
        return studentrepository.findOne(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
       studentrepository.delete(id);
    }
}