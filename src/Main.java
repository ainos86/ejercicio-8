public class Main {
    public static void main(String[] args) {

        // creamos el objecto abuelo
        Persona abuelo = new Persona();

        // modificamos sus propiedades
        abuelo.setEdad ("80");
        abuelo.setNombre ("Paco");
        abuelo.setTelefono ("123456789");
        

        // imprimimos los valores de las propiedades del objecto abuelo
        System.out.println(abuelo.getEdad());
        System.out.println(abuelo.getNombre());
        System.out.println(abuelo.getTelefono());
    }
}
class Persona {
    private String edad;
    private String nombre;
    private String telefono;

    public void setEdad (String edad){
        this.edad = edad;
    }
    public String getEdad(){
        return this.edad;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }


    public void setTelefono (String telefono){
        this.telefono = telefono;
    }
    public String getTelefono (){
        return this.telefono;
    }
}