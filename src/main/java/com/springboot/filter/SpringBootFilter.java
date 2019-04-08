package com.springboot.filter;

import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@Order(1)
@WebFilter(filterName="springboot filter by annotation",urlPatterns = "/*")
public class SpringBootFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        long now = System.currentTimeMillis();
        chain.doFilter(request, response);
        System.out.println("filter cacl operation time="+(System.currentTimeMillis()-now));
    }

    @Override
    public void destroy() {

    }
}
