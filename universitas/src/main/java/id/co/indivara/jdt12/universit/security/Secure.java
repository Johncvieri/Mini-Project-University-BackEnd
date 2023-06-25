package id.co.indivara.jdt12.universit.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@Configuration
public class Secure extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin").password("{noop}password").roles("admin")
                .and()
                .withUser("student").password("{noop}123").roles("student")
                .and()
                .withUser("lecturer").password("{noop}123").roles("student", "lecturer");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.DELETE,"/delete/**").hasRole("student")
                .antMatchers(HttpMethod.POST,"/add/").hasRole("admin")
                .antMatchers(HttpMethod.POST,"/matkul/").hasRole("admin")
                .antMatchers(HttpMethod.POST,"/add/grade/").hasRole("admin")
                .antMatchers(HttpMethod.GET,"/find/**").hasRole("student")
                .antMatchers(HttpMethod.GET,"/all/").hasRole("student")
                .antMatchers(HttpMethod.GET,"/findname/").hasRole("student")
                .antMatchers(HttpMethod.GET,"/findstudent/**").hasRole("lecturer")
                .antMatchers(HttpMethod.GET,"/findlecture/**").hasRole("lecturer")
                .antMatchers(HttpMethod.GET,"/all/lecture/").hasRole("lecturer")
                .antMatchers(HttpMethod.GET,"/all/").hasRole("lecturer")
                .antMatchers(HttpMethod.DELETE,"/add/lecture/").hasRole("lecturer")
                .antMatchers(HttpMethod.GET,"/findstudent/").hasRole("lecturer")
                .antMatchers(HttpMethod.GET,"/inputGrade/student/").hasRole("lecturer"+"admin")
                .and()
                .csrf().disable().formLogin().disable();
    }
}
