package com.xellitix.commons.docker.action;

/**
 * {@link AbstractDockerActionBuilder} implementation.
 *
 * <p>
 *   Used for testing only.
 * </p>
 *
 * @author Grayson Kuhns
 */
class AbstractDockerActionBuilderImpl
    extends AbstractDockerActionBuilder<Flag, AbstractDockerActionImpl, AbstractDockerActionBuilderImpl> {

  /**
   * Constructor.
   */
  AbstractDockerActionBuilderImpl() {
    super(AbstractDockerActionBuilderImpl.class);
  }

  /**
   * Builds the {@link DockerAction}.
   *
   * @return The {@link DockerAction}.
   */
  @Override
  public AbstractDockerActionImpl build() {
    return null;
  }
}
