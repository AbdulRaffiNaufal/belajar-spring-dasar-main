package naufal.spring.core;

import naufal.spring.core.BeanNameConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import naufal.spring.core.data.Foo;

public class BeanNameTest {

  private ApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(BeanNameConfiguration.class);
  }

  @Test
  void testBeanName() {
    Foo foo = applicationContext.getBean(Foo.class);
    Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class);
    Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);

    Assertions.assertSame(foo, fooFirst);
    Assertions.assertNotSame(foo, fooSecond);
  }
}
