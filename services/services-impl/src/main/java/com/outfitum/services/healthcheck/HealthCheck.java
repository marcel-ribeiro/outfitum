package com.outfitum.services.healthcheck;

import org.springframework.stereotype.Service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author marcel-serra.ribeiro on 18/07/2015.
 */
@Service
@Path("healthcheck")
public class HealthCheck {
  @GET
  @Produces(MediaType.TEXT_HTML)
  public String doesItWorks() {
    return "It works!";
  }
}