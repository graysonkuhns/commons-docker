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
   * @param flags The command flags.
   * @param image The {@link DockerImage}.
   */
  public AbstractImageOpDockerCommandImpl(final Set<Flag> flags, final DockerImage image) {
    super(flags, image);
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
