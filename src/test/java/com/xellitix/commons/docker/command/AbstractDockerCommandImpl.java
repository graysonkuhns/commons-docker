package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.List;
import java.util.Set;

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

  /**
   * Constructor.
   *
   * @param flags The command flags.
   */
  AbstractDockerCommandImpl(final Set<Flag> flags) {
    super(flags);
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
