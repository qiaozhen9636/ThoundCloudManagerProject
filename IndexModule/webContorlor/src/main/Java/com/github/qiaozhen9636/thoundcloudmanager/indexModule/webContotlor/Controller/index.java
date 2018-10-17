/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: index
 * Author:   Administrator
 * Date:     2018/10/16 11:59
 * Description: 首页控制页面
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen     2018/10/16 23:14      版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.Controller;

import com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.beans.User;
import com.github.qiaozhen9636.thoundcloudmanager.user.output.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈首页控制页面〉
 *
 * @author Administrator
 * @create 2018/10/16
 * @since 1.0.0
 */
@Controller
@RequestMapping("/index")
public class index {
    @Autowired
    private UserDataService userService;
    @Value("${BaseUser.Name}")
    private String defUserName;

    @RequestMapping("/getUserData")
    @ResponseBody
    public User getUserData(){
        //如果为登录，返回null
        if (!userService.checkxLogin())return null;
        return new User(userService.getUserName()," ",userService.getIntegral(),userService.getUserBalance(),
                userService.getUserTodo());
    }
    @RequestMapping("/login")
    public String login(String username, String password){
        System.out.println(username+" "+password);
        userService.createUserDataService(username,password);
        return "redirect:/index.html";
        //↑在类上添加了@RequestMapping注解后,使用单纯的"index"
        // 怎么跳都会变成localhost:8080/index/index.html
        //加空前缀无效，单/前缀会导致css无法渲染，
        //但我想要跳到localhost:8080/index.html
        //不得以只能通过绝对路径进行重定向
    }

    @RequestMapping("/logout")
    public String logout(){
        userService.removeUserDataService();
        return  "redirect:/index.html";
    }

}
