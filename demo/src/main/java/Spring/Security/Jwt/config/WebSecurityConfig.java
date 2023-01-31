package Spring.Security.Jwt.config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import Spring.Security.Jwt.jwtutils.JwtAuthenticationEntryPoint;
import Spring.Security.Jwt.jwtutils.JwtFilter;

@Configuration
public class WebSecurityConfig
{
   @Autowired
   private JwtAuthenticationEntryPoint authenticationEntryPoint;
   @Autowired
   private UserDetailsService userDetailsService;
   @Autowired
   private JwtFilter filter;
   @Bean
   public PasswordEncoder passwordEncoder() {
      return new BCryptPasswordEncoder();
   }
   
   @Bean
   public DaoAuthenticationProvider authenticationProvider() {
       DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
        
       authProvider.setUserDetailsService(userDetailsService);
       authProvider.setPasswordEncoder(passwordEncoder());
    
       return authProvider;
   }
   
   @Bean
   public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
     return authConfig.getAuthenticationManager();
   }

  
@SuppressWarnings("deprecation")
@Bean
   public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
     http.cors().and().csrf().disable()
         .exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and()
         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
         .authorizeRequests().requestMatchers("/login").permitAll()
         .anyRequest().authenticated();
     
     http.authenticationProvider(authenticationProvider());

     http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
     
     return http.build();
}
}