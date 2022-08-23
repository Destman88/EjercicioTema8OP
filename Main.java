public class Main {
    public static void main(String[] args){
        Persona persona1 = new Persona();
        persona1.setNombre("Derick");
        persona1.setEdad(34);
        persona1.setTelefono(638926264);

        System.out.println("El nombre de la persona: " + persona1.getNombre());
        System.out.println("Su edad es de: " + persona1.getEdad() + " años");
        System.out.println("El número telefónico es: " + persona1.getTelefono());
    }
}

class Persona{
    private String nombre;
    private int edad;
    private int telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getTelefono() {
        return telefono;
    }
}