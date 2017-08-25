package com.xellitix.commons.docker.image;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.repository.DockerRepository;

/**
 * Default {@link DockerImage} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerImage implements DockerImage {

  // Properties
  private final DockerRepository repository;
  private final String tag;

  /**
   * Constructor.
   *
   * @param repository The {@link DockerRepository} the {@link DockerImage} exists in.
   * @param tag The tag.
   */
  @Inject
  DefaultDockerImage(
      @Assisted final DockerRepository repository,
      @Assisted final String tag) {

    this.repository = repository;
    this.tag = tag;
  }

  /**
   * Gets the {@link DockerRepository} the {@link DockerImage} exists in.
   *
   * @return The {@link DockerRepository} the {@link DockerImage} exists in.
   */
  @Override
  public DockerRepository getRepository() {
    return repository;
  }

  /**
   * Gets the tag.
   *
   * @return The tag.
   */
  @Override
  public String getTag() {
    return tag;
  }
}
