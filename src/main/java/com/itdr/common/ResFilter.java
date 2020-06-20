package com.itdr.common;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "ResFilter",value="/*")
public class ResFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //拦截请求
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/json;charset=utf-8");
        //放行请求
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
