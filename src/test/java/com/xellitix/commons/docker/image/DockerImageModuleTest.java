package com.xellitix.commons.docker.image;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Test;

/**
 * {@link DockerImageModule} test case.
 *
 * @author Grayson Kuhns
 */
public class DockerImageModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(new DockerImageModule());

  @Test
  public void getDockerImageFactoryTest() {
    injector.getInstance(DockerImageFactory.class);
  }
}
