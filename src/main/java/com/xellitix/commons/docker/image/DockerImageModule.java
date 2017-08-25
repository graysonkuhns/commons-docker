package com.xellitix.commons.docker.image;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link DockerImage} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class DockerImageModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    install(new FactoryModuleBuilder()
        .implement(DockerImage.class, DefaultDockerImage.class)
        .build(DockerImageFactory.class));
  }
}
