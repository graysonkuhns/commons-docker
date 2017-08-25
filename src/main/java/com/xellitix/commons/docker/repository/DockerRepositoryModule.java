package com.xellitix.commons.docker.repository;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link DockerRepository} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class DockerRepositoryModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    install(new FactoryModuleBuilder()
        .implement(DockerRepository.class, DefaultDockerRepository.class)
        .build(DockerRepositoryFactory.class));
  }
}
