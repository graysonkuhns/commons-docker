package com.xellitix.commons.docker.container.create;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * {@link ContainerCreationAction} factory.
 *
 * @author Grayson Kuhns
 */
public interface ContainerCreationActionFactory {

  /**
   * Creates a {@link ContainerCreationAction}.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   * @return The {@link ContainerCreationAction}.
   */
  ContainerCreationAction create(Set<ContainerCreationFlag> flags, DockerImage image);
}
