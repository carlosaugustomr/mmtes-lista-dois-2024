package com.carlos;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class indexController {

    @RequestMapping("/envio-email")
    public String envioemail(){
        return "eventos/fromEvento";
    }
}
