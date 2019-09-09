package com.stackroute.config;

import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class KafkaConfig {

    @Bean
    public ConsumerFactory<String, DAOUser> consumerFactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
        config.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
        config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
        return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),new JsonDeserializer<>(DAOUser.class));
    }
    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, DAOUser> kafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, DAOUser> factory = new ConcurrentKafkaListenerContainerFactory();
        factory.setConsumerFactory(consumerFactory());
        return factory;
    }
}
