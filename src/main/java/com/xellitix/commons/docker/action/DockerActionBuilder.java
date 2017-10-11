package com.xellitix.commons.docker.action;

import java.util.Set;

/**
 * {@link DockerAction} builder.
 *
 * @param <F> The {@link DockerAction} flag type.
 * @param <C> The {@link DockerAction} type.
 * @param <B> The {@link DockerActionBuilder} type.
 *
 * @author Grayson Kuhns
 */
public interface DockerActionBuilder<F extends Enum, C extends DockerAction<F>, B extends DockerActionBuilder> {

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   * @return The {@link DockerActionBuilder}.
   */
  B setFlag(F flag);

  /**
   * Sets the flags.
   *
   * @param flags The flags.
   * @return The {@link DockerActionBuilder}.
   */
  B setFlags(Set<F> flags);

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  Set<F> getFlags();

  /**
   * Clears the flags.
   *
   * @return The {@link DockerActionBuilder}.
   */
  B clearFlags();

  /**
   * Builds the {@link DockerAction}.
   *
   * @return The {@link DockerAction}.
   */
  C build();
}
