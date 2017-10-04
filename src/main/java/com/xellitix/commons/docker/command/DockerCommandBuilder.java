package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.Set;

/**
 * {@link DockerCommand} builder.
 *
 * @param <C> The {@link DockerCommand} type.
 * @param <B> The {@link DockerCommandBuilder} type.
 *
 * @author Grayson Kuhns
 */
public interface DockerCommandBuilder<F extends Enum, C extends DockerCommand<F>, B extends DockerCommandBuilder<F, C, B>> {

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   */
  void setFlag(F flag);

  /**
   * Sets the flags.
   *
   * @param flags The flags.
   */
  void setFlags(Set<F> flags);

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  Set<F> getFlags();

  /**
   * Clears the flags.
   */
  void clearFlags();

  /**
   * Sets the {@link DockerImage}.
   *
   * @param image The {@link DockerImage}.
   * @return The {@link DockerCommandBuilder}.
   */
  B withImage(DockerImage image);

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();

  /**
   * Builds the {@link DockerCommand}.
   *
   * @return The {@link DockerCommand}.
   */
  C build();
}
