package zkz.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import zkz.example.entiry.Student;

import java.util.Collection;
@FeignClient(value = "provider")
public interface FeignProdiverClient {

    @GetMapping("/stu/findAll")
    public Collection<Student> findAll();
        @GetMapping("/stu/index")
    public String index();


}
