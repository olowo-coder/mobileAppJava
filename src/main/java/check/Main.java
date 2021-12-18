package check;

import com.example.studentJpa.entity.Student;
import com.example.studentJpa.services.StudentServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

//        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigFiles.class);
        //or

//        ConfigurableApplicationContext context = SpringApplication.run(Main.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigFiles.class);
        System.out.println("config loaded");
        Sim sim = context.getBean("sim",Sim.class);
//        Sim sim = context.getBean(Sim.class);
        sim.calling();
        sim.data();

        System.out.println("-".repeat(90));
        NewPhone phone1 = context.getBean("phone", NewPhone.class);
        phone1.printInternet();
        phone1.allData();

        System.out.println("-".repeat(90));
//        ApplicationContext context1 = new AnnotationConfigApplicationContext(ConfigFiles.class);
        LockSystem lockPhone = context.getBean("faceScanner", LockSystem.class);
        lockPhone.lockType();

        context.close();

//        System.out.println(Integer.parseInt("98", 16));
//        System.out.println(Integer.parseInt("1000", 2));
//        System.out.println(Integer.toHexString(152));

        Student student = new Student();
        student.setStudentId(1L);
        student.setFirstName("olowo");
        student.setLastName("lanre");
        student.setEmail("lanre@gmail.com");
        System.out.println(student);

    }
}
