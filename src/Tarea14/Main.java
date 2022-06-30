package Tarea14;

public class Main {

    public static void main(String[] args){

        Docente docente = new Docente("Pedro","Zevallos",123456789, "17/05/1960");
        Alumno alumno = new Alumno("Harold","Pajuelo",98765415,"10/05/2000");
        Matricula matricula = new Matricula(55621);
        Curso base = new Curso("Base de Datos");
        Curso poo = new Curso("Programacion Orientada Objetos");

        System.out.println("+++MATRICULA+++");
        System.out.println("Matricula: "+matricula.getNumero());
        System.out.println("+++ALUMNO+++");
        System.out.println("Nombres: "+alumno.getNombres());
        System.out.println("Apellidos: "+alumno.getApelldidos());
        System.out.println("Dni: "+alumno.getDni());
        System.out.println("Fecha de Nacimiento: "+alumno.getNacimiento());
        alumno.setDia(10);
        alumno.setMes(5);
        alumno.setAño(2000);
        alumno.calcularEdad();
        System.out.println("+++CURSOS+++");
        System.out.println("Curso: "+base.getNombre());
        System.out.println("Curso: "+poo.getNombre());
        System.out.println("+++DOCENTE+++");
        System.out.println("Nombres: "+docente.getNombres());
        System.out.println("Apellidos: "+docente.getApelldidos());
        System.out.println("Dni: "+docente.getDni());
        System.out.println("Fecha de Nacimiento: "+docente.getNacimiento());
        docente.setDia(17);
        docente.setMes(5);
        docente.setAño(1960);
        docente.calcularEdad();
    }

}
