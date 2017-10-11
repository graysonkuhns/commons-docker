package com.xellitix.commons.docker.action.run;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link DockerRunAction} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class DockerRunCommandModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    install(new FactoryModuleBuilder()
      .implement(DockerRunAction.class, DefaultDockerRunAction.class)
      .build(DockerRunCommandFactory.class));
  }
}
