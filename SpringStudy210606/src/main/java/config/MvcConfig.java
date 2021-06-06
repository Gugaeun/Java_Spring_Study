package config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.HandlerMapping;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;
import org.springframework.web.servlet.mvc.HttpRequestHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;
import org.springframework.web.servlet.resource.DefaultServletHttpRequestHandler;

@Configuration
@EnableWebMvc
public class MvcConfig 
//implements WebMvcConfigurer
{

	@Bean
	public HandlerMapping handlerMapping() {
		
		System.out.println("HandlerMapping handlerMapping() call");
		RequestMappingHandlerMapping hm = new RequestMappingHandlerMapping();
		hm.setOrder(0);
		
		return hm;
	}
	
	@Bean
	public HandlerAdapter handlerAdapter() {
		return new RequestMappingHandlerAdapter();
	}
	
	@Bean
	
	public HttpRequestHandler defaultServletHandler() {
		System.out.println("HttpRequestHandler defaultServletHandler() call");
		return new DefaultServletHttpRequestHandler();
	}
	
	@Bean
	public HandlerMapping simpleHandlerMapping() {
		System.out.println("HandlerMapping simpleHandlerMapping() call");
	    SimpleUrlHandlerMapping hm = new SimpleUrlHandlerMapping();
	    Map<String, Object> pathMap = new HashMap<>();
	    pathMap.put("/**", defaultServletHandler());
	    hm.setUrlMap(pathMap);
	    
	    return hm;
	}
	
	@Bean
	  public HandlerAdapter requestHandlerAdapter() {
		System.out.println("HandlerAdapter requestHandlerAdapter() call");
	    return new HttpRequestHandlerAdapter();
	  }
	
	
//	@Override
//	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
//		// TODO Auto-generated method stub
//		//WebMvcConfigurer.super.configureDefaultServletHandling(Configure);
//		configurer.enable();
//	}
//
//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		// TODO Auto-generated method stub
//		//WebMvcConfigurer.super.configureViewResolvers(registry);
//		registry.jsp("/WEB-INF/view/", ".jsp");
//	}
	

}
