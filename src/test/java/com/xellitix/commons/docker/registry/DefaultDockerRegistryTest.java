package com.xellitix.commons.docker.registry;

import static org.assertj.core.api.Assertions.assertThat;

import java.net.URL;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * {@link DefaultDockerRegistry} test case.
 *
 * @author Grayson Kuhns
 */
public class DefaultDockerRegistryTest {

  // Constants
  private static final String ID = "registry.company.com";
  private static URL ENDPOINT;

  // Fixtures
  private DefaultDockerRegistry registry;

  @Test
  public void getEndpointTest() {
    assertThat(registry
        .getEndpoint())
        .isNotNull()
        .isEqualTo(ENDPOINT);
  }

  @Test
  public void getIdTest() {
    assertThat(registry
        .getHostname())
        .isNotNull()
        .isEqualTo(ID);
  }

  @Before
  public void setUp() {
    registry = new DefaultDockerRegistry(ENDPOINT);
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
    ENDPOINT = new URL("https://registry.company.com");
  }
}
