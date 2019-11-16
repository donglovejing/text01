package cn.javaConfig;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

@Configuration
public class MyWebApplicationInitializer extends AbstractDispatcherServletInitializer {

    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext aconfig = new AnnotationConfigWebApplicationContext();

        aconfig.register();
        aconfig.refresh();
        return aconfig;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/*"};
    }

    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }



}
