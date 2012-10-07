package com.mobiledaily.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.web.FilterChainProxy;

/**
 * Created with IntelliJ IDEA.
 * User: johnson
 * Date: 10/7/12
 * Time: 7:11 PM
 * To change this template use File | Settings | File Templates.
 */
@Configuration
@ImportResource({"classpath*:/spring-security.xml"})
@ComponentScan(basePackages = "com.mobiledaily.demo.service", excludeFilters = {@ComponentScan.Filter(Configuration.class)})
public class AppConfig {

}
