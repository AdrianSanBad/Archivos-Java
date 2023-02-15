import java.util.Scanner;

public class Arrays {
    
    //Aqui ingresamos el tamaño maximo del arreglo
    private static final int NumeroMaximo = 10;
    
    // Creamos un arreglo para aqui almacenar los modelos de carros
    private String[] modelos = new String[NumeroMaximo];
    
    // variable int para saber cuantos carros llevamos en el array
    private int nCarros = 0;
    
    // Método para insertar un modelo de carro en el arreglo
    public void insertarModelo(String modelo) {
        if (nCarros < NumeroMaximo) {
            modelos[nCarros] = modelo;
            nCarros++;
            System.out.println("Modelo de carro insertado con éxito.");
        } else {
            System.out.println("El array está lleno, elimina algun modelo.");
        }
    }
    
    // Método para borrar un modelo de carro del arreglo
    public void borrarModelo(int posicion) {
        if (posicion >= 0 && posicion < nCarros) {
            for (int i = posicion; i < nCarros - 1; i++) {
                modelos[i] = modelos[i + 1];
            }
            modelos[nCarros - 1] = null;
            nCarros--;
            System.out.println("Modelo de carro eliminado con éxito.");
        } else {
            System.out.println("Posicion en array inválida.");
        }
    }
    
    // Método con el cual modificamos un modelo en el array
    public void modificar(int posicion, String modeloRemplazo) {
        if (posicion >= 0 && posicion < nCarros) {
            modelos[posicion] = modeloRemplazo;
            System.out.println("Modelo de carro modificado con éxito.");
        } else {
            System.out.println("Posicion en el array inválida.");
        }
    }
    
    // Método para mostrar todos los modelos de carros almacenados en el array
    public void mostrar() {
        if (nCarros > 0) {
            System.out.println("Estos son los modelos de carros almacenados:");
            for (int i = 0; i < nCarros; i++) {
                System.out.println((i + 1) + " " + modelos[i]);
            }
        } else {
            System.out.println("No hay modelos, ingresa alguno para poder realizar esta accion.");
        }
    }
    
    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Arrays modelosDeCarros = new Arrays();
        Scanner scanner = new Scanner(System.in);
        int eleccion;
        String modelo;
        int posicion;
        String modeloRemplazo;
        do {
            
            System.out.println("Menú seleccionable:");
            System.out.println("1. Insertar modelo de carro");
            System.out.println("2. Borrar modelo de carro");
            System.out.println("3. Modificar modelo de carro");
            System.out.println("4. Mostrar modelos de carros");
            System.out.println("5. Salir");
            
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.print("Ingrese el modelo de carro: ");
                    modelo = scanner.next();
                    modelosDeCarros.insertarModelo(modelo);
                    break;
                case 2:
                    System.out.print("Ingrese el índice del modelo de carro a borrar: ");
                    posicion = scanner.nextInt() - 1;
                   modelosDeCarros.borrarModelo(posicion);
                    break;
            case 3:
                System.out.print("Ingrese el índice del modelo de carro a modificar: ");
                posicion = scanner.nextInt() - 1;
                System.out.print("Ingrese el nuevo modelo de carro: ");
                modeloRemplazo = scanner.next();
                modelosDeCarros.modificar(posicion, modeloRemplazo);
                break;
            case 4:
                modelosDeCarros.mostrar();
                break;
            case 5:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Elección inválida.");
        }
    } while (eleccion != 5);
   
}
}