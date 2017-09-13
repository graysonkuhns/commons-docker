package com.xellitix.commons.docker.command.run;

import com.xellitix.commons.docker.image.DockerImage;

/**
 * {@link DockerRunCommand} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerRunCommandFactory {

  /**
   * Creates a {@link DockerRunCommand}.
   *
   * @param image The {@link DockerImage} to run.
   * @return The {@link DockerRunCommand}.
   */
  DockerRunCommand create(DockerImage image);
}
