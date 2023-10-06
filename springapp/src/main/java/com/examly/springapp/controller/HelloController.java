
import org.springframework.web.bind.annotation.*;

@RestController
class HelloController{

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello world";
    }
}