package com.xellitix.commons.docker.action.run;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * {@link DockerRunAction} factory.
 *
 * @author Grayson Kuhns
 */
public interface DockerRunCommandFactory {

  /**
   * Creates a {@link DockerRunAction}.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   * @return The {@link DockerRunAction}.
   */
  DockerRunAction create(Set<DockerRunCommandFlag> flags, DockerImage image);
}
