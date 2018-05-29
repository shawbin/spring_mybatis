package com.doushabao.framework.exceptiondeal;

import com.doushabao.ResultEnum;
import com.doushabao.framework.exceptiondeal.GlobalException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Spring DispatcherServlet 捕获异常统一处理
 */
public class GlobalExceptionResolver implements HandlerExceptionResolver {

    /**
     * override
     * @param request
     * @param response
     * @param handler
     * @param ex 捕获到的异常
     * @return
     */
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

        //此异常是自定义的全局异常
        GlobalException exception = null;
        if (ex instanceof GlobalException) {
            exception = (GlobalException) ex;
        }else {
            exception = new GlobalException(ResultEnum.ERROR.getCode(), ResultEnum.ERROR.getMessage());
        }
        //获取异常信息
        String message = exception.getMessage();
        ModelAndView mav = new ModelAndView();
        //将异常放入
        mav.addObject("message", message);
        //设置指定错误页面
        mav.setViewName("error");
        return mav;
    }
}
