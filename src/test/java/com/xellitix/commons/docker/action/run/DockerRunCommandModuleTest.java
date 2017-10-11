package com.xellitix.commons.docker.action.run;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DockerRunCommandModule} test case.
 *
 * @author Grayson Kuhns
 */
public class DockerRunCommandModuleTest {

  // Fixtures
  private Injector injector;

  @Test
  public void getDockerRunCommandFactoryTest() {
    injector.getInstance(DockerRunCommandFactory.class);
  }

  @Before
  public void setUp() {
    injector = Guice.createInjector(new DockerRunCommandModule());
  }
}
