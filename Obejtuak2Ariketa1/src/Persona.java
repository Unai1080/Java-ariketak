public class Persona {

    private String nombre;
    private String sexo;
    private int edad;

    public Persona(String nombre, String sexo, int edad){
        this.nombre=nombre;
        this.sexo=sexo;
        this.edad=edad;
    }
    public void muestra(){
        System.out.println("Zure izena: "+this.nombre);
        System.out.println("Sexua: "+this.sexo);
        System.out.println("Zure adina: "+this.edad);
    }

}
