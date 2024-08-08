
package base.de.datos;

import java.util.Scanner;


public class BaseDeDatos {

    public static void main(String[] args) {
     estudiante arreglo[] = new estudiante[10];
        Scanner teclado = new Scanner(System.in);
        Scanner letras = new Scanner(System.in);
        int op = 0;

        while (op != 5) {
            System.out.println("1. Nuevo alumno");
            System.out.println("2. Ver alumnos");
            System.out.println("3. Buscar alumno");
            System.out.println("4. Modificar alumno");
            System.out.println("5. Salir");
            System.out.println("Ingrese el numero de opcion");
            op = teclado.nextInt();
            System.out.println("------------------------");
            if (op == 1){

                System.out.println("Ingrese clave");
                int clave = teclado.nextInt();
                System.out.println("Ingrese el nombre");
                String nombre = letras.nextLine();
                System.out.println("Ingrese el grado ");
                String grado = letras.nextLine();
                System.out.println(nuevoAlumno(clave, nombre, grado, arreglo));

            } else if (op == 2) {
                System.out.println(printTodo(arreglo));
            } else if (op == 3) {
                System.out.println("---------------------");
                System.out.println("Ingrese clave");
                int clave = teclado.nextInt();
                System.out.println(buscarAlumno(clave, arreglo));
                }else if(op == 4){
                    System.out.println("Ingrese clave");
                int clave = teclado.nextInt();
                if(buscarAlumnoBoleano(clave, arreglo)){
                    System.out.println("Ingrese el nuevo nombre");
                    String nombre = letras.nextLine();
                    System.out.println("Ingrese el nuevo grado");
                    String grado = letras.nextLine();
                    System.out.println(modificarDatos(clave, nombre, grado, arreglo));
                    }else{
                    
                }
                }
        }
    }

    public static String nuevoAlumno(int clave, String nombre, String grado, estudiante arreglo[]) {
        boolean lleno = true;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == null) {
                arreglo[i] = new estudiante(clave, nombre, grado);
                lleno = false;
                break;
            } else if (arreglo[i].getClave() == clave) {
                return "Ya existe la clave";

            }
        }
        if (!lleno) {
            return "--Se gurado con exito--";
        } else {
            return "Ya no hay espacio";
        }

    }

    public static String printTodo(estudiante arreglo[]) {
        String cadena = "";
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null) {
                cadena = cadena + arreglo[i].getClave() + " | " + arreglo[i].getNombre() + " | " + arreglo[i].getGrado() + "\n";
            }
        }

        return cadena;
    }

    public static String buscarAlumno(int clave, estudiante arreglo[]) 
    {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != null && arreglo[i].getClave() == clave) {
                return "Los datos \n nombre: " + arreglo[i].getNombre() + "Grado: " + arreglo[i].getGrado();

            }

        }
        return "No existe la clave ingresada";
    }
    public static boolean buscarAlumnoBoleano(int clave, estudiante arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] != null && arreglo[i].getClave() == clave){
                return true;
            }
        }
        return false;
    } 
    public static String modificarDatos(int clave, String mombre, String grado, estudiante arreglo[]){
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] != null && arreglo[i].getClave() == clave){
                arreglo[i].setNombre(mombre);
                arreglo[i].setGrado(grado);
                return "Se actualizo con exito";
                
            }
        }
        return"";
    }
    
}
