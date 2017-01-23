package com.github.aem;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(label = "Servlet - Registered By Path")
@Service(Servlet.class)
@Properties({
        @Property(name="sling.servlet.paths", value="/bin/arbitraryPath"),
        @Property(name="sling.servlet.methods", value="get"),
        @Property(name="sling.servlet.extensions", value="sample")
})
/**
 * Created by shabhushan on 1/23/2017.
 */
public class ServletByPath extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Servlet By Path");
    }
}
