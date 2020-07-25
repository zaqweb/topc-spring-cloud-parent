package co.topc.spring.cloud.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * @author zaqweb
 * @date 2020/2/8 10:16 PM
 */
public class RutorConfig {

	@Bean
	public RouteLocator topcCloudRouter(RouteLocatorBuilder builder) {
		return builder.routes().route("ss",r->r.path("sss").uri("ssss")).build();
	}
}
