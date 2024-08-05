import org.itstep.one_to_one_unit.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.transaction.Transactional;

@SpringBootApplication
@Transactional
public class Application implements CommandLineRunner {

    @Autowired
    EmployeeService employeeService;

    public static void main(String[] args) {

        SpringApplication.run
                (Application.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        //One-to-one unidirectional

    }
}