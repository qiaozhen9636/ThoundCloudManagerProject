/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: TestAboutUtils
 * Author:   Administrator
 * Date:     2018/10/15 8:13
 * Description: 一个关于工具类的测试类
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */

import com.github.qiaozhen9636.thoundcloudmanager.user.output.Impl.UserDataServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 〈一句话功能简述〉<br> 
 * 〈一个关于工具类的测试类〉
 *
 * @author Administrator
 * @create 2018/10/15
 * @since 1.0.0
 */

public class TestAboutUtils {
    private ApplicationContext context;
    @Before
    public void before() {
        context=new ClassPathXmlApplicationContext("classpath:Spring/applicationContext-services.xml");
    }

    @Test
    public void test1() throws Exception{
        UserDataServiceImpl userDataService = ((UserDataServiceImpl) context.getBean("UserDataService"));
        userDataService.createUserDataService("admin","694219972");
        System.out.println(userDataService.getUserName());
    }
    @Test
    public void test2(){
        UserDataServiceImpl service = ((UserDataServiceImpl) context.getBean("UserDataService"));
//        System.out.println(service.test());
    }
}
