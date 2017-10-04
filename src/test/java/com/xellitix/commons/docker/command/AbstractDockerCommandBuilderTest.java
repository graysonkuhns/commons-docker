package com.xellitix.commons.docker.command;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractDockerCommandBuilder} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractDockerCommandBuilderTest {

  // Fixtures
  private DockerImage dockerImage;
  private AbstractDockerCommandBuilderImpl commandBuilder;

  @Test
  public void dockerImageRoundTripTest() {
    // Command builder should return itself
    assertThat(commandBuilder
        .withImage(dockerImage))
        .isNotNull()
        .isEqualTo(commandBuilder);

    // Validate that image was stored
    assertThat(commandBuilder
        .getImage())
        .isNotNull()
        .isEqualTo(dockerImage);
  }

  @Before
  public void setUp() {
    // Docker image mocking
    dockerImage = mock(DockerImage.class);

    // Create the command builder
    commandBuilder = new AbstractDockerCommandBuilderImpl();
  }
}
