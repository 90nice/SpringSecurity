package com.itheima.security.springboot.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.security.springboot.controller.LoginController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: Yan.Guan
 * @date: 2020/8/26 10:42
 * @description:
 */

@Component
@Slf4j
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request,
                                        HttpServletResponse response,
                                        Authentication auth) throws IOException {
        System.out.println("登录成功！！！");
        response.setContentType("application/json;charset=utf-8");
        HttpSession session = request.getSession();
        LoginController loginController = new LoginController();
        session.setAttribute("designer_name", loginController.getUsername());
        ObjectMapper om = new ObjectMapper();
        PrintWriter out = response.getWriter();
        out.flush();
        out.close();
    }

}
