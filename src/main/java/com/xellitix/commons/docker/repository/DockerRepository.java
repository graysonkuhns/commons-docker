package com.xellitix.commons.docker.repository;

import com.xellitix.commons.docker.registry.DockerRegistry;
import java.io.Serializable;
import java.util.Optional;

/**
 * Docker repository model.
 *
 * @author Grayson Kuhns
 */
public interface DockerRepository extends Serializable {

  /**
   * Gets the name.
   *
   * @return The name.
   */
  String getName();

  /**
   * Gets the {@link DockerRegistry}.
   *
   * @return The {@link DockerRegistry}.
   */
  Optional<DockerRegistry> getRegistry();
}
