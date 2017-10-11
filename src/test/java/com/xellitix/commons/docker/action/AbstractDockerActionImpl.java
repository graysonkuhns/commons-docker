package com.xellitix.commons.docker.action;

import java.util.Set;

/**
 * {@link AbstractDockerAction} implementation.
 *
 * <p>
 *   Used for testing only.
 * </p>
 *
 * @author Grayson Kuhns
 */
class AbstractDockerActionImpl extends AbstractDockerAction<Flag> {

  /**
   * Constructor.
   *
   * @param flags The action flags.
   */
  AbstractDockerActionImpl(final Set<Flag> flags) {
    super(flags);
  }
}
