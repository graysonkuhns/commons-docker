package com.xellitix.commons.docker.image;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.docker.repository.DockerRepository;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link DefaultDockerImage} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerImageTest {

  // Constants
  private static final String TAG = "tag";

  // Fixtures
  private DockerRepository repository;
  private DefaultDockerImage image;

  @Test
  public void getRepositoryTest() {
    assertThat(image
        .getRepository())
        .isNotNull()
        .isEqualTo(repository);
  }

  @Test
  public void getTagTest() {
    assertThat(image
        .getTag())
        .isNotNull()
        .isEqualTo(TAG);
  }

  @Before
  public void setUp() {
    // Docker repository mocking
    repository = mock(DockerRepository.class);

    // Create Docker image
    image = new DefaultDockerImage(repository, TAG);
  }
}
