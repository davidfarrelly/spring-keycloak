package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@Controller
@ResponseBody
public class DemoController {

    @GetMapping("/private")
    public String getPrivate() {
        return "Private";
    }

    @GetMapping("/public")
    public String getPublic() {
        return "Public";
    }

}
