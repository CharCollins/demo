package com.charlene.servlet;

import com.charlene.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by charlene on 17/3/28.
 */
public class DemoServlet extends HttpServlet {

    private User user;

    @Override
    public void init(){
        //应该是servlet初始化
        ApplicationContext ctx= WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        user =(User) ctx.getBean("testbean");
    }

    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        doPost(request,response);
    }

    @Override
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("application/json;charset=utf-8");
        response.setStatus(200);
        String content="first demo";

        byte[] outBytes=content.getBytes("UTF8");

        response.setContentLength(outBytes.length);
        response.getOutputStream().write(outBytes);
    }

}
