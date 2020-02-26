package zkz.example.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import zkz.example.entity.Student;
import zkz.example.reposity.StudentReposity;

import java.util.Collection;

@RestController
@RequestMapping("/stu")
public class studentController {
        @Autowired
    private StudentReposity studentReposity;
        @Value("${server.port}")
        private String port;
@GetMapping("/findAll")
        public Collection<Student> findAll(){
            return studentReposity.findAll();
        }
        @GetMapping("/getById/{id}")
    public  Student getById(@PathVariable("id") long id){
    return studentReposity.getById(id);
        }

        @PostMapping("/save")
        public void save(@RequestBody Student student){
                studentReposity.saveOrUpdate(student);
        }

        @PutMapping("/update")
    public void updateStu(@RequestBody Student student){
                studentReposity.saveOrUpdate(student);
        }
        @DeleteMapping("/del/{id}")
    public void delStu(@PathVariable("id") long id){
                studentReposity.delById(id);
        }
    @GetMapping("/index")
        public String index(){
        return "当前端口"+this.port;
        }

}
