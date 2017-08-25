package com.xellitix.commons.docker.registry;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import com.xellitix.commons.net.url.UrlFactory;
import java.net.URL;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * {@link DefaultDockerRegistryFactory} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRegistryFactoryTest {

  // Constants
  private static String ENDPOINT = "https://registry.company.com";

  // Rules
  @Rule
  public ExpectedException thrown = ExpectedException.none();

  // Fixtures
  private static URL endpoint;
  private UrlFactory urlFactory;
  private DefaultDockerRegistryFactory registryFactory;

  @Test
  public void createWithEndpointUrlTest() {
    final DockerRegistry registry = registryFactory.create(endpoint);
    validateDockerRegistry(registry);
  }

  @Test
  public void createWithEndpointStringTest() throws Exception {
    final DockerRegistry registry = registryFactory.create(ENDPOINT);
    validateDockerRegistry(registry);
  }

  private void validateDockerRegistry(final DockerRegistry registry) {
    // Registry
    assertThat(registry)
        .isNotNull()
        .isInstanceOf(DefaultDockerRegistry.class);

    // Registry endpoint
    assertThat(registry
        .getEndpoint())
        .isNotNull()
        .isEqualTo(endpoint);
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    endpoint = new URL(ENDPOINT);
  }

  @Before
  public void setUp() throws Exception {
    // URL factory mocking
    urlFactory = mock(UrlFactory.class);
    doReturn(endpoint)
        .when(urlFactory)
        .create(eq(ENDPOINT));

    // Create the registry factory
    registryFactory = new DefaultDockerRegistryFactory(urlFactory);
  }
}
