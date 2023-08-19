
package co.edu.uts.firstapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class IndexController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola, cómo estas:CAMILO";
    }
    
}
