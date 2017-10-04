package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.List;

/**
 * Default {@link DockerCommand} implementation.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerCommand<F extends Enum> implements DockerCommand<F> {

  // Properties
  private final DockerImage image;
  private final List<F> flags;

  /**
   * Constructor.
   *
   * @param image The {@link DockerImage}.
   */
  public AbstractDockerCommand(final DockerImage image, final List<F> flags) {
    this.image = image;
    this.flags = flags;
  }

  /**
   * Gets a {@link List} of set flags.
   *
   * @return A {@link List} of set flags.
   */
  @Override
  public List<F> getFlags() {
    return flags;
  }

  /**
   * Checks if a flag is set.
   *
   * @param flag The flag.
   * @return True if the flag is set.
   */
  @Override
  public boolean isFlagSet(final F flag) {
    return flags.contains(flag);
  }

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public DockerImage getImage() {
    return image;
  }
}
