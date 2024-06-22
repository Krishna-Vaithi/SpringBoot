package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ApplicationContext context = new AnnotationConfigApplicationContext(BeanCofig.class);

        Doctor staff1 = context.getBean(Doctor.class);
        staff1.assist();
        Staff staff2 = (Nurse) context.getBean("nurse");
        staff2.assist();
    }
}
