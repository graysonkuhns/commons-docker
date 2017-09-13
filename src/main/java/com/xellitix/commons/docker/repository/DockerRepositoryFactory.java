package com.xellitix.commons.docker.repository;

import com.xellitix.commons.docker.registry.DockerRegistry;
import javax.annotation.Nullable;

/**
 * {@link DockerRepository} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerRepositoryFactory {

  /**
   * Creates a {@link DockerRepository}.
   *
   * @param name The name.
   * @param registry The {@link DockerRegistry}.
   * @return The {@link DockerRepository}.
   */
  DockerRepository create(String name, @Nullable DockerRegistry registry);
}
