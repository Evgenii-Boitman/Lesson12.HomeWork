import org.w3c.dom.ls.LSOutput;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static jdk.internal.org.jline.utils.InfoCmp.Capability.lines;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите id товара");
        int id = scanner.nextInt();
        System.out.println("Введите наименование товара");
        String name = scanner.next();
        System.out.println("Введите дату товара");
        String date = scanner.next();
        System.out.println("Чек товара: " + "id " + id + ", " + "наименование товара " + name + ", " + "дата товара " + date);
        in.close();


        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Car", "20/10/2002"));
        productList.add(new Product(2, "Icecream", "29/08/2022"));
        productList.add(new Product(3, "Water", "20/08/2022"));
        List<Order> orderList = new ArrayList<>();
        orderList.add(new Order("Meat", "29/08/2022", 10));
        orderList.add(new Order("Ticket", "29/08/2022", 5));
        orderList.add(new Order("Drink", "29/08/2022", 7));


        File fileOrder1 = Path.of("Order", "order.txt").toFile();
        try (FileOutputStream fileOutStream = new FileOutputStream(fileOrder1, true)) {
            String order = "I'm order!";
            fileOutStream.write(order.getBytes());
            fileOutStream.write(System.lineSeparator().getBytes());
        }
        File fileProduct1 = Path.of("Product", "product.txt").toFile();
        try (FileOutputStream fileOutStream = new FileOutputStream(fileProduct1, true)) {
            String product = "I'm product!";
            fileOutStream.write(product.getBytes());
            fileOutStream.write(System.lineSeparator().getBytes());
        }


        File fileOrder = Path.of("Order", "order.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(fileOrder)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileProduct = Path.of("Product", "product.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(fileProduct)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String str = new String(bytes);
            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
