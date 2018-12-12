import com.mk.springdemo.Coach;
import com.mk.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("thatSillyCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        context.close();
    }
}
