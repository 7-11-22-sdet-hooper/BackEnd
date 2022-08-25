package com.ReviewSite.ReviewSite.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.ReviewSite.ReviewSite.user.UserService;

import lombok.AllArgsConstructor;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class WebSecurityConfig{
	private final UserService userService;

	@Bean
	protected SecurityFilterChain configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers("/sign-up/**", "/sign-in/**","/**")
				.permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.formLogin()
				.loginPage("/sign-in")
				.permitAll();
        return http.build();

	}
     @Bean
     public static BCryptPasswordEncoder passwordEncoder() {
         return new BCryptPasswordEncoder();
     }

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userService);
				//this.passwordEncoder();
	}
}