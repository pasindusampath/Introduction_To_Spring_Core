package lk.ijse.gdse63.aad.app.config;

import lk.ijse.gdse63.aad.app.sample.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration//Source for bean definition
@ComponentScan("lk.ijse.gdse63.aad.app.sample")
public class ApplicationConfig {

    @Bean(name = "first")
    public MyBean getMyBean(){
        return new MyBean();
    }

}
