package lk.ijse.gdse63.aad.app;

import lk.ijse.gdse63.aad.app.config.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer{
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        //XML Application Context - Configure with xml
        ctx.register(ApplicationConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();
    }
}
//ioc container
//spring container
//bean factory