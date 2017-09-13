package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * {@link DockerCommand} builder.
 *
 * @param <T> The {@link DockerCommand} type.
 * @param <X> The {@link DockerCommandBuilder} type.
 *
 * @author Grayson Kuhns
 */
public interface DockerCommandBuilder<T extends DockerCommand, X extends DockerCommandBuilder> {

  /**
   * Sets the {@link DockerImage} of the {@link DockerCommand}.
   *
   * @param image The {@link DockerImage}.
   * @return The {@link DockerCommandBuilder}.
   */
  X withImage(DockerImage image);

  /**
   * Gets the {@link DockerImage} set in the {@link DockerCommandBuilder}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();

  /**
   * Builds the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  T build();
}
