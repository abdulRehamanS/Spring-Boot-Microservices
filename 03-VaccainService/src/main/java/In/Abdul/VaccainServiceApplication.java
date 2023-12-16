package In.Abdul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class VaccainServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccainServiceApplication.class, args);
	}

	// create restTemplate
	@Bean
	@LoadBalanced
	public RestTemplate geRestTemplate() {
		return new RestTemplate();

	}

}
