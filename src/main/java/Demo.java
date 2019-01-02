import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import service.UserService;

public class Demo {

    private UserDao userDao;
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Demo demo= (Demo) applicationContext.getBean("demo");
        demo.getUser();
    }


    public void getUser(){
        System.out.println(userDao.getUser(1));

    }
}
