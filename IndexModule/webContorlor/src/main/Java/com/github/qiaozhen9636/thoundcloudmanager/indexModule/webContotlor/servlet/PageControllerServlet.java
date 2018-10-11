/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: PageControllerServlet
 * Author:   Administrator
 * Date:     2018/10/11 17:51
 * Description: 页面控制的servlet，主要负责前台页面的交互
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.servlet;

import com.google.gson.Gson;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈页面控制的servlet，主要负责前台页面的交互〉
 *
 * @author Administrator
 * @create 2018/10/11
 * @since 1.0.0
 */
@WebServlet("/PageControllerServlet")
public class PageControllerServlet extends BaseServlet {

    public String getUserData(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String json = new Gson().toJson("1");
        response.getWriter().println(json);
        return null;
    }
}
