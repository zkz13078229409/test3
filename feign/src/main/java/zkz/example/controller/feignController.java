package zkz.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zkz.example.entity.Student;
import zkz.example.feign.FeignProdiverClient;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class feignController {
        @Autowired
    private FeignProdiverClient feignProdiverClient;
        @GetMapping("/findAll")
        public Collection<Student> findAll(){
            return feignProdiverClient.findAll();
        }
        @GetMapping("/index")
        public  String index(){
            return feignProdiverClient.index();
    }

}
