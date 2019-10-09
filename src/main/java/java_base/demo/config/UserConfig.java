package java_base.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

    @Value("${ip}")
    private String httpIp;

    @Value("${port}")
    private String httpPort;

    @Autowired
    private Environment env;

    @Value("${user}")
    private  String username;

    @Value("${password}")
    private  String password;

    @Value("${address}")
    private  String address;


    public void show(){
        System.out.println("httpIp = " + httpIp);
        System.out.println("httpPort = " + httpPort);
        System.out.println(env.getProperty("ip"));
        System.out.println("username = "+ username);
        System.out.println("password = "+ password);
        System.out.println("username = " + env.getProperty("username"));
        System.out.println("address = "+ address);
    }

}
