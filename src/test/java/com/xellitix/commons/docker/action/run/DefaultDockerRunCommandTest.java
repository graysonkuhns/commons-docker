package com.xellitix.commons.docker.action.run;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.google.common.collect.ImmutableSet;
import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultDockerRunAction} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunCommandTest {

  // Fixtures
  private DockerRunAction runCommand;

  @Before
  public void setUp() {
    // Image mocking
    DockerImage image = mock(DockerImage.class);

    // Create the run action
    runCommand = new DefaultDockerRunAction(ImmutableSet.of(), image);
  }
}
