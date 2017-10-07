package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.List;
import java.util.Set;

/**
 * Partial {@link ImageOpDockerCommand} implementation.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractImageOpDockerCommand<F extends Enum>
    extends AbstractDockerCommand<F>
    implements ImageOpDockerCommand<F> {

  // Properties
  private final DockerImage image;

  /**
   * Constructor.
   *
   * @param image The {@link DockerImage}.
   * @param flags The flags.
   */
  public AbstractImageOpDockerCommand(final DockerImage image, final Set<F> flags) {
    super(flags);
    this.image = image;
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
