import com.mk.springdemo.Coach;
import com.mk.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //DI by xml
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        CricketCoach ckCoach = context.getBean("myCricketCoach", CricketCoach.class);
        ckCoach.getDailyFortune();
        ckCoach.getDailyWorkout();
        context.close();
    }
}
