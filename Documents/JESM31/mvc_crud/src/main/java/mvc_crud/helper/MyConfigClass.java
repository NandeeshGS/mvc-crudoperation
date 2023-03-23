package mvc_crud.helper;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("mvc_crud")
public class MyConfigClass 
{

	@Bean
	public EntityManagerFactory getEMF(){
		return Persistence.createEntityManagerFactory("dev");
	}
	
	@Bean
	public ViewResolver getViewResolver(){//its used to set the jsp file to other service then we use View Resolver where we will not write .jsp in calling the jsp file
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
//		resolver.setPrefix("frontend/");
		resolver.setSuffix(".jsp");
		return resolver;
		
	}
	
}
