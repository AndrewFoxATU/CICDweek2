package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class exercise3 {
    @GetMapping("/details")
    public String details(@RequestParam String name_of, @RequestParam int age_of){
        return "Name" + name_of+ ", Age: " + age_of;
    }

}
