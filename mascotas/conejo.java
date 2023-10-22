public class conejo  extends Adoptame{
    
    private  int num_vidas;
     public conejo(){

     }

     public conejo (String nombre, String raza, String tipo_alimento,int edad, int num_vidas)
     super ( nombre,raza,tipo_alimento,edad);

    this.num_vidas = num_vidas;
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarconejos(){
        System.out.println(" el nombre del conejo  es :" + getNombre() + "\n"
         + " la raza del conejo es :" + getRaza() + "\n"
         + " sealimenta de :" + getTipo_alimento() + "\n"
         + " el conejo tiene la edad de :" + getEdad() + "\n"
         + " las vidas del conejo son :" + num_vidas + "\n");
    }
}
