package com.aakkus.cloudkafkastream.service;

import com.aakkus.cloudkafkastream.configuration.GreetingsStream;
import com.aakkus.cloudkafkastream.model.Greetings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class GreetingsService {
    private final GreetingsStream greetingsStream;

    public GreetingsService(GreetingsStream greetingsStream) {
        this.greetingsStream = greetingsStream;
    }

    public void sendGreeting(final Greetings greetings) {
        log.info("Sending greetings {}", greetings);

        MessageChannel messageChannel = greetingsStream.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
//                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}