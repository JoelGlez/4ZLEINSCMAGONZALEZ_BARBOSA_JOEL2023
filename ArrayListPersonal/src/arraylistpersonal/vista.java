/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistpersonal;

/**
 *
 * @author SELECTO SANTA FE
 */
 import java.util.*;

public class vista {
  
    // vamo a crear el menu 
    public void menu(){
    Scanner entrada = new Scanner(System.in);
    //vamos a crear una instancia de persona y del controlador 

    Accionespersona control = new Accionespersona();
    System.out.println("Bienvenido al programa de registro de dormiditos  mde UTC");
     System.out.println("Elija una opcion ");
      System.out.println("1.-mostrar a todos los dormiditos");
       System.out.println("2.-registrar a un nuevo dormidito");
        System.out.println("3.- editar un dormidito");
         System.out.println("4.- despertar al dormidito");
          System.out.println("5.- Salir");
          int opcion = entrada.nextInt();

          switch(opcion){
            case 1:
            //mostrar todo el registro de persona  
            System.out.println("mimidos");
            // es una instancia de lista de personas
            ArrayList<Persona> listaPersonas = control.mostrarPersonas();
            // al tener la lista de personas hace falta recorrer lod registrod de dicha lista 
            for (persona objeto : listaPersonas){
                System.out.println("el id es :" + objeto.getId() + "\n"
                + " el nombre es :" + objeto.getNombre() + "\n"
                + " la edad es " + objeto.getEdad() + "\n");

            }
            menu();
            break;
            case 2:
            //debomos registrar los datos de la persona 
            System.out.println(" ingres el id del dormidito");
            int idpersona= Integer.parseInt(entrada.nextLine());
            System.out.println(" ingrese el nombre del dormidito");
            String nombrepersona = entrada.nextLine();
            System.out.println(" ingrese la edad del dormidito");
            int edapersona = Integer.parseInt(entrada.nextLine());
            //ahora debo realizar una instancia de la persona 
            Persona personaDormidita = new Persona(idpersona, nombrepersona, edapersona);
            control.agregarPersona(personaDormidita);
            menu();
            break;
            case 3:

            // primero debo buscar a la persona que quiero editar , por medio del id 
            System.out.println(" ingresa el id del dormidito a  buscar ");
            idpersona = Integer.parseInt(entrada.nextLine());

            // mando a llamar el metodo de busqueda 
            Persona personabuscar = control.buscarPersona(idpersona);
            // veo la informacion 
            System.out.println(" la informacion del dormidito es " + "\n"
            + " ID" + personabuscar.getId() + "\n"
            + " nombre" + personabuscar.getNombtre() + "\n"
            + " edad " + personabuscar.getEdad() + "\n");

            // cambio los datos que desee
            System.out.println(" ingrese el nuevo nombre del dormidito");
            String nuevonombre = entrada.nextLine();
            System.out.println(" ingresa la nueva edad del dormidito");
            int nuevaedad = Integer.parseInt(entrada.nextLine());

            // al tener los nuevo s datos debo enviarlos

            personabuscar.setNombre(nuevonombre);
            personabuscar.setEdad(nuevaedad);

            // ahora si actualizo el registro
            control.actualizarPersona(personabuscar);
            menu();

            break;
            case 4:
            System.out.println(" ingresa el id del dormidito a despertar");
            idpersona = Integer.parseInt(entrada.nextLine());

            // creo la persona para eliminarla
            Persona personaeliminar = control.buscarPersona(idpersona);

            // lo elimino
            control.eliminarPersona(personaeliminar);
            System.out.println(" el dormidito ya desperto");
            menu();

            break;
            default:
            System.out.println(" opcion no valida");
            break;
          }
}
}
