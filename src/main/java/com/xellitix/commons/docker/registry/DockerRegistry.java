package com.xellitix.commons.docker.registry;

import java.io.Serializable;
import java.net.URL;

/**
 * Docker registry model.
 *
 * @author Grayson Kuhns
 */
public interface DockerRegistry extends Serializable {

  /**
   * Gets the endpoint.
   *
   * @return The endpoint.
   */
  URL getEndpoint();

  /**
   * Gets the hostname.
   *
   * @return The hostname.
   */
  String getHostname();
}
