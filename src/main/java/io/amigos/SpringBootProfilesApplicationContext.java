package io.amigos;

import io.amigos.beans.ConnectionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootProfilesApplicationContext {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootProfilesApplicationContext.class, args);
        ConnectionManager connectionManager = context.getBean(ConnectionManager.class);
        System.out.println(connectionManager);
    }
}
