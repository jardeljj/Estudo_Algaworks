package com.estudo.estudo;

import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.i18n.FixedLocaleResolver;

@SpringBootApplication
public class EstudoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudoApplication.class, args);
	}
        
        @Bean
        public FixedLocaleResolver LocaleResolver(){
            return new FixedLocaleResolver(new Locale("pt", "BR"));
        }

}
