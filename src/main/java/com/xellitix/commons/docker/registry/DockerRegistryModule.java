package com.xellitix.commons.docker.registry;

import com.google.inject.AbstractModule;

/**
 * {@link DockerRegistry} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class DockerRegistryModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    bind(DockerRegistryFactory.class).to(DefaultDockerRegistryFactory.class);
  }
}
