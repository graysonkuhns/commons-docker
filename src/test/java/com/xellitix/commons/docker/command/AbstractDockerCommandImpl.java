package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.List;

/**
 * {@link AbstractDockerCommand} implementation.
 *
 * <p>
 *   Used for testing only.
 * </p>
 *
 * @author Grayson Kuhns
 */
class AbstractDockerCommandImpl extends AbstractDockerCommand<Flag> {

  AbstractDockerCommandImpl(final DockerImage image, final List<Flag> flags) {
    super(image, flags);
  }

  /**
   * Gets the {@link DockerCommandAction}.
   *
   * @return The {@link DockerCommandAction}.
   */
  @Override
  public DockerCommandAction getAction() {
    return null;
  }
}
