package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Doctor staff1 = context.getBean(Doctor.class);
        staff1.assist();
        System.out.println(staff1.getQualifiction());
        Staff staff2 = (Nurse) context.getBean("nurse");
        staff2.assist();
    }
}
