import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebApp{
	
	@Autowired
	MyService service
	
    @RequestMapping("/")
    String greetings(){
       service.getH3HeaderFrom("Spring Boot Rocks")
    }
}
