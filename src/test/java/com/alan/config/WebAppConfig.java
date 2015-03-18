package com.alan.config;

import org.springframework.context.annotation.Bean;  
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;  
import org.springframework.web.servlet.config.annotation.EnableWebMvc;  
import org.springframework.web.servlet.view.JstlView;  
import org.springframework.web.servlet.view.UrlBasedViewResolver; 

//Projekt:
//	http://fruzenshtein.com/spring-jpa-data-hibernate-mysql/
//start:
//	http://localhost/SpringJpaHibernate/index.jsp
  
@Configuration //Specifies the class as configuration  
@ComponentScan("com.alan") //Specifies which package to scan  
@EnableWebMvc //Enables to use Spring's annotations in the code  
public class WebAppConfig {  
      
    @Bean  
    public UrlBasedViewResolver setupViewResolver() {  
        UrlBasedViewResolver resolver = new UrlBasedViewResolver();  
        resolver.setPrefix("/WEB-INF/pages/");  
        resolver.setSuffix(".jsp");  
        resolver.setViewClass(JstlView.class);  
        return resolver;  
    }  
  
}  
