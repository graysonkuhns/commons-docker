package com.xellitix.commons.docker.action.run;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;
import com.xellitix.commons.docker.action.AbstractDockerAction;
import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * Default {@link DockerRunAction} implementation.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRunAction
    extends AbstractDockerAction<DockerRunCommandFlag>
    implements DockerRunAction {

  /**
   * Constructor.
   *
   * @param flags The flags.
   * @param image The {@link DockerImage} to run.
   */
  @Inject
  DefaultDockerRunAction(
      @Assisted final Set<DockerRunCommandFlag> flags,
      @Assisted final DockerImage image) {

    super(flags);
  }
}
