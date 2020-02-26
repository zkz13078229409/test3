package zkz.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import zkz.example.entity.Student;

import java.util.Collection;

@RestController
@RequestMapping("/rest")
public class restController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return restTemplate.getForEntity("http://localhost:8010/stu/findAll",Collection.class).getBody();

    }
    @GetMapping("/findAll2")
    public Collection<Student> findAll2(){
        return restTemplate.getForObject("http://localhost:8010/stu/findAll",Collection.class);
    }
    @GetMapping("/getById/{id}")
    public Student getById(@PathVariable("id") long id){
        return restTemplate.getForEntity("http://localhost:8010/stu/getById/{id}",Student.class,id).getBody();
    }

    @GetMapping("/getById2/{id}")
    public Student getById2(@PathVariable("id") long id){
        return restTemplate.getForObject("http://localhost:8010/stu/getById/{id}",Student.class,id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student ){
            restTemplate.postForEntity("http://localhost:8010/stu/save",student,null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student){
        restTemplate.postForObject("http://localhost:8010/stu/save",student,null);
    }
    @PutMapping("/update")
    public void update(@RequestBody Student student){
        restTemplate.put("http://localhost:8010/stu/update",student);
    }
    @DeleteMapping("/del/{id}")
    public void delById(@PathVariable("id") long id){
        restTemplate.delete("http://localhost:8010/stu/del/{id}",id);
    }


}
