package com.outfitum.services.healthcheck;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.runners.MockitoJUnitRunner;

import static org.fest.assertions.Assertions.assertThat;

/**
 * @author marcelribeiro on 2015-10-14.
 */
@RunWith(MockitoJUnitRunner.class)
public class HealthCheckTest {

    @InjectMocks
    private HealthCheck healthCheck;

    @Test
    public void shouldReturnItWorks(){
        assertThat(healthCheck.doesItWorks()).isEqualTo("It works!");
    }
}