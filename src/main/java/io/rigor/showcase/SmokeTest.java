package io.rigor.showcase;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SmokeTest {
    @GetMapping
    public String smokeTest() {
        return "smokeTest";
    }
}
