package com.sunwonders.sentiment.analysis.controller;

import com.sunwonders.sentiment.analysis.domain.SentimentAnalyzer;
import com.sunwonders.sentiment.analysis.dto.SentimentRequest;
import com.sunwonders.sentiment.analysis.dto.SentimentResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/analyse")
public class AnalyseController {

    @PostMapping("/")
    public ResponseEntity<SentimentResult> analyse(@RequestBody SentimentRequest sentimentRequest){
        return ResponseEntity.status(200).body(SentimentAnalyzer.getSentimentResult(sentimentRequest.getMessage()));
    }
}
