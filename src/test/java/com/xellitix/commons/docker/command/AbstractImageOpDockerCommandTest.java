package com.xellitix.commons.docker.command;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableSet;
import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractImageOpDockerCommand} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractImageOpDockerCommandTest {

  // Fixtures
  private DockerImage image;
  private AbstractImageOpDockerCommandImpl command;

  @Test
  public void getImageTest() {
    assertThat(command
        .getImage())
        .isNotNull()
        .isEqualTo(image);
  }

  @Before
  public void setUp() {
    // Docker image mocking
    image = mock(DockerImage.class);

    // Create the Docker command
    command = new AbstractImageOpDockerCommandImpl(image, ImmutableSet.of());
  }
}
