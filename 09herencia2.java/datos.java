// datos es un controlador , su nombre lo dice es una clase 
//que se encarga de poder controlar las entradas o salidas 
// de los datos , es la que se encarga de la manipulacionn 

import javax.swing.JOptionPane;

public class datos {
    // lo primero que necesitamos es una instancia de estudiante 
    Estudiante obj[] = new Estudiante(10);
     int x = 0;
     // creamos el menu 
     menu(){
        String var = " si";
        String mensaje = "";
        while( var.equalsIgnoreCase("SI")){
            int op = Integer.parseInt(JOptionPane.showInputDialog(" ingresa la opcion deceada :" \n
            + " 1.- dar de alta a un nuevo estudiante.\n"
            +"2.- mostrar los datos de los estudiamtes \n " ));
            switch(op){
                case 1:
                // necesito un metodo para solicitar la informacion 
                pedirEstudiante();
                break;
                case 2:
                 pedirEstudiante();
                break;
                break;
                default;
                JOptionPane.showMessageDialog(null, var, mensaje, " OPCION NO VALIDA ");

        }
        mensaje = JOptionPane.showInputDialog("DECEAS REPETIR");
     }

    
}
public void pedirEstudiante(){
    //solicito los datos
    int numbol = Integer.parseInt(
    JOptionPane.showInputDialog(
        " ingrese el numero de boleta del estudiante"));
String nom= JOptionPane.showInputDialog(
    "ingresa el nombre  del estudiante ");
    int edad = Integer.parseInt(
      JOptionPane.showInputDialog("ingresa la edad del estudiante"));
    char gen = JOptionPane.showInputDialog(
        "ingresa el genero  del estudiante"). charAt(0);

        // los agrego a mi arreglo
        //en este arreglo estoy guardado los datos del estudiante
        obj[x] = new Estudiante(numbol, nom,edad,gen);
        x++;
}
public void mostrarEstudiante(){
    for(int i = 0; i < x; i++){
        //visualiuzo
        JOptionPane.showMessageDialog(null,
        " la boleta del estudiante es " +  obj[i].getnumBoletas() + "\n"
         +" el nombre del estudiante es  " +  obj[i].getNombre() + "\n"
         + " la edad del estudiante es  " +  obj[i].getEdad() + "\n"
          + " el genero del estudianteb es  " +  obj[i].getGenero() + "\n");
    }
}

