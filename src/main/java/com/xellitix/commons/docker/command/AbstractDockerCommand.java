package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * Default {@link DockerCommand} implementation.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerCommand implements DockerCommand {

  // Properties
  private final DockerImage image;

  /**
   * Constructor.
   *
   * @param image The {@link DockerImage}.
   */
  public AbstractDockerCommand(final DockerImage image) {
    this.image = image;
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
