package com.xellitix.commons.docker.command;

import static org.mockito.Mockito.mock;
import static org.assertj.core.api.Assertions.assertThat;

import com.google.common.collect.ImmutableSet;
import com.xellitix.commons.docker.command.run.DockerRunCommand;
import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * {@link AbstractDockerCommandBuilder} test case.
 *
 * @author Grayson Kuhns
 */
public class AbstractDockerCommandBuilderTest {

  // Constants
  private static final String WRONG_CLAZZ_MSG = "Expected the DockerCommandBuilder implementation " +
      "(com.xellitix.commons.docker.command.AbstractDockerCommandBuilderTest$1) to be an instance " +
      "of com.xellitix.commons.docker.command.AbstractDockerCommandBuilderImpl";

  // Rules
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // Fixtures
  private AbstractDockerCommandBuilderImpl commandBuilder;

  @Test
  public void flagsRoundTripTest() {
    // No flags should be set
    assertThat(commandBuilder
        .getFlags())
        .isNotNull()
        .isEmpty();

    // Set flags ONE and TWO
    assertThat(commandBuilder
        .setFlags(ImmutableSet.of(Flag.ONE, Flag.TWO)))
        .isNotNull()
        .isEqualTo(commandBuilder);

    // Flags ONE and TWO should be set
    assertThat(commandBuilder
        .getFlags())
        .isNotNull()
        .isNotEmpty()
        .contains(Flag.ONE, Flag.TWO);

    // Set flag THREE
    assertThat(commandBuilder
        .setFlag(Flag.THREE))
        .isNotNull()
        .isEqualTo(commandBuilder);

    // Flags ONE, TWO, and THREE should be set
    assertThat(commandBuilder
        .getFlags())
        .isNotNull()
        .isNotEmpty()
        .contains(Flag.ONE, Flag.TWO, Flag.THREE);

    // Clear the flags
    assertThat(commandBuilder
        .clearFlags())
        .isNotNull()
        .isEqualTo(commandBuilder);

    // No flags should be set
    assertThat(commandBuilder
        .getFlags())
        .isNotNull()
        .isEmpty();
  }

  @Test
  public void invalidClazzCausesIllegalArgumentExceptionTest() {
    // Create a new AbstractDockerCommandBuilder implementation
    AbstractDockerCommandBuilder commandBuilder = new AbstractDockerCommandBuilder
        <Enum, DockerCommand<Enum>, AbstractDockerCommandBuilderImpl>(AbstractDockerCommandBuilderImpl.class) {

      @Override
      public DockerCommand<Enum> build() {
        return null;
      }
    };

    // Describe the exception to expect
    thrown.expect(IllegalArgumentException.class);
    thrown.expectMessage(WRONG_CLAZZ_MSG);

    // Attempt an operation that returns an instance of the command builder
    commandBuilder.clearFlags();
  }

  @Before
  public void setUp() {
    // Create the command builder
    commandBuilder = new AbstractDockerCommandBuilderImpl();
  }
}
