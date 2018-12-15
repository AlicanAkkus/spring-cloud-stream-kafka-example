package com.aakkus.cloudkafkastream.configuration;

import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStream.class)
public class GreetingsStreamConfig {
}