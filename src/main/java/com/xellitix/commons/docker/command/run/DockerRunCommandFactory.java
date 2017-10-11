package com.xellitix.commons.docker.command.run;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * {@link DockerRunCommand} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerRunCommandFactory {

  /**
   * Creates a {@link DockerRunCommand}.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   * @return The {@link DockerRunCommand}.
   */
  DockerRunCommand create(Set<DockerRunCommandFlag> flags, DockerImage image);
}
