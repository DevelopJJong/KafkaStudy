package com.kafkastudy.infra.kafka;

import com.kafkastudy.standard.event.HaveEventName;

public record MyEvent(String msg) implements HaveEventName {
}
