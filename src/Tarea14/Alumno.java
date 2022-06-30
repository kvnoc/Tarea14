package Tarea14;

public class Alumno extends Persona{

    protected int mes;

    protected  int año;

    protected int dia;

    public Alumno(String nombres, String apelldidos, int dni, String nacimiento) {
        super(nombres, apelldidos, dni, nacimiento);
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public int calcularEdad() {

        int edad;

        edad = 2022 - año;

        if( mes > 6 ||( mes == 6 && dia > 30))
            edad = edad - 1;

        System.out.println("Edad actual: " + edad+" años");

        return edad;
    }
}
