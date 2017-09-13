package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.io.Serializable;

/**
 * Docker command model.
 *
 * @author Grayson Kuhns
 */
public interface DockerCommand extends Serializable {

  /**
   * Gets the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  DockerCommandAction getAction();

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();
}
