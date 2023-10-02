
package com.example.ProyectR_01.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/MenuPrincipal/")
@Controller
public class ControladorMenuPrincipal {
   
    
    @GetMapping("/")
    public String MenuPrincipal(){
        
//        return "index";
        return "MenuPrincipal";
    }
    
    
    
}
