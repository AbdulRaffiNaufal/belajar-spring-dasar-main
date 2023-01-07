package naufal.spring.core;

import naufal.spring.core.InheritanceConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import naufal.spring.core.service.MerchantService;
import naufal.spring.core.service.MerchantServiceImpl;

public class InheritanceTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testInheritance() {

    MerchantService merchantService = applicationContext.getBean(MerchantService.class);
    MerchantServiceImpl merchantServiceImpl = applicationContext.getBean(MerchantServiceImpl.class);

    Assertions.assertSame(merchantService, merchantServiceImpl);

  }
}
