import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.jms.activemq.ActiveMQAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@EnableAutoConfiguration(exclude=[ActiveMQAutoConfiguration.class])
class WebApp{

    @RequestMapping("/")
	  String greetings(){
	       "Spring Boot Rocks"
	  }
}
			
