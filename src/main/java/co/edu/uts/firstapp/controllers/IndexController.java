
package co.edu.uts.firstapp.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class IndexController {

    @GetMapping("/saludo")
    public String saludo(){
        return "Hola, cómo estas:CAMILO";
    }

    @GetMapping("/sqrs")
    public String sqrs(@RequestParam double numero){
        try{
           return Double.toString(Math.sqrt(numero));
        }catch(NumberFormatException e){
            return "numero no valido";            
        }
        catch(Exception e){
            return "numero no valido";            
        }
        
    }
    
}
