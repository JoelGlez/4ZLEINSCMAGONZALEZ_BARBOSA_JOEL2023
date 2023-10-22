//vamos a crear una tienda de mascotas en adopcion 

public class animales {
    /*
     * principio de encapsulamiento
     * es poder restringir el acceso a los datos , vamos a poder agrupar en una clase
     * el acceso a los diferentes aatributos y metodos u objetos de la clase, para que n 
     * puedan ser modificados desde oitro lugar 
     */


     // definir las bariables 
     private String nombre , raza , tipo_alimento;
     private int edad;
     // se debe crear el constructor , el constructor nos sirve para poder declarar 
     // la existencia de una clase , para poder inicializar las variables , para crear 
     // instancias de una clase 

public animales(){
    // este es un constructor por defecto
}
// cuando existe una construccion del objeto, de acuerdo a las necesidades 
// por parte usuario es necesario utilizar la sobrecarga de los metodos 
// en este caso la sobre carga del constructor 

// metodo para registrar la mascota 
public animales(String nom, String raza, String tipo_alimento, int edad){
    this.nombre = nom;
    this.raza = raza;
    this.tipo_alimento = tipo_alimento;
    this.edad = edad;

}
//para poder modificar los valores de la asignacion ,es necesario utilizar 
// los metodos gettter and setter 
// get---obtener---recibir
//set---asignar --- enviar 

// metodos get y set por cada variable 
public String getNombre(){
    return nombre;
}
public void setNombre(String nom){
    this.nombre = nom;
}
public String getRaza(){
    return raza;
}
public void setRaza(String raza){
    this.nombre = raza;
}
public String getTipo_tipo_alimento(){
    return tipo_alimento;
}
public void setTipo_alimento(String tipo_alimento){
    this.nombre = tipo_alimento;
}
public int  getEdad(){
    return edad ;
}
public void setEdad(String edad ){
    this.nombre = edad;
}
    
}
