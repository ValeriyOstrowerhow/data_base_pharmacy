//package de.aittr.data_base_pharmacy.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//
//import static org.springframework.security.core.userdetails.User.withDefaultPasswordEncoder;
//
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfigLog {
//
//    @Bean
//   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//               .authorizeHttpRequests((requests) -> requests.requestMatchers("/", "/home").permitAll().anyRequest().authenticated()
//             )
//               .formLogin((form) -> form
//                       .loginPage("/login")
//                    .permitAll()
//              ).logout(LogoutConfigurer::permitAll);
//
//       return http.build();
//   }
//
//   @Bean
//    public UserDetailsService userDetailsService() {
//       UserDetails user =
//               withDefaultPasswordEncoder()
//                       .username("user")
//                      .password("12345")
//                     //.roles("user")
//                        .build();
//
//       return new InMemoryUserDetailsManager(user);
//    }
//}
