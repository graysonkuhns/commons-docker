package com.xellitix.commons.docker.command.run;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.google.common.collect.ImmutableSet;
import com.xellitix.commons.docker.command.DockerCommandAction;
import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultDockerRunCommand} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunCommandTest {

  // Fixtures
  private DockerRunCommand runCommand;

  @Test
  public void getActionTest() {
    assertThat(runCommand
        .getAction())
        .isNotNull()
        .isEqualTo(DockerCommandAction.RUN);
  }

  @Before
  public void setUp() {
    // Image mocking
    DockerImage image = mock(DockerImage.class);

    // Create the run command
    runCommand = new DefaultDockerRunCommand(ImmutableSet.of(), image);
  }
}
