package com.xellitix.commons.docker.command;

import java.util.Set;

/**
 * {@link DockerCommand} builder.
 *
 * @param <F> The {@link DockerCommand} flag type.
 * @param <C> The {@link DockerCommand} type.
 * @param <B> The {@link DockerCommandBuilder} type.
 *
 * @author Grayson Kuhns
 */
public interface DockerCommandBuilder<F extends Enum, C extends DockerCommand<F>, B extends DockerCommandBuilder> {

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   * @return The {@link DockerCommandBuilder}.
   */
  B setFlag(F flag);

  /**
   * Sets the flags.
   *
   * @param flags The flags.
   * @return The {@link DockerCommandBuilder}.
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
   * @return The {@link DockerCommandBuilder}.
   */
  B clearFlags();

  /**
   * Builds the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  C build();
}
