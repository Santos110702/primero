
/**
 * PERSONA.
 * 
 * @author (Mark Ángel Santos Santos) 
 * @version (1.1)
 */
public class Persona
{
    // ATRIBUTOS
    public String nombre = "";
    public int edad;
    
    //ACCIONES
    public Persona(){}
    public String Saludo(){
     return "Hola muy buen dia";
    }
    public String Decirdatos(){
    return "Mi nombre es " + this.nombre + "Mi edad es: " +  this.edad;
    
    }
    public String despedida(){
    return "Hasta luego";
    }
    
    //GETTERS Y SETTERRS
    //GETTERS
    public String getNombre()
    {
        
        return this.nombre;
    }


    public int getEdad()
    {
        
        return this.edad;
    }
    //SETTER
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    public void setEdad(int edad){
    this.edad = edad;
    }
    
    public String toString(){
    return "Nombre: " + getNombre() + "/Edad: " + this.edad;
    }
}
