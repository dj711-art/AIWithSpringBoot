package com.example.ai.doctor.controller;

import com.example.ai.doctor.service.AIDoctorService;
import com.example.ai.doctor.service.Answer;
import com.example.ai.doctor.service.Question;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AIDoctorController {
    // This class will handle HTTP requests related to AI Doctor functionalities.
    // It will use AIDoctorService to process questions and return answers.
    private final AIDoctorService aiDoctorService;

    // Example method to handle a question
    @Tag(name="AI Doctor",description = "Ask your health-related questions to the AI Doctor")
     @PostMapping("/ask")
     public Answer askQuestion(@RequestBody Question question) {
         return aiDoctorService.askQuestion(question);
     }
}
