package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstController {
    @RequestMapping("/hello")
    public String myfirstRequest()
    {
        System.out.println("完成");
        return "";
    }
}
