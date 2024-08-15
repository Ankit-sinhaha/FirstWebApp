package com.myProject.springboot.myFirstWeb.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LogInController {

    // Query parameters
    // http://localhost:8080/login?name=ankit
    //  to pass name from user to our jsp we use model map
    @RequestMapping("loginWithQueryParam")
    public String goToLoginPage(@RequestParam String name, ModelMap modelMap) {
        modelMap.put("name", name); // (key, value ) pair
        System.out.println("name is: " + name); // not recommended for production code
        return "login";
    }

    @RequestMapping("login")
    public String goToLoginPageWithoutQueryParam() {
        return "login";
    }
}
