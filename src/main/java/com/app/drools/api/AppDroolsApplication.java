package com.app.drools.api;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.rule.FactHandle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.app.drools.api.model.Product;

@SpringBootApplication
public class AppDroolsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDroolsApplication.class, args);
		
		/*Product p1=new Product();
		p1.setType("diamond");
		p1.setQuality("a");
		p1.setMade("us");
		
		FactHandle fact1;
		*/
		
		
		
	}

	@Bean
	public KieContainer kieContainer() {
		return KieServices.Factory.get().getKieClasspathContainer();
	}
}
