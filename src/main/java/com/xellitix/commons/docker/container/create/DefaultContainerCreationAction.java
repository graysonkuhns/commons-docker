package com.xellitix.commons.docker.container.create;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.action.AbstractDockerAction;
import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * Default {@link ContainerCreationAction} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultContainerCreationAction
    extends AbstractDockerAction<ContainerCreationFlag>
    implements ContainerCreationAction {

  // Properties
  private final DockerImage image;

  /**
   * Constructor.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   */
  @Inject
  DefaultContainerCreationAction(
      @Assisted final Set<ContainerCreationFlag> flags,
      @Assisted final DockerImage image) {

    super(flags);
    this.image = image;
  }

  /**
   * Gets the {@link DockerImage} to use when creation the container.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public DockerImage getImage() {
    return image;
  }
}
