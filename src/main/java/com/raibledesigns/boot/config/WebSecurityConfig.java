package com.raibledesigns.boot.config;


//@Configuration
//@EnableWebSecurity
//@Order(Ordered.LOWEST_PRECEDENCE - 6)
public class WebSecurityConfig{// extends WebSecurityConfigurerAdapter {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/", "/home").permitAll()
//                .antMatchers("/v1.0/**").hasRole("USER")
//                .anyRequest().authenticated();
//        http.httpBasic().realmName("My API");
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
//        authManagerBuilder.inMemoryAuthentication()
//                .withUser("test").password("test123").roles("USER");
//    }
}