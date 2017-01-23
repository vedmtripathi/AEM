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

@Component(label = "Servlet - By Resource Type")
@Service(Servlet.class)
@Properties({
        @Property(name="sling.servlet.paths", value="/bin/overrideResourceType"),
        @Property(name = "sling.servlet.resourceTypes", value="/apps/clientlibs/servlet"),
        @Property(name = "sling.servlet.methods", value="GET"),
        @Property(name = "sling.servlet.extensions", value="sample")
})
/**
 * Created by shabhushan on 1/23/2017.
 *
 * Call this Servlet by Following path
 * http://localhost:4502/content/clientlibs/jcr:content/par.sample
 *
 * This works because at path /content/clientlibs/jcr:content/par, there is a node which makes a request
 * to resourceType /apps/clientlibs/servlet
 */
public class ServletByResourceType extends SlingSafeMethodsServlet {
    @Override
    protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("Servlet - By Resource Type");
    }
}
