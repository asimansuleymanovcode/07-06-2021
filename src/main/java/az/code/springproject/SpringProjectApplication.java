package az.code.springproject;

import az.code.springproject.services.ExecuteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {
    ApplicationContext context;

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ExecuteService executeService=  context.getBean(ExecuteService.class);
        executeService.execute();
        executeService.execute();
        System.out.println(executeService.getCount());
    }

    @Autowired
    public void setContext(ApplicationContext context){
        this.context = context;
    }
}
