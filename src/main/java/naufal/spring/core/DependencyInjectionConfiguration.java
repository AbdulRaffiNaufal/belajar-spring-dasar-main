package naufal.spring.core;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import naufal.spring.core.data.Bar;
import naufal.spring.core.data.Foo;
import naufal.spring.core.data.FooBar;

@Configuration
public class DependencyInjectionConfiguration {

  @Primary
  @Bean
  public Foo fooFirst() {
    return new Foo();
  }

  @Bean
  public Foo fooSecond() {
    return new Foo();
  }

  @Bean
  public Bar bar() {
    return new Bar();
  }

  @Bean
  public FooBar fooBar(@Qualifier("fooSecond") Foo foo, Bar bar) {
    return new FooBar(foo, bar);
  }

}
