package com.pddz.price.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.IOException;

@WebFilter(
        urlPatterns = {"/rest/*"},
        initParams = {@WebInitParam(
                value = "tblproductorder,tblprocart,tblshopcar",
                name = "protects"
        )}
)
public final class SessionFilter implements Filter {
    private FilterConfig config;

    public final FilterConfig getConfig() {
        return this.config;
    }

    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    public void destroy() {
        this.config = (FilterConfig) null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest hrequest = (HttpServletRequest) request;
        HttpServletResponseWrapper wrapper = new HttpServletResponseWrapper((HttpServletResponse) response);
        boolean predict = hrequest.getHeader("AuthToken") != null;
        if (predict) {
            chain.doFilter(request, response);
        } else {
            wrapper.sendError(403, "please login first");
        }
    }
}