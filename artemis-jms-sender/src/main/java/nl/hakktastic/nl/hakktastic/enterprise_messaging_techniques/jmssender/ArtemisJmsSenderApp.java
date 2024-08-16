package nl.hakktastic.nl.hakktastic.enterprise_messaging_techniques.jmssender;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@EnableJms
@SpringBootApplication
public class ArtemisJmsSenderApp {

    public static void main(String[] args) {

        SpringApplication.run(ArtemisJmsSenderApp.class, args);
    }
}
