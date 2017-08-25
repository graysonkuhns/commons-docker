package com.xellitix.commons.docker.image;

import com.xellitix.commons.docker.repository.DockerRepository;

/**
 * {@link DockerImage} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerImageFactory {

  /**
   * Creates a {@link DockerImage}.
   *
   * @param repository The {@link DockerRepository} the {@link DockerImage} exists in.
   * @param tag The tag.
   * @return The {@link DockerImage}.
   */
  DockerImage create(DockerRepository repository, String tag);
}
