
package com.portfolio.Gonzalo.Controller;

import com.portfolio.Gonzalo.Entity.Persona;
import com.portfolio.Gonzalo.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController

//esto es para que no de error cuando llama a la variable
@CrossOrigin(origins = "http://localhost:4200")


public class PersonaController {
    
    @Autowired IPersonaService ipersonaService;
    
    
    @GetMapping("personas/traer")
    
    
    public List<Persona> getPersona() {
        return  ipersonaService.getPersona();
    }
    
    
    @PostMapping("/personas/crear")
    
    public String createPersona(@RequestBody Persona persona) {
        
        ipersonaService.savePersona(persona);
        return "La Persona fue creada correctamente";
        
    }
    
    
    @DeleteMapping ("personas/borrar/{id}")
    
    public String deletePersona(@PathVariable Long id) {
      ipersonaService.deletePersona(id);
        return "La persona se borró exitosamente";
    }
    
    
    @PutMapping ("personas/editar/{id}")
    
    
    // ASI SERIA LA URL
    //URL:PUERTO/personas/editar/{id}/nombre & apellido & IMG
    //ejemplo
    // localhost:8080/personas/editar/1?nombre=Zlatan&apellido=Imbraimovich&img=otroURL
    public Persona editPersona(@PathVariable Long id,
       @RequestParam("nombre") String nuevoNombre,
            @RequestParam("apellido") String nuevoApellido, 
                 @RequestParam("img") String nuevoImg) {
      Persona persona = ipersonaService.findPersona(id);
      persona.setNombre(nuevoNombre);
      persona.setApellido(nuevoApellido);
      persona.setImg(nuevoImg);
      
      ipersonaService.savePersona(persona);
      return persona;
      
    } 
    
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona()  {
        
        return ipersonaService.findPersona((long)1);
        
    }

    
    
    
    
    
   
}
