/**
 * Author: 王俊超
 * Date: 2016-12-03 09:20
 * All Rights Reserved !!!
 */
@RestController
class WebApp {
    @RequestMapping("/")
    String greeting() {
        "<h1>Spring Boot Rocks</h1>"
    }
}
