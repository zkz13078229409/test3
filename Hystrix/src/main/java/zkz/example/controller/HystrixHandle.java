package zkz.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zkz.example.entiry.Student;
import zkz.example.feign.FeignProdiverClient;

import java.util.Collection;

@RestController
@RequestMapping("/hystrix")
public class HystrixHandle {
    @Autowired
    private FeignProdiverClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
