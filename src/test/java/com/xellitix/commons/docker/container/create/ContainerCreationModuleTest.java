package com.xellitix.commons.docker.container.create;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link ContainerCreationModule} test case.
 *
 * @author Grayson Kuhns
 */
public class ContainerCreationModuleTest {

  // Fixtures
  private Injector injector;

  @Test
  public void getContainerCreationActionFactoryTest() {
    injector.getInstance(ContainerCreationActionFactory.class);
  }

  @Before
  public void setUp() {
    injector = Guice.createInjector(new ContainerCreationModule());
  }
}
