package com.xellitix.commons.docker.repository;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link DockerRepositoryModule} test case.
 *
 * @author Grayson Kuhns
 */
public class DockerRepositoryModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new DockerRepositoryModule());

  @Test
  public void getDockerRepositoryFactoryTest() {
    injector.getInstance(DockerRepositoryFactory.class);
  }
}
