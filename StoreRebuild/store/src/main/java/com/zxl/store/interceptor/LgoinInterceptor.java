package com.zxl.store.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LgoinInterceptor implements HandlerInterceptor {
    //在调用所有处理请求的方法之前被自动调用执行的方法

    /**
     * 检测全局Session对象中是否有Uid数据，如果有放行，如果没有重定向到登陆页面
     *
     * @param request  请求对象
     * @param response 响应对象
     * @param handler  处理器
     * @return 如果返回值为true--> 放行  如果false--> 拦截
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) throws Exception {
        //获取项目工程的session
        HttpSession session = request.getSession();

        if (session.getAttribute("uid") != null) { //说明此时已登录
            return true;
        } else {
            //说明未登录重定向至登录页面
            response.sendRedirect("/web/login.html");
            session.removeAttribute("uid");
            return false;
        }
    }

    //ModelAndView对象返回之后被调用的方法
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    //在整个请求所有关联的资源被执行完毕最后所执行的方法
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
