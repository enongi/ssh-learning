package test;

import com.bean.TbUser;
import com.service.TbUserService;
import com.service.TbUserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
FileSystemXmlApplicationContext读取配置文件时，需要使用绝对路径
ClassPathXmlApplicationContext是通过相对路径来读取配置文件的
 */
public class Test {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("/spring-config.xml");


//        TestService testService = (TestService) applicationContext.getBean("testService");
//        testService.hello();

        TbUserService tbUserService = (TbUserServiceImpl) applicationContext.getBean("tbUserService");
        TbUser tbUser = new TbUser();
        tbUser.setUsername("eagle");
        tbUser.setNickname("伊格尔");
        tbUser.setPassword("123456");
        tbUserService.add(tbUser);
    }
}
