package Tarea14;

public abstract class Persona {

    protected String nombres;

    protected String apelldidos;

    protected int dni;

    protected String nacimiento;

    public Persona(String nombres, String apelldidos, int dni, String nacimiento) {
        this.nombres = nombres;
        this.apelldidos = apelldidos;
        this.dni = dni;
        this.nacimiento = nacimiento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApelldidos() {
        return apelldidos;
    }

    public int getDni() {
        return dni;
    }

    public String getNacimiento() {
        return nacimiento;
    }


    public abstract int calcularEdad();
}
