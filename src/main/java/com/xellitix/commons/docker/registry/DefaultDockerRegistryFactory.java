package com.xellitix.commons.docker.registry;

import com.xellitix.commons.net.url.UrlFactory;
import java.net.MalformedURLException;
import java.net.URL;
import javax.inject.Inject;

/**
 * Default {@link DockerRegistryFactory} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRegistryFactory implements DockerRegistryFactory {

  // Dependencies
  private final UrlFactory urlFactory;

  /**
   * Constructor.
   *
   * @param urlFactory The {@link UrlFactory}.
   */
  @Inject
  DefaultDockerRegistryFactory(final UrlFactory urlFactory) {
    this.urlFactory = urlFactory;
  }

  /**
   * Creates a {@link DockerRegistry}.
   *
   * @param endpoint The endpoint {@link URL}.
   * @return The {@link DockerRegistry}
   */
  @Override
  public DockerRegistry create(final URL endpoint) {
    return new DefaultDockerRegistry(endpoint);
  }

  /**
   * Creates a {@link DockerRegistry}.
   *
   * @param endpoint The endpoint {@link URL}.
   * @return The {@link DockerRegistry}
   * @throws MalformedURLException If the endpoint {@link URL} is malformed.
   */
  @Override
  public DockerRegistry create(final String endpoint) throws MalformedURLException {
    return new DefaultDockerRegistry(urlFactory.create(endpoint));
  }
}
