/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraymultidimensiharga;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;
public class ArrayMultidimensiHarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] productList = {
                {"Maskara", "50.000"},
                {"Eyeliner", "65.000"},
                {"Bedak Tabur", "25.000"},
                {"Kucir Rambut", "10.000"},
                {"Sisir Rambut", "15.000"},
                {"Semir Rambut", "40.000"},
                {"Bedak Padat", "50.000"},
                {"Gelang Tangan", "10.000"},
                {"Jedai Rambut", "25.000"},
        };

        // Display the product list
        System.out.println("Product List:");
        System.out.println("--------------");
        for (String[] product : productList) {
            System.out.println("Product: " + product[0] + "\tPrice: " + product[1]);
        }

        Scanner s = new Scanner(System.in);
        System.out.print("\nEnter the name of the product to search: ");
        String searchProduct = s.nextLine();

        String foundPrice = searchForPrice(productList, searchProduct);

        if (foundPrice != null) {
            System.out.println("Price of " + searchProduct + ": " + foundPrice);
        } else {
            System.out.println("Product not found.");
        }
    }
    private static String searchForPrice(String[][] productList, String searchProduct) {
        for (String[] product : productList) {
            if (product[0].equalsIgnoreCase(searchProduct)) {
                return product[1];
            }
        }
        return null; // Product not found
    }
}

 
    

