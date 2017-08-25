package com.xellitix.commons.docker.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.docker.registry.DockerRegistry;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultDockerRepository} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRepositoryTest {

  // Constants
  private static final String NAME = "repo";

  // Fixtures
  private DockerRegistry registry;
  private DefaultDockerRepository repository;

  @Test
  public void getNameTest() {
    assertThat(repository
        .getName())
        .isNotNull()
        .isEqualTo(NAME);
  }

  @Test
  public void getRegistryTest() {
    // Get the docker registry optional
    Optional<DockerRegistry> registryOptional = repository.getRegistry();

    // Validate the docker registry optional
    assertThat(registryOptional).isNotNull();
    assertThat(registryOptional.isPresent()).isTrue();
    assertThat(registryOptional.get()).isEqualTo(registry);
  }

  @Test
  public void getNullRegistryTest() {
    // Create a docker repository with a null registry
    repository = new DefaultDockerRepository(NAME, null);

    // Get the docker registry optional
    Optional<DockerRegistry> registryOptional = repository.getRegistry();

    // Validate the docker registry is null
    assertThat(registryOptional).isNotNull();
    assertThat(registryOptional.isPresent()).isFalse();
  }

  @Before
  public void setUp() {
    // Registry mocking
    registry = mock(DockerRegistry.class);

    // Create repository
    repository = new DefaultDockerRepository(NAME, registry);
  }
}
