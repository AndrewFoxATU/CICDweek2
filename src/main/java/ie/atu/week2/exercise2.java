package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class exercise2 {
    @GetMapping("/user/{id}")
    public String getUser(@PathVariable long id) {
        return "User ID: " + id;
    }
}
