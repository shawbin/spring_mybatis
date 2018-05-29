package com.doushabao.framework.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.Logger;

/**
 * log interceptor
 */
public class LogHandlerInterceptor implements HandlerInterceptor {

    private static final Logger logger = Logger.getLogger("exception");

    /**
     * 进入handler方法之前
     * 可用于登陆的身份验证
     * @param request
     * @param response
     * @param handler
     * @return
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        //放行
        return true;
    }

    /**
     * 进入handler方法之后，返回ModelAndView之前执行
     * 应用场景ModelAndView，返回共用的菜单，返回视图
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    /**
     * 执行handler之后
     * 统一的异常处理
     * 统一的日志处理
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        //打印异常
        logger.info(ex.getMessage());
    }
}
