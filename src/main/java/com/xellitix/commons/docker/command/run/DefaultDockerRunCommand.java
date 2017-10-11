package com.xellitix.commons.docker.command.run;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.command.AbstractDockerCommand;
import com.xellitix.commons.docker.command.AbstractImageOpDockerCommand;
import com.xellitix.commons.docker.command.DockerCommand;
import com.xellitix.commons.docker.command.DockerCommandAction;
import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * Default {@link DockerRunCommand} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunCommand
    extends AbstractImageOpDockerCommand<DockerRunCommandFlag>
    implements DockerRunCommand {

  /**
   * Constructor.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   */
  @Inject
  DefaultDockerRunCommand(
      @Assisted final Set<DockerRunCommandFlag> flags,
      @Assisted final DockerImage image) {

    super(flags, image);
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
