package naufal.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import naufal.spring.core.factory.PaymentGatewayClientFactoryBean;

@Configuration
@Import({
    PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
