package at.fhb221606.tasktrack3kapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServusController {

    @GetMapping("/api/hello")
    public String hello()
    {
        return "Hello from Trask Tracker 3000 API";
    }



}
