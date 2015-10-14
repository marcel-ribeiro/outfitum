package com.outfitum.config;

import com.outfitum.services.healthcheck.config.HealthCheckConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author marcel-serra.ribeiro on 18/07/2015.
 */
@Configuration
@Import({HealthCheckConfig.class})
public class ServicesConfig {
}
