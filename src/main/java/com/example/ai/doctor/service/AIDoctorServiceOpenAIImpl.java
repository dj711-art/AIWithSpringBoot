package com.example.ai.doctor.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.prompt.ChatOptions;
import org.springframework.stereotype.Service;

@Service
public class AIDoctorServiceOpenAIImpl implements AIDoctorService{
    private final ChatClient chatClient;
    public AIDoctorServiceOpenAIImpl(ChatClient.Builder chatClientBuilder) {
        ChatOptions chatOptions = ChatOptions.builder()
                .model("gpt-4o-mini")
                .build();
        this.chatClient = chatClientBuilder.defaultOptions(chatOptions).build();
    }
    @Override
    public Answer askQuestion(Question question) {
        String answer = chatClient.prompt()
                .user(question.question())
                .call()
                .content();
        return new Answer(answer);
    }
}
