package person.otj.friday_practice;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import person.otj.friday_practice.model.SysUser;
import person.otj.friday_practice.repository.SysUserRepository;
@SpringBootTest
class FridayPracticeApplicationTests {

    @Autowired
    private SysUserRepository sysUserRepository;


    @Test
    void contextLoads() {
    }

    @Test
    void testFindUser(){
        for (SysUser s:sysUserRepository.findAll()){
            System.out.println(s.toString());
        }
    }

}
