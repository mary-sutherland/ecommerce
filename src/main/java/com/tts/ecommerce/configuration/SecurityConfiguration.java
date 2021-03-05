package com.tts.ecommerce.configuration;

import org.springframework.beans.factory.annotation.Autowired;

@Congiguration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserService userService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userService).passwordEncoder(bCryptPassword);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/cart").authenticated()
                .and().formLogin()
                    .loginPage("/signin")
                    .loginProcessingUrl("/login")
                .and().logout()
                    .logoutRequestMathcer(new AntPathRequestMatcher("/signout"))
                    .logoutSu
    }
}
