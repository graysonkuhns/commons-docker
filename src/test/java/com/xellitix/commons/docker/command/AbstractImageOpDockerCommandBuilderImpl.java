package com.xellitix.commons.docker.command;

public class AbstractImageOpDockerCommandBuilderImpl
    extends AbstractImageOpDockerCommandBuilder<Flag, AbstractDockerCommandImpl, AbstractImageOpDockerCommandBuilderImpl> {

  /**
   * Constructor.
   */
  public AbstractImageOpDockerCommandBuilderImpl() {
    super(AbstractImageOpDockerCommandBuilderImpl.class);
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
