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

@Component(label = "Servlet - By Selectors")
@Service(Servlet.class)
@Properties({
        @Property(name="sling.servlet.resourceTypes", value="sling/servlet/default"),
        @Property(name="sling.servlet.selectors", value="selectorservlet"),
        @Property(name="sling.servlet.extensions", value="sample"),
        @Property(name="sling.servlet.methods", value="GET")
})
/**
 * Created by shabhushan on 1/23/2017.
 *
 * Call this Servlet using following Path
 * http://localhost:4502/content/clientlibs/doesNotExist.selectorservlet.sample
 *
 * This works because Servlet is registered with sling/servlet/default and the request selector and extension matches
 * what's required to invoke the servlet.
 */
public class ServletBySelector extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Servlet - Registered with selector");
    }
}
