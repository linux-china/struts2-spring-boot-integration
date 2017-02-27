package org.mvnsearch.ssh.demo.config;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.DispatcherType;

/**
 * struts 2 configuration
 *
 * @author linux_china
 */
@Configuration
public class Struts2Configuration {
    @Bean
    public FilterRegistrationBean someFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(new StrutsPrepareAndExecuteFilter());
        registration.addUrlPatterns("*.action");
        registration.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        registration.setName("StrutsPrepareAndExecuteFilter");
        return registration;
    }

}
