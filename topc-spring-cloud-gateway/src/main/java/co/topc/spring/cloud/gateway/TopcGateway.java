package co.topc.spring.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zaqweb
 * @date 2020/2/7 9:49 PM
 */

@SpringBootApplication
@EnableEurekaClient
public class TopcGateway {

	public static void main(String[] args) {
		SpringApplication.run(TopcGateway.class, args);
	}
}
