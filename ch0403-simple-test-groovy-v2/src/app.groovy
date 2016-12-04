import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WebApp{
    @RequestMapping("/")
    String greetings(){
        "Spring Boot Rocks!"
    }
}
