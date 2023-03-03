package Proyecto;
import java.util.Scanner;
public class Principal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean seguir = true;
    while (seguir) {
        System.out.println("¿Quiere crear un nuevo usuario? (S/N)");
        String opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("S")) {
            System.out.println("Escriba el DNI:");
            String dni = sc.nextLine();
            System.out.println("Escriba el nombre:");
            String nombre = sc.nextLine();
            System.out.println("Escriba los apellidos:");
            String apellidos = sc.nextLine();
            Usuario usuario = new Usuario(dni, nombre, apellidos);
            System.out.println("Se ha creado el usuario " + usuario.getNombre() + " " + usuario.getApellidos());
        } else {
            seguir = false;
            System.out.println("Fin del programa");
        }
    }
}
}



	

