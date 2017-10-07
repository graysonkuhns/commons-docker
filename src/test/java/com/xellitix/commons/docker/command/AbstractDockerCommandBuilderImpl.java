package com.xellitix.commons.docker.command;

/**
 * {@link AbstractDockerCommandBuilder} implementation.
 *
 * <p>
 *   Used for testing only.
 * </p>
 *
 * @author Grayson Kuhns
 */
class AbstractDockerCommandBuilderImpl
    extends AbstractDockerCommandBuilder<Flag, AbstractDockerCommandImpl, AbstractDockerCommandBuilderImpl> {

  /**
   * Constructor.
   */
  AbstractDockerCommandBuilderImpl() {
    super(AbstractDockerCommandBuilderImpl.class);
  }

  /**
   * Builds the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  @Override
  public AbstractDockerCommandImpl build() {
    return null;
  }
}
