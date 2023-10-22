public class Estudiante extends persona{
    private int numBoleta;
    private String chillon;

    public Estudiante(){

    }
    public Estudiante(int mumBoleta, String nombre, int edad , char genero, String chillon){
        super( nombre,edad,genero);
        this.numBoleta = numBoleta;
        this.chillon = chillon;

    }
    public Estudiante(int mumBoleta, String nombre, int edad , char genero){
        super( nombre,edad,genero);
        this.numBoleta = numBoleta;
        
        
    }
    public int getnumBoletas(int numBoleta){

        return numBoleta;
    }
 public void setnumBoletas( int numBoleta){
    this.numBoleta = numBoleta;
 }
 public String getchillon(String chillon){

        return chillon;
    }
 public void setchillon( String chillon){
    this.chillon = chillon;
 }
 

}