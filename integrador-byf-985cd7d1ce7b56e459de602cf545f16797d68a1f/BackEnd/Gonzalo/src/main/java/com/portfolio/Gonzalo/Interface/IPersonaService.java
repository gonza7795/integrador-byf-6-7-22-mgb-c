
package com.portfolio.Gonzalo.Interface;

import com.portfolio.Gonzalo.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //traer una personas
    
    public List <Persona> getPersona();
    
    
    // guardar un objeto de tipo persona
    
    public void savePersona (Persona persona);
    
    
    //eliminar un objeto pero lo buscamos x Id
    
    public void deletePersona (Long id);
    
    
    //Buscar una persona por id
    
    public Persona findPersona (Long id);
    


    
}
