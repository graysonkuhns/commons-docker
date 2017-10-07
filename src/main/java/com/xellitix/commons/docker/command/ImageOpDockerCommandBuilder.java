package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

public interface ImageOpDockerCommandBuilder<F extends Enum, C extends DockerCommand<F>, B extends DockerCommandBuilder>
    extends DockerCommandBuilder<F, C, B> {

  /**
   * Sets the {@link DockerImage}.
   *
   * @param image The {@link DockerImage}.
   * @return The {@link DockerCommandBuilder}.
   */
  B withImage(DockerImage image);

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();
}
