package com.xellitix.commons.docker.registry;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * {@link DockerRegistry} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerRegistryFactory {

  /**
   * Creates a {@link DockerRegistry}.
   *
   * @param endpoint The endpoint {@link URL}.
   * @return The {@link DockerRegistry}
   */
  DockerRegistry create(URL endpoint);

  /**
   * Creates a {@link DockerRegistry}.
   *
   * @param endpoint The endpoint {@link URL}.
   * @return The {@link DockerRegistry}
   * @throws MalformedURLException If the endpoint {@link URL} is malformed.
   */
  DockerRegistry create(String endpoint) throws MalformedURLException;
}
