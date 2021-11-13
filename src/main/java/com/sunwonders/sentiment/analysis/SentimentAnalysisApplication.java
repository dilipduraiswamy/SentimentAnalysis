package com.sunwonders.sentiment.analysis;

import com.sunwonders.sentiment.analysis.domain.SentimentAnalyzer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SentimentAnalysisApplication {

	public static void main(String[] args) {
		SentimentAnalyzer.initialize();
		SpringApplication.run(SentimentAnalysisApplication.class, args);
	}

}
