import java.util.Scanner;
/**
 * Write a description of class Perro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Perro{
    public char Nombre;
    public int Edad;
    public char Raza;
    
    Scanner in = new Scanner(System.in);
    public String Datos(){
    return "Se llama " + this.Nombre + " ,es de raza " + this.Raza + " y tiene la edad de " + this.Edad;
    }
    public char getNombre(){
        return this.Nombre;
    }
    public char getRaza(){
    return this.Raza;
    }
    public int getEdad(){
    return this.Edad;
    }
public void setNombre(char Nombre){
this.Nombre = Nombre;
}
public void setRaza(char Raza){
this.Raza = Raza;
}
public void setEdad(int Edad){
this.Edad = Edad;
}
public String toString(){
return "Nombre: " + getNombre() + " , raza " + getRaza() + " ,de edad " + this.Edad; 
}
}

