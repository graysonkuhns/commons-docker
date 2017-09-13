package com.xellitix.commons.docker.command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.docker.image.DockerImage;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractDockerCommand} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractDockerCommandTest {

  // Fixtures
  private DockerImage image;
  private AbstractDockerCommand command;

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

    // Create the docker command
    command = new AbstractDockerCommandImpl(image);
  }

  /**
   * Complete {@link AbstractDockerCommand} implementation used for testing.
   *
   * @author Grayson Kuhns
   */
  static class AbstractDockerCommandImpl extends AbstractDockerCommand {

    /**
     * Constructor.
     *
     * @param image The {@link DockerImage}.
     */
    AbstractDockerCommandImpl(final DockerImage image) {
      super(image);
    }

    /**
     * Gets the {@link DockerCommand}.
     *
     * @return The {@link DockerCommand}.
     */
    @Override
    public DockerCommandAction getAction() {
      return null;
    }
  }
}
