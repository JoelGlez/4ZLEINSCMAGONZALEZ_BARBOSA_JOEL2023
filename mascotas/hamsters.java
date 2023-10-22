public class hamsters extends Adoptame {
   
    private  int num_vidas;
     public hamsters(){

     }
     public hamsters (String nombre, String raza, String tipo_alimento,int edad, int num_vidas)
     super ( nombre,raza,tipo_alimento,edad);
    this.num_vidas = num_vidas;
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarhamsters(){
        System.out.println(" el nombre del hamster  es :" + getNombre() + "\n"
         + " la raza del hamster es :" + getRaza() + "\n"
         + " sealimenta de :" + getTipo_alimento() + "\n"
         + " el hamster tiene la edad de :" + getEdad() + "\n"
         + " las vidas del hamster son :" + num_vidas + "\n");
    } 
}
