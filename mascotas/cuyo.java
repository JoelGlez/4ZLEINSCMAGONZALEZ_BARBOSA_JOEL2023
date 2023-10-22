 public class cuyo extends Adoptame {
            
    
    private  int num_vidas;
     public cuyo(){

     }
     public cuyo(String nombre, String raza, String tipo_alimento,int edad, int num_vidas)
     super ( nombre,raza,tipo_alimento,edad);
    this.num_vidas = num_vidas;
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarcuyos(){
        System.out.println(" el nombre del cuyo  es :" + getNombre() + "\n"
         + " la raza del cuyo es :" + getRaza() + "\n"
         + " sealimenta de :" + getTipo_alimento() + "\n"
         + " el cuyo tiene la edad de :" + getEdad() + "\n"
         + " las vidas del cuyo son :" + num_vidas + "\n");
    }
    }
