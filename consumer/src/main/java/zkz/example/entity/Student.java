package zkz.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*加了这个省略getSet方法*/
@Data
/*加了这个注解省略构造函数*/
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    private long id;
    private String name;
    private int age;


}
