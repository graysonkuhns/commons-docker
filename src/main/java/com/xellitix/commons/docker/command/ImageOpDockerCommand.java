package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * {@link DockerCommand} that performs an operation on a {@link DockerImage}.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public interface ImageOpDockerCommand<F extends Enum> extends DockerCommand<F> {

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();
}
