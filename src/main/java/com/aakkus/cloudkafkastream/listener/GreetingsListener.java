package com.aakkus.cloudkafkastream.listener;

import com.aakkus.cloudkafkastream.configuration.GreetingsStream;
import com.aakkus.cloudkafkastream.model.Greetings;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GreetingsListener {

    @StreamListener(GreetingsStream.INPUT)
    public void handleGreetings(@Payload Greetings greetings) {
        log.info("Received greetings: {}", greetings);
    }
}