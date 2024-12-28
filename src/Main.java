import clases.Producto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1,"jaboncillo",10.50));
        productos.add(new Producto(2,"aceite",13.50));
        productos.add(new Producto(3,"Arroz",150));

        System.out.println("lista de Productos: " + productos.size());
        System.out.println();
        productos.forEach(System.out::println);

    }
}