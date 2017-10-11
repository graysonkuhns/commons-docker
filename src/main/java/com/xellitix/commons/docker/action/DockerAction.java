package com.xellitix.commons.docker.action;

import java.io.Serializable;
import java.util.Set;

/**
 * Docker action model.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public interface DockerAction<F extends Enum> extends Serializable {

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
