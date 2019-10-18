package kr.co.itcen.hellospring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // MVC와 관련된 기본 설정을 해준다. ( 따로 설정하면 기본 설정을 하지 않음 )
@ComponentScan({"kr.co.itcen.hellospring.controller"}) // auto-scan
public class WebConfig {
	
	@Bean
	public ViewResolver viewResolver() { // ViewResolver인터페이스의 InternalResourceViewResolver를 객체를 만든다.
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		//viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setExposeContextBeansAsAttributes(true);
		viewResolver.setOrder(1);
		return viewResolver;
	}
	
	
	
}
