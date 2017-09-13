package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * Abstract {@link DockerCommandBuilder} implementation.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerCommandBuilder<T extends DockerCommand, X extends AbstractDockerCommandBuilder>
    implements DockerCommandBuilder<T, X> {

  // Properties
  private DockerImage image = null;

  /**
   * Sets the {@link DockerImage} of the {@link T}.
   *
   * @param image The {@link DockerImage}.
   * @return The {@link X}.
   */
  @Override
  public synchronized X withImage(final DockerImage image) {
    this.image = image;
    return (X) this;
  }

  /**
   * Gets the {@link DockerImage} set in the {@link X}.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public synchronized DockerImage getImage() {
    return image;
  }
}
