import dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Demo demo= (Demo) applicationContext.getBean("demo");


    }

    public void getUser(){
        System.out.println(userDao.getUser(1));

    }
}
