
/**
 * Write a description of class Autos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Autos
{
    // ATRIBUTOS
    public String Marca;
    public int Año;
    public String Modelo;
    public double Kilometraje;
    
    //ACCIONES
    public Autos(){}
    public String Encendido(){
     return "Encendido";
    }
    public String Decirdatos(){
    return "El auto de marca " + this.Marca + "Ha recorrido: " +  this.Kilometraje;
    
    }
    public String Apagado(){
    return "El auto está apagado";
    }
    
    //GETTERS Y SETTERRS
    //GETTERS
    public String getMarca()
    {
        
        return this.Marca;
    }


    public String getModelo()
    {
        
        return this.Modelo;
    }
    public int getAño(){
        return this.Año;
    }
    public double getKilometraje(){
        return this.Kilometraje;
    }
    //SETTER
    public void setMarca(String Marca){
    this.Marca = Marca;
    }
    public void setModelo(String Modelo){
    this.Modelo = Modelo;
    }
    public void setAño(int Año){
    this.Año = Año;
    }
    public void setKilometraje(double kilometraje){
    this.Kilometraje = Kilometraje;
    }
    public String toString(){
    return "Marca: " + getMarca() + "Modelo: " + getModelo() + " del año: " + getAño() + " y con un recorrido de " + getKilometraje() + "km/h";
    }
}
