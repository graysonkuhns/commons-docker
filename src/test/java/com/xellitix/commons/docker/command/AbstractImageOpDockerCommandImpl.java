package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.List;
import java.util.Set;

/**
 * {@link AbstractImageOpDockerCommand} implementation.
 *
 * <p>
 *   Used for testing only.
 * </p>
 *
 * @author Grayson Kuhns
 */
public class AbstractImageOpDockerCommandImpl extends AbstractImageOpDockerCommand<Flag> {

  /**
   * Constructor.
   *
   * @param image The {@link DockerImage}.
   * @param flags The command flags.
   */
  public AbstractImageOpDockerCommandImpl(final DockerImage image, final Set<Flag> flags) {
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
