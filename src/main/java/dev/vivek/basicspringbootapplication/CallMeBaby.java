package dev.vivek.basicspringbootapplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CallMeBaby {
    @GetMapping("/callMe/{name}")
    public String callMe(@PathVariable String name, @RequestParam String age) {
        return "Call me baby " + name + " !"+ " Age: " + age;
    }
}
