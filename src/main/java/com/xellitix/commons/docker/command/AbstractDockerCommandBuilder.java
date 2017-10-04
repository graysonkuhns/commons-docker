package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract {@link DockerCommandBuilder} implementation.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerCommandBuilder<F extends Enum, C extends DockerCommand<F>, B extends AbstractDockerCommandBuilder<F, C, B>>
    implements DockerCommandBuilder<F,C, B> {

  // Properties
  private Set<F> flags;
  private DockerImage image = null;

  /**
   * Constructor.
   */
  public AbstractDockerCommandBuilder() {
    flags = new HashSet<>();
    image = null;
  }

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   */
  @Override
  public synchronized void setFlag(final F flag) {
    flags.add(flag);
  }

  /**
   * Sets the flags.
   *
   * @param flags The flags.
   */
  @Override
  public synchronized void setFlags(final Set<F> flags) {
    this.flags = flags;
  }

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  @Override
  public synchronized Set<F> getFlags() {
    return flags;
  }

  /**
   * Clears the flags.
   */
  @Override
  public synchronized void clearFlags() {
    flags.clear();
  }

  /**
   * Sets the {@link DockerImage}.
   *
   * @param image The {@link DockerImage}.
   * @return The builder.
   */
  @Override
  public synchronized B withImage(final DockerImage image) {
    this.image = image;
    return (B) this;
  }

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public synchronized DockerImage getImage() {
    return image;
  }
}
