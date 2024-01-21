package com.aws.clouwatcghlogs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringBootAwsCloudWatchLogsApplication {

	private final static Logger controllerLogger = LoggerFactory
			.getLogger(SpringBootAwsCloudWatchLogsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsCloudWatchLogsApplication.class, args);
	}

	@GetMapping("/greeting")
	public ResponseEntity<String> getDashboardPanelInformation() {
		controllerLogger.info("User called the controller(This logger uses native aws logging)....");
		return new ResponseEntity<>("Hello current user greetings..", HttpStatus.OK);
	}

}
