import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration 标识这个类可以使用spring ioc容器作为bean的来源
@Configuration
public class HelloWorldConfig {
	// bean 告诉spring 即将返回一个对象，该对象将会被注册在spring 应用程序的上下文中
	@Bean
	public HelloWorldConfig helloWorld() {
		return new HelloWorldConfig();
	}
//	代码等同于
	/*

	<beans>
		<bean id="helloWOrld" class="com.tutorialspoint.HelloWorld">
	</beans>

	*/
}
