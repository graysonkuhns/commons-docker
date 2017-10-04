package com.xellitix.commons.docker.command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
  private List<Flag> flags;
  private AbstractDockerCommandImpl command;

  @Test
  public void getImageTest() {
    assertThat(command
        .getImage())
        .isNotNull()
        .isEqualTo(image);
  }

  @Test
  public void getFlagsTest() {
    assertThat(command
        .getFlags())
        .isNotNull()
        .isEqualTo(flags);
  }

  @Test
  public void isFlagSetTest() {
    // Flag one is set
    assertThat(command
        .isFlagSet(Flag.FLAG_ONE))
        .isTrue();

    // Flag two is not set
    assertThat(command
        .isFlagSet(Flag.FLAG_TWO))
        .isFalse();
  }

  @Before
  public void setUp() {
    // Docker image mocking
    image = mock(DockerImage.class);

    // Create flags
    flags = new ArrayList<>();
    flags.add(Flag.FLAG_ONE);

    // Create the docker command
    command = new AbstractDockerCommandImpl(image, flags);
  }

  // Test data types
  enum Flag {
    FLAG_ONE,
    FLAG_TWO
  }

  static private class AbstractDockerCommandImpl extends AbstractDockerCommand<Flag> {
    AbstractDockerCommandImpl(final DockerImage image, final List<Flag> flags) {
      super(image, flags);
    }

    @Override
    public DockerCommandAction getAction() {
      return null;
    }
  }
}
