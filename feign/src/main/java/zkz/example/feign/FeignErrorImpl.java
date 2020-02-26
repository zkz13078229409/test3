package zkz.example.feign;

import org.springframework.stereotype.Component;
import zkz.example.entity.Student;

import java.util.Collection;
@Component
public class FeignErrorImpl implements FeignProdiverClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中....";
    }
}
