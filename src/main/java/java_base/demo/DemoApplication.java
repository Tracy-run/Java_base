package java_base.demo;

import java_base.demo.config.UserConfig;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;


@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScan({"java_base.demo.config"})
public class DemoApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        UserConfig bean = context.getBean(UserConfig.class);
        bean.show();

        context.close();
    }

}


