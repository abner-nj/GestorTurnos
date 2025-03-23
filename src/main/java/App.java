
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author Abner
 */
public class App {
    //metodo para ejectuar el programa
    //utiliza un while para mantenerse recibiendo los comandos 
    //partes [0] es donde se encuentra los comandos escritos por el usuario
    //partes [1] es donde se encuentra el nombre de los clientes
    public void inicio (){
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        System.out.println("Ingrese el comando: ");
        while (true) {
            String comando = scanner.nextLine();
            String[] partes = comando.split(" ", 2);
            String opcion = partes[0];
            
            switch (opcion) {
                case "LLEGAR":
                    if (partes.length > 1) {
                        fila.add(partes[1]);
                    } else {
                        System.out.println("Debe ingresar un nombre.");
                    }
                    break;
                case "ATENDER":
                    if (!fila.isEmpty()) {
                        System.out.println("Atendiendo a: " + fila.poll());
                    } else {
                        System.out.println("No hay clientes en la fila.");
                    }
                    break;
                case "MOSTRAR":
                    if (fila.isEmpty()) {
                        System.out.println("Fila actual: vacía");
                    } else {
                        System.out.println("Fila actual: " + String.join(", ", fila));
                    }
                    break;
                case "SALIR":
                    System.out.println("Programa finalizado.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Comando no reconocido.");
            }
        }
    }
}
