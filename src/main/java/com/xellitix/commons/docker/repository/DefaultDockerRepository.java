package com.xellitix.commons.docker.repository;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.registry.DockerRegistry;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Default {@link DockerRepository} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRepository implements DockerRepository {

  // Properties
  private final String name;
  private final DockerRegistry registry;

  /**
   * Constructor.
   *
   * @param name The name.
   * @param registry The {@link DockerRegistry}.
   */
  @Inject
  DefaultDockerRepository(
      @Assisted final String name,
      @Assisted @Nullable final DockerRegistry registry) {

    this.name = name;
    this.registry = registry;
  }

  /**
   * Gets the name.
   *
   * @return The name.
   */
  @Override
  public String getName() {
    return name;
  }

  /**
   * Gets the {@link DockerRegistry}.
   *
   * @return The {@link DockerRegistry}.
   */
  @Override
  public Optional<DockerRegistry> getRegistry() {
    return Optional.ofNullable(registry);
  }
}
