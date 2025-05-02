import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        //2. Apellido
        //3. Nombre de usuario
        //4. Contraseña
        Scanner scanner = new Scanner(System.in);
        System.out.println("Formulario de registro");
        System.out.println("Introduce tu nombre");
        String name = scanner.nextLine();
        System.out.println("Introduce tu apellido");
        String surname = scanner.nextLine();
        System.out.println("Introduce tu nombre de usuario");
        String username = scanner.nextLine();
        System.out.println("Introduce tu contraseña");
        String password = scanner.nextLine();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println();
        System.out.println("Hola " + name + " " + surname + ", tu nombre de usuario es " + username + " y tu contraseña es " + password + ", gracias por registrarte.");
    }
}