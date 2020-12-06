package concatination;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.context.annotation.PropertySource;
@Configuration
@ComponentScan(basePackages = "concatination")
//@PropertySource(messages.properties)
@EnableAspectJAutoProxy
public class AppConfig {

}
