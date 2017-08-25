package com.xellitix.commons.docker.registry;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.xellitix.commons.net.url.UrlModule;
import org.junit.Test;

/**
 * {@link DockerRegistryModule} test case.
 *
 * @author Grayson Kuhns
 */
public class DockerRegistryModuleTest {

  // Fixtures
  private final Injector injector = Guice.createInjector(
      new DockerRegistryModule(),
      new UrlModule());

  @Test
  public void getDockerRegistryFactoryTest() {
    injector.getInstance(DockerRegistryFactory.class);
  }
}
