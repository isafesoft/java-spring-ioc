import com.mk.springdemo.Coach;
import com.mk.springdemo.CricketCoach;
import com.mk.springdemo.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);

        Coach theCoach = context.getBean("swimCoach", Coach.class);

        System.out.println(theCoach.getDailyFortune());
        context.close();
    }
}
