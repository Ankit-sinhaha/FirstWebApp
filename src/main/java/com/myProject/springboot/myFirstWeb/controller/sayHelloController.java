package com.myProject.springboot.myFirstWeb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sayHelloController {

    @RequestMapping("say-hello-html")
    public String sayHello() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> My first HTML page </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Hello! how are you?");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }
}
