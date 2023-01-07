package naufal.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import naufal.spring.core.configuration.BarConfiguration;
import naufal.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
