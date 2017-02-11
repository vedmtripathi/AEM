package com.github.aem;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(label = "Servlet - Registered By Path")
@Service(Servlet.class)
@Properties({
        @Property(name="sling.servlet.paths", value="/bin/postPath"),
        @Property(name="sling.servlet.methods", value="post"),
        @Property(name="sling.servlet.extensions", value="sample")
})
/**
 * Created by Shashi Bhushan on 1/23/2017.
 */
public class ServletByPostRequest extends SlingAllMethodsServlet {
    @Override
    protected void doPost(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Servlet By PostRequest");
    }
}
