package com.xellitix.commons.docker.image;

import com.xellitix.commons.docker.repository.DockerRepository;
import java.io.Serializable;

/**
 * Docker image model.
 *
 * @author Grayson Kuhns
 */
public interface DockerImage extends Serializable {

  /**
   * Gets the {@link DockerRepository} the {@link DockerImage} exists in.
   *
   * @return The {@link DockerRepository} the {@link DockerImage} exists in.
   */
  DockerRepository getRepository();

  /**
   * Gets the tag.
   *
   * @return The tag.
   */
  String getTag();
}
