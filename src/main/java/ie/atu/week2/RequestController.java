package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/person")
public class RequestController {
    @GetMapping("/Hello")
    public String Hello() {
        return "Hi there";
    }



}
