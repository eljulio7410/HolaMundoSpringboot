package com.jgutierrez.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/controller")
public class HolaMundo {
    @GetMapping
    @ResponseBody
    public String mostrarmensaje3(){
        return "Hola mundo por defecto";

    }


    @GetMapping("/holamundo1")
    @ResponseBody
    public String mostrarmensaje1(){
        return "Hola mundo desde Spring boot 1";

    }
    @GetMapping("/holamundo2")
    @ResponseBody
    public String mostrarmensaje2() {
        return "Hola mundo desde Spring boot2";
    }
}
