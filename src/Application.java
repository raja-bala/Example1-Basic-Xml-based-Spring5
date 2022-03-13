import com.github.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Person p = context.getBean("person", Person.class);

        p.setFirstName("Raja");
        p.setLastName("Bala");

        System.out.println(p.getFullName());

    }
}
