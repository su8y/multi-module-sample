package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("test/{name}")
    @ResponseBody
    public String testControl(@PathVariable(name = "name") String name) {
        Member member = testService.testService(name);
        return String.format("hello %s", member.getName());
    }
}
