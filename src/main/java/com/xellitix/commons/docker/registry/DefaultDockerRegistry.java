package com.xellitix.commons.docker.registry;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import java.net.URL;

/**
 * Default {@link DockerRegistry} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRegistry implements DockerRegistry {

  // Properties
  private final URL endpoint;

  /**
   * Constructor.
   *
   * @param endpoint The endpoint.
   */
  @Inject
  DefaultDockerRegistry(@Assisted final URL endpoint) {
    this.endpoint = endpoint;
  }

  /**
   * Gets the endpoint.
   *
   * @return The endpoint.
   */
  @Override
  public URL getEndpoint() {
    return endpoint;
  }

  /**
   * Gets the hostname.
   *
   * @return The hostname.
   */
  @Override
  public String getHostname() {
    return endpoint.getHost();
  }
}
