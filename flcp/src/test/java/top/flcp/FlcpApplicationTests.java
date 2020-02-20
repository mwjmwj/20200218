package top.flcp;


import com.cp.dao.NumColorMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FlcpApplicationTests {


    @Autowired
    private NumColorMapper mapper;

    @Test
    public void contextLoads() {
        mapper.listAll();
    }

}
