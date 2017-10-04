package com.xellitix.commons.docker.command.run;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.command.AbstractDockerCommand;
import com.xellitix.commons.docker.command.DockerCommand;
import com.xellitix.commons.docker.command.DockerCommandAction;
import com.xellitix.commons.docker.image.DockerImage;

/**
 * Default {@link DockerRunCommand} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunCommand
    extends AbstractDockerCommand
    implements DockerRunCommand {

  /**
   * Constructor.
   *
   * @param image The {@link DockerImage}.
   */
  @Inject
  DefaultDockerRunCommand(@Assisted final DockerImage image) {
    super(image, null);
  }

  /**
   * Gets the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  @Override
  public DockerCommandAction getAction() {
    return DockerCommandAction.RUN;
  }
}
