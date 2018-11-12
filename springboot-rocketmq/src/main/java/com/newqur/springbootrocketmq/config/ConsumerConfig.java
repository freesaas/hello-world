package com.newqur.springbootrocketmq.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * charles-desktop
 */
@Setter
@Getter
@ToString
@ConfigurationProperties(prefix = "rocketmq.consumer")
@Configuration
public class ConsumerConfig {

    private String groupName;

    private String namesrvAddr;

}
