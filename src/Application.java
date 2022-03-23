import com.github.DBConnect;
import com.github.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("daos.xml", "services.xml");

        Person p = context.getBean("person", Person.class);

        p.setFirstName("Raja");
        p.setLastName("Bala");

        DBConnect dbConnect = context.getBean("dbconnect", DBConnect.class);

        dbConnect.setDbConnection("Connection string");

        System.out.println(p.getFullName());
        System.out.println(dbConnect.getDbConnection());

    }
}
