package com.xellitix.commons.docker.container.create;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.google.common.collect.ImmutableSet;
import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultContainerCreationAction} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunCommandTest {

  // Fixtures
  private DockerImage image;
  private ContainerCreationAction runCommand;

  @Test
  public void getImageTest() {
    assertThat(runCommand
        .getImage())
        .isNotNull()
        .isEqualTo(image);
  }

  @Before
  public void setUp() {
    // Image mocking
    image = mock(DockerImage.class);

    // Create the run action
    runCommand = new DefaultContainerCreationAction(ImmutableSet.of(), image);
  }
}
