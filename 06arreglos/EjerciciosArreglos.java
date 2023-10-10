import java.util.*;
public class EjerciciosArreglos{
    
    /**
     * @param args
     */
    public static void main ( String[] args){
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int [10];

    int opcion,par,sumapares,numeromayor =0 ,numeromenor =0,calificacionsuperior =0,
     reprovado = 0,calificacion=6;
   char letra;
   
   float suma =0,promedio=0;
    do{
        System.out.println(" bienvenido al programa ");
        System.out.println(" elige la opcion deceada");
        System.out.println("1.-Promedio de valores  ");
        System.out.println(" 2.- promedio de numeros pares ");
        System.out.println("3.-calificaciones  ");

        opcion = entrada.nextInt();

        switch(opcion){
            case 1:
           
        for(int i = 0 ; i < 10; i++){
                System.out.println("ingrese 10 numeros para sumarse " + i);
            arreglo[i]= entrada.nextInt();
            suma=suma+arreglo[i];
            
              }
              System.out.println(" la suma de las numeros seleccionados  es :"+ suma );
    

        break;
            case 2:
              for(int i = 0 ; i < 10; i++){
                System.out.println("ingrese 10 numeros ya sea pares o impares  " + i);
            arreglo[i]= entrada.nextInt();
            
            
            suma=suma+arreglo[i];
            promedio=suma/10;
            par = i/2;
           sumapares=par + par;

            for (int j = 0; i<=arreglo[i]; i++){
           if(i/2==0){
            System.out.println("numero" + i +  " par");
           }else {
            System.out.println("numero impar");
           }
            }
    
              }
              System.out.println(" la suma de las calificaciones es :"+ suma + " el promedio es: "
               + promedio);
            break;

            case 3:
        
            for(int i = 0 ; i < arreglo.length; i ++ ){
            
                System.out.println("ingrese 10 calificaciones finales de alumnos " + i);
                arreglo[i]= entrada.nextInt();
            suma=suma+arreglo[i];
            promedio=suma/10;

            if ( i== 0){
                numeromenor= arreglo[i];
                numeromayor =arreglo[i];
            }else if (arreglo[i]<numeromenor ){
                
                    numeromenor = arreglo[i];
                }
                if (arreglo[i]>numeromayor){
                    numeromayor = arreglo[i];

                }
                //calificacion superior al promedio
                
                   if ( arreglo[i]>promedio){
                    calificacionsuperior=arreglo[i];
                   } 
                   //alumnos reprovados
                   if (arreglo[i]<=calificacion){
                    for(int j = 0 ; j < calificacion; j++);
                    calificacion= arreglo[i];
                   }
                
               
               
              
            }
        System.out.println(" calificaciones  :"    );  
System.out.println(" el promedio es :" + promedio);
              System.out.println("calificacion mas alta :"  +numeromayor +" calificacion mas baja :"+ numeromenor);
              System.out.println("calificaciones superiores al promedio es :"+ calificacionsuperior);
               System.out.println("alumnos reprobados "+ calificacion +" alumnos aprobados ");
    
     

              

            break;
default:
   
        }
               System.out.println("deseas repetir el programa, presiona S para si");
            letra = entrada.next().charAt(0);
        
         }while(letra =='s'|| letra =='S');
        }

}
