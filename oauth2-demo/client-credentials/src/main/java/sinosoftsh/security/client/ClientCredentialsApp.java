package sinosoftsh.security.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * Created by xujingfeng on 2017/8/7.
 */
@SpringBootApplication
@EnableAuthorizationServer
public class ClientCredentialsApp {

    public static void main(String[] args) {
        SpringApplication.run(ClientCredentialsApp.class, args);
    }
}
