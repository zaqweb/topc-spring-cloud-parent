package co.topc.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

/**
 * @author zaqweb
 *
 */
public class TopcSpringCloudEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TopcSpringCloudEurekaApplication.class, args);
	}

}
