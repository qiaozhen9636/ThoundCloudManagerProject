/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: WorkControllor
 * Author:   Administrator
 * Date:     2018/10/24 19:45
 * Description: 职能控制器
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.Controller;

import com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.vo.ResultMessage;
import com.github.qiaozhen9636.thoundcloudmanager.user.output.DepDataService;
import com.github.qiaozhen9636.thoundcloudmanager.user.output.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 〈一句话功能简述〉<br> 
 * 〈职能控制器〉
 *
 * @author Administrator
 * @create 2018/10/24
 * @since 1.0.0
 */
@Controller
@RequestMapping("/work")
public class WorkControllor {
    @Autowired
    UserDataService userService;
    @Autowired
    DepDataService depDataService;
    @RequestMapping("/getMamberOfDep")
    @ResponseBody
    public ResultMessage getMamberOfDep(){
        if (!userService.checkxLogin())return ResultMessage.UNLOGIN("ERROR");
        return ResultMessage.SUCCESS(null);
    }


}
