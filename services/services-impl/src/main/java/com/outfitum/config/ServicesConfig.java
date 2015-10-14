package com.outfitum.config;

import com.outfitum.services.healthcheck.HealthCheck;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author marcel-serra.ribeiro on 18/07/2015.
 */
@Configuration
@Import({ HealthCheck.class})
public class ServicesConfig {
}
