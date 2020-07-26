package microservices.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @GetMapping("/service2")
    public ResponseEntity getService1() {
        return ResponseEntity.ok("Service 2 master response: ok");
    }
}
