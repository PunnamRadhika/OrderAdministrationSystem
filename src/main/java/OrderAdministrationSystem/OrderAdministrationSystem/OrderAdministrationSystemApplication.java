package OrderAdministrationSystem.OrderAdministrationSystem;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@SpringBootApplication
@ComponentScan(basePackages = {"com.oas"})
@EntityScan("com.oas.Entity")
@EnableJpaRepositories("com.oas.Repo")
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@EnableScheduling
@EnableCaching
@Configuration
@EnableWebMvc
public class OrderAdministrationSystemApplication implements WebMvcConfigurer {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Material Order Processing API").version("1.0")
			.description("Material Order Processing API using Spring Boot")
			.termsOfService("http://swagger.io/terms/")
			.license(new License().name("Apache 2.0").url("http://springdoc.")
					));
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("swagger-ui.html")
	                .addResourceLocations("classpath:/META-INF/resources/");
	        registry.addResourceHandler("/webjars/**")
	                .addResourceLocations("classpath:/META-INF/resources/webjars/");
    }

	@Bean
	public ModelMapper modelmapper() {
		return new ModelMapper();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OrderAdministrationSystemApplication.class, args);
	}

}
