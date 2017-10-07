package com.xellitix.commons.docker.command;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractImageOpDockerCommandBuilder} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractImageOpDockerCommandBuilderTest {

  // Fixtures
  private DockerImage image;
  private AbstractImageOpDockerCommandBuilderImpl commandBuilder;

  @Test
  public void imageRoundTripTest() {
    // Set the image
    assertThat(commandBuilder
        .withImage(image))
        .isNotNull()
        .isEqualTo(commandBuilder);

    // Get the image
    assertThat(commandBuilder
        .getImage())
        .isNotNull()
        .isEqualTo(image);
  }

  @Before
  public void setUp() {
    // Docker image mocking
    image = mock(DockerImage.class);

    // Create the command builder
    commandBuilder = new AbstractImageOpDockerCommandBuilderImpl();
  }
}
