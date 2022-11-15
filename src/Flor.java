public class Flor {

    //Atributos

    private String NombreComun;
    private String NombreCientif;

    //Constructor por defecto

    public Flor(){

    }

    //Constructor del objeto Flor con mismos atributos que objeto principal

    public Flor(Flor f){
        this.NombreComun=f.NombreComun;
        this.NombreCientif=f.NombreCientif;
    }

    //Set de nombre común, uno para cada uno

    public void setNombreComun(String nombreComun) {
        this.NombreComun=NombreComun;
    }

    public void setNombreCientif(String nombreCientif){
        this.NombreCientif=NombreCientif;
    }

    //Generar get, devuelve nombre común (Return)

    public String getNombreComun () {
        return.NombreComun;
    }

    public String getNombreCientif (){
        return.NombreCientif;
    }

}


