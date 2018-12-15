package com.aakkus.cloudkafkastream.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
public class Greetings {
    private Long timestamp;
    private String message;
}