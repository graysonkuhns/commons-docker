package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

/**
 * Docker command model.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public interface DockerCommand<F extends Enum> extends Serializable {

  /**
   * Gets the {@link DockerCommandAction}.
   *
   * @return The {@link DockerCommandAction}.
   */
  DockerCommandAction getAction();

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  Set<F> getFlags();

  /**
   * Checks if a flag is set.
   *
   * @param flag The flag.
   * @return True if the flag is set.
   */
  boolean isFlagSet(F flag);
}
