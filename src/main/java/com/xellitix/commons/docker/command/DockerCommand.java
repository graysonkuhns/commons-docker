package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.io.Serializable;
import java.util.List;

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
   * Gets a {@link List} of set flags.
   *
   * @return A {@link List} of set flags.
   */
  List<F> getFlags();

  /**
   * Checks if a flag is set.
   *
   * @param flag The flag.
   * @return True if the flag is set.
   */
  boolean isFlagSet(F flag);

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  DockerImage getImage();
}
