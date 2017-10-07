package com.xellitix.commons.docker.command;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractDockerCommand} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractDockerCommandTest {

  // Fixtures
  private Set<Flag> flags;
  private AbstractDockerCommand<Flag> command;

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
        .isFlagSet(Flag.ONE))
        .isTrue();

    // Flag two is not set
    assertThat(command
        .isFlagSet(Flag.TWO))
        .isFalse();
  }

  @Before
  public void setUp() {
    // Create flags
    flags = new HashSet<>();
    flags.add(Flag.ONE);

    // Create the docker command
    command = new AbstractDockerCommandImpl(flags);
  }
}
