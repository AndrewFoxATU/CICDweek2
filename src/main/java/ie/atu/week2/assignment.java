package ie.atu.week2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class assignment {
    @GetMapping("/calculate")
    public String details(@RequestParam int num1, @RequestParam int num2, @RequestParam String operation){
        float total = 0;
        switch (operation) {
            case "add":
                total = num1 + num2;
                break;
            case "subtract":
                total = num1 - num2;
                break;
            case "multiply":
                total = num1 * num2;
                break;
            case "divide":
                total = num1 / num2;
                break;
            default:
                break;
        }
        return "the answer is: " + Float.toString(total);
    }
}