/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersonal;

/**
 *
 * @author SELECTO SANTA FE
 */


import java.util.ArrayList ;
public class AccionesPersona {
    /*
    Acciones persona es una clase de tipo controlador , el controlador es 
    una clase que se encarga de las acciones u operaciones que debe tener el objeto
    que se ha creado , por lo regular siempre esta asociado las operaciones basicas 
    consultar   consult 
    registrar register
    actualizar update
    eliminar delete
    CRUD

    ahora cuando pensamos en las acciones de una persona , es necesario 
    guardar todos los datos de forma dinamica ,porqwue costantremente 
    van a estar generando nuevos registros , 
    para ello necesitamos utilizar un tipo de objeto especial llamado

    ArrayList , es un arreglo dinamico de objeto ,a comparacion de los otros arreglos 
    un arreglo solo puede contener un tipo de dato por ejemplo

    int edad[] char letras[]  double precio[]


    ArrayList  al ser dinamico  puede cambiar su tamaño , 
    se puede adaptar a diferentes tipos de dato, por que lo que guarda son objetos.

     */ 
    // declaramos un objeto de persona tipo ArrayList
     public ArrayList<persona> listapersonas = new ArrayList<Persona>();

     // vamos a crear un metodo para el guardar el registro de una persona

     public void agregarPersona(Persona p){
        //voy a ocupar mi lista de persona para ahgrgarlo
        listapersonas.add(p);
     }
//buscar una persona po su id
public Persona buscarPersona(int id){
    //necesito una persona para saber si la encontre ny otra para buscarla
    Persona encontrada = new Persona();

    // necesito recorrer el ArrayList de personas registradas 
    for ( Persona p : listapersonas){
        if(id == p.getId()){
            encontrada=p;

        }else {
            System.out.println(" No existe el registro de esa persona ");
        }
    }
    return encontrada;
}
  
//actualizar los datos de una persona
public void actualizarPersona(Persona actualizada){
    //como hacer el proceso de actualizar
    // debo buscar a la persona que quiero actualizar
    // ya que lo encontre dobo cambiar los datod (borrar el anterior dato)
    // actualizar los datos de, la nueva persona 

    Persona actualizar = buscarPersona(actualizada.getId());
    // CAMBIO LOS DATOS
    listapersonas.remove(actualizar);
    // actualizo
    listapersonas.add(actualizar);
        
    

}
// necesito eliminar una persona
public void eliminarPersona(Persona eliminada){
listapersonas.remove(eliminada);
}
//quierp mostrar la lista de personas 
public ArrayList<Persona> mostPersonas(){
    return listapersonas;
}

    private static class Persona {

        public Persona() {
        }
    }
}
    

