package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * Partial {@link ImageOpDockerCommandBuilder} implementation.
 *
 * @param <F> The {@link DockerCommand} flag type.
 * @param <C> The {@link DockerCommand} type.
 * @param <B> The {@link DockerCommandBuilder} type.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractImageOpDockerCommandBuilder<
    F extends Enum,
    C extends DockerCommand<F>,
    B extends AbstractImageOpDockerCommandBuilder>
    extends AbstractDockerCommandBuilder<F, C, B>
    implements ImageOpDockerCommandBuilder<F, C, B> {

  // Properties
  private DockerImage image;

  /**
   * Constructor.
   *
   * @param clazz The {@link DockerCommandBuilder} {@link Class}.
   */
  public AbstractImageOpDockerCommandBuilder(final Class<B> clazz) {
    super(clazz);
  }

  /**
   * Sets the {@link DockerImage}.
   *
   * @param image The {@link DockerImage}.
   * @return The {@link DockerCommandBuilder}.
   */
  @Override
  public B withImage(final DockerImage image) {
    this.image = image;

    // Enable method chaining
    return getBuilder();
  }

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public DockerImage getImage() {
    return image;
  }
}
