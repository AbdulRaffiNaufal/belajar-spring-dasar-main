package naufal.spring.core;

import naufal.spring.core.MainConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import naufal.spring.core.data.Bar;
import naufal.spring.core.data.Foo;

public class ImportTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testImport() {

    Foo foo = applicationContext.getBean(Foo.class);
    Bar bar = applicationContext.getBean(Bar.class);

  }
}
