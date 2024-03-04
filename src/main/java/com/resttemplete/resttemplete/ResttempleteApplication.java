package com.resttemplete.resttemplete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ResttempleteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttempleteApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	// @Bean("restTemplateWithTimeout")
	// RestTemplate restTemplateWithTimeout() {
	// return new RestTemplate(getClientHttpRequestFactory());
	// }

	// ClientHttpRequestFactory getClientHttpRequestFactory() {
	// int timeout = 5000;
	// HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new
	// HttpComponentsClientHttpRequestFactory();
	// clientHttpRequestFactory.setConnectTimeout(timeout);
	// return clientHttpRequestFactory;
	// }

	// ClientHttpRequestFactory getClientHttpRequestFactoryV1() {
	// int timeout = 5000;
	// RequestConfig config = RequestConfig.custom()
	// .setConnectTimeout(timeout)
	// .setConnectionRequestTimeout(timeout)
	// .setSocketTimeout(timeout)
	// .build();
	// CloseableHttpClient client = HttpClientBuilder
	// .create()
	// .setDefaultRequestConfig(config)
	// .build();
	// return new HttpComponentsClientHttpRequestFactory(client);
	// }
}
