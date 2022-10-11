
/**
 * Write a description of class Figura here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Figura
{
    public String nombre;
    public String clasificación;
    public int lados;
    public int area;
    
    //Acciones//
    public Figura(){}
    public String presentación(){
    return "Soy un: " + this. nombre;
    }
    public String Describir(){
    return "Mi area es de: " + this.area + "cm, soy de la familia de los: " + this.clasificación + " con " + this.lados + " de lados";
    }
    public String despedida(){
    return "Hasta la proxima";
    }
    
    //Atributos//
    public String getnombre(){
    return this.nombre;
    }
    public String getclasificación(){
    return this.clasificación;
    }
    public int getlados(){
    return this.lados;
    }
    public int getarea(){
    return this.area;
    }
    //Enviar datos//
    public void setnombre(String nombre){
    this.nombre = nombre;
    }
    public void setclasificación(String clasificación){
    this.clasificación = clasificación;
    }
    public void setlados(int lados){
    this.lados = lados;
    }
    public void setarea(int area){
    this.area = area;
    }
    public String toString(){
    return "Nombre: " + getnombre() + "clasificación: " + getclasificación() + " lados: " + getlados() + " area: " + getarea();
    }
}
