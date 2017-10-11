package com.xellitix.commons.docker.container.create;

import com.xellitix.commons.docker.action.DockerAction;
import com.xellitix.commons.docker.image.DockerImage;

/**
 * Docker run action.
 *
 * @author Grayson Kuhns
 */
public interface ContainerCreationAction extends DockerAction<ContainerCreationFlag> {

  /**
   * Gets the {@link DockerImage} to use when creation the container.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();
}
