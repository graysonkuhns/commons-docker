package com.xellitix.commons.docker.action;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import java.util.HashSet;
import java.util.Set;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link AbstractDockerAction} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractDockerActionTest {

  // Fixtures
  private Set<Flag> flags;
  private AbstractDockerAction<Flag> command;

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

    // Create the docker action
    command = new AbstractDockerActionImpl(flags);
  }
}
