package com.xellitix.commons.docker.command.run;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link DockerRunCommand} Google Guice module.
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
      .implement(DockerRunCommand.class, DefaultDockerRunCommand.class)
      .build(DockerRunCommandFactory.class));
  }
}
