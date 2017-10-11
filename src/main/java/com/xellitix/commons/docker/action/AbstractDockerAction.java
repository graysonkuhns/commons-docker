package com.xellitix.commons.docker.action;

import java.util.Set;

/**
 * Partial {@link DockerAction} implementation.
 *
 * @param <F> Flag type.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerAction<F extends Enum> implements DockerAction<F> {

  // Properties
  private final Set<F> flags;

  /**
   * Constructor.
   *
   * @param flags The flags.
   */
  public AbstractDockerAction(final Set<F> flags) {
    this.flags = flags;
  }

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  @Override
  public Set<F> getFlags() {
    return flags;
  }

  /**
   * Checks if a flag is set.
   *
   * @param flag The flag.
   * @return True if the flag is set.
   */
  @Override
  public boolean isFlagSet(final F flag) {
    return flags.contains(flag);
  }
}
