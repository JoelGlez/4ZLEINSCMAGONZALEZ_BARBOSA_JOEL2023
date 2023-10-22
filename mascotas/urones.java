public class urones extends Adoptame{
   
    private  int num_vidas;
     public urones(){

     }
     public urones(String nombre, String raza, String tipo_alimento,int edad, int num_vidas)
     super ( nombre,raza,tipo_alimento,edad);
    this.num_vidas = num_vidas;
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarurones(){
        System.out.println(" el nombre del uron  es :" + getNombre() + "\n"
         + " la raza del uron es :" + getRaza() + "\n"
         + " sealimenta de :" + getTipo_alimento() + "\n"
         + " el uron  tiene la edad de :" + getEdad() + "\n"
         + " las vidas del uron son :" + num_vidas + "\n");
    } 
}
