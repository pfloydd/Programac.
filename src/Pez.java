public class Pez {
    //Único atributo
    private String nombre;

    //Constructor por defecto
    public Pez(){

    }

    //Constructor que crea objeto Pez con mismos atributos  que el objeto principal
    public Pez (Pez p){
        this.nombre=p.nombre;
    }

    //Generar Set nombre
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    //Método Get nombre
    public void getNombre(){
        return.nombre;
    }
}
