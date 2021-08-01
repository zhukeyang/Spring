package main.webapp.com;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("hello")
public class Controller {
//    /表示当前项目下

    public void controller()
    {
        System.out.println("hello1被调");

    }
}
