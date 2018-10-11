package com.github.qiaozhen9636.thoundcloudmanager.indexModule.webContotlor.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;

public class BaseServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charaset=utf-8");
        String methodName = request.getParameter("method");
        try {
            Method method = this.getClass().getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            String url = ((String) method.invoke(this, request, response));
            if (url != null) {
                request.getRequestDispatcher(url).forward(request, response);
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.getRequestDispatcher("/error/404.html").forward(request, response);
        }
    }
}
