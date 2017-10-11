package com.xellitix.commons.docker.action;

import java.util.HashSet;
import java.util.Set;

/**
 * Partial {@link DockerActionBuilder} implementation.
 *
 * @param <F> The {@link DockerAction} flag type.
 * @param <C> The {@link DockerAction} type.
 * @param <B> The {@link DockerActionBuilder} type.
 *
 * @author Grayson Kuhns
 */
public abstract class AbstractDockerActionBuilder<F extends Enum, C extends DockerAction<F>, B extends AbstractDockerActionBuilder>
    implements DockerActionBuilder<F,C, B> {

  // Constants
  private static final String WRONG_CLAZZ_MSG_TEMPLATE =
      "Expected the DockerActionBuilder implementation (%s) to be an instance of %s";

  // Properties
  private Class<B> clazz;
  private Set<F> flags;

  /**
   * Constructor.
   *
   * @param clazz The {@link DockerActionBuilder} {@link Class}.
   */
  public AbstractDockerActionBuilder(final Class<B> clazz) {
    this.clazz = clazz;
    flags = new HashSet<>();
  }

  /**
   * Sets a flag.
   *
   * @param flag The flag.
   * @return The {@link DockerActionBuilder}.
   */
  @Override
  public synchronized B setFlag(final F flag) {
    flags.add(flag);

    // Enable method chaining
    return getBuilder();
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
    return getBuilder();
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
    return getBuilder();
  }

  /**
   * Gets the {@link DockerActionBuilder}.
   *
   * @return The {@link DockerActionBuilder}.
   */
  protected B getBuilder() {
    if (!clazz.isInstance(this)) {
      throw new IllegalArgumentException(String.format(
          WRONG_CLAZZ_MSG_TEMPLATE,
          this.getClass().getName(),
          clazz.getName()));
    }

    return clazz.cast(this);
  }
}
