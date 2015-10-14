package config;

import com.outfitum.services.healthcheck.HealthCheck;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import services.RestServicesPath;

import javax.ws.rs.ApplicationPath;
import java.util.HashSet;
import java.util.Set;

/**
 * @author marcel-serra.ribeiro on 18/07/2015.
 */
@ApplicationPath(RestServicesPath.ROOT_REST_API)
public class RestConfig extends ResourceConfig {

  private Logger logger = LoggerFactory.getLogger(RestConfig.class);

  public RestConfig() {
    Set<Class<?>> services = new HashSet<>();
    services.add(HealthCheck.class);
//    services.add(SynonymsServiceImpl.class);

    logger.info("Registering the following services: {}", services);

    registerClasses(services);
  }
}