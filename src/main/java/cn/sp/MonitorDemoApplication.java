package cn.sp;

import io.prometheus.client.spring.boot.EnablePrometheusEndpoint;
import io.prometheus.client.spring.boot.EnableSpringBootMetricsCollector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnablePrometheusEndpoint
@EnableSpringBootMetricsCollector
@SpringBootApplication
public class MonitorDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorDemoApplication.class, args);
	}

}
