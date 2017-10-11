package com.xellitix.commons.docker.container.create;

import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

/**
 * {@link ContainerCreationAction} Google Guice module.
 *
 * @author Grayson Kuhns
 */
public class ContainerCreationModule extends AbstractModule {

  /**
   * Configures the module.
   */
  @Override
  protected void configure() {
    install(new FactoryModuleBuilder()
      .implement(ContainerCreationAction.class, DefaultContainerCreationAction.class)
      .build(ContainerCreationActionFactory.class));
  }
}
