package com.cosun.finance.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author:homey Wong
 * @date:2018/12/28 0028 下午 4:50
 * @Description: 每用某个功能前查验是否登录状态
 * @Modified By:
 * @Modified-date:
 */

@Configuration
public class UserSecurityInterceptor extends WebMvcConfigurerAdapter {
    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());

        //排除配置
        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/");
        addInterceptor.excludePathPatterns("/account/**");
        //拦截配置
        addInterceptor.addPathPatterns("/account/toMainPage");
        addInterceptor.addPathPatterns("/order/createsinglegoods");
        addInterceptor.addPathPatterns("/fileupdown/**");
        addInterceptor.addPathPatterns("/person/**");
        addInterceptor.addPathPatterns("/rules/**");
    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
            HttpSession session = request.getSession();
            int interval = session.getMaxInactiveInterval();
            System.out.println("=============session time================"+interval);
            //判断是否已有该用户登录的session
            if (session.getAttribute("account") != null) {
                return true;
            }
            //跳转到登录页
            String url = "/account/tologin";
            response.sendRedirect(url);
            return false;
            // return true;
        }
    }

}

