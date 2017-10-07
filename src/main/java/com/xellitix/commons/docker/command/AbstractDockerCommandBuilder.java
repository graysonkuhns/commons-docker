package com.xellitix.commons.docker.command;

import com.xellitix.commons.docker.image.DockerImage;
import java.util.HashSet;
import java.util.Set;

/**
 * Abstract {@link DockerCommandBuilder} implementation.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerCommandBuilder<F extends Enum, C extends DockerCommand<F>, B extends AbstractDockerCommandBuilder>
    implements DockerCommandBuilder<F,C, B> {

  // Constants
  private static final String WRONG_CLAZZ_MSG_TEMPLATE =
      "Expected the DockerCommandBuilder implementation (%s) to be an instance of %s";

  // Properties
  private Class<B> clazz;
  private Set<F> flags;
  private DockerImage image = null;

  /**
   * Constructor.
   *
   * @param clazz The {@link DockerCommandBuilder} {@link Class}.
   */
  public AbstractDockerCommandBuilder(final Class<B> clazz) {
    this.clazz = clazz;
    flags = new HashSet<>();
    image = null;
  }

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   * @return The {@link DockerCommandBuilder}.
   */
  @Override
  public synchronized B setFlag(final F flag) {
    flags.add(flag);

    // Enable method chaining
    return getBuilder(clazz);
  }

  /**
   * Sets the flags.
   *
   * @param flags The flags.
   */
  @Override
  public synchronized B setFlags(final Set<F> flags) {
    this.flags.addAll(flags);

    // Enable method chaining
    return getBuilder(clazz);
  }

  /**
   * Gets the flags.
   *
   * @return The flags.
   */
  @Override
  public synchronized Set<F> getFlags() {
    return flags;
  }

  /**
   * Clears the flags.
   */
  @Override
  public synchronized B clearFlags() {
    flags.clear();

    // Enable method chaining
    return getBuilder(clazz);
  }

  /**
   * Sets the {@link DockerImage}.
   *
   * @param image The {@link DockerImage}.
   * @return The builder.
   */
  @Override
  public synchronized B withImage(final DockerImage image) {
    this.image = image;

    // Enable method chaining
    return getBuilder(clazz);
  }

  /**
   * Gets the {@link DockerImage}.
   *
   * @return The {@link DockerImage}.
   */
  @Override
  public synchronized DockerImage getImage() {
    return image;
  }

  /**
   * Gets the {@link DockerCommandBuilder}.
   *
   * @param clazz The {@link DockerCommandBuilder} {@link Class}.
   * @return The {@link DockerCommandBuilder}.
   */
  protected B getBuilder(final Class<B> clazz) {
    if (!clazz.isInstance(this)) {
      throw new IllegalArgumentException(String.format(
          WRONG_CLAZZ_MSG_TEMPLATE,
          this.getClass().getName(),
          clazz.getName()));
    }

    return clazz.cast(this);
  }
}
