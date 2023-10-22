public class perro extends Adoptame{
   
    private  int num_vidas;
     public perro(){

     }
     public perro (String nombre, String raza, String tipo_alimento,int edad, int num_vidas)
     super ( nombre,raza,tipo_alimento,edad);
    this.num_vidas = num_vidas;
    public void setNum_vidas( int num_vidas){
        this.num_vidas = num_vidas;
    }
    public int getNum_vidas(){
        return num_vidas;
    }
    public void mostrarperros(){
        System.out.println(" el nombre del perro  es :" + getNombre() + "\n"
         + " la raza del perro es :" + getRaza() + "\n"
         + " sealimenta de :" + getTipo_alimento() + "\n"
         + " el perro tiene la edad de :" + getEdad() + "\n"
         + " las vidas del perro son :" + num_vidas + "\n");
    }
}
