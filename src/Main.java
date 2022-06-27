import Model.Category;
import Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static ArrayList<Category> arrayCategory;
    public static ArrayList<Product> listProduct;
    public static Scanner scanner = new Scanner(System.in);
    static Bai1giaithuat bai1giaithuat = new Bai1giaithuat();
    static Bai4FindProduct bai4FindProduct = new Bai4FindProduct();
    static Bai5FindProductByCategory bai5FindProductByCategory = new Bai5FindProductByCategory();
    static Bai6FindProductByPrice bai6FindProductByPrice = new Bai6FindProductByPrice();
    static Bai8BubbleSort bai8BubbleSort = new Bai8BubbleSort();
    static Bai9InsertionSort bai9InsertionSort = new Bai9InsertionSort();
    static Bai10SelectionSort bai10SelectionSort = new Bai10SelectionSort();

    public static void getarrayCategory() {
        arrayCategory = new ArrayList<>();
        arrayCategory.add(new Category(1, "Comuter"));
        arrayCategory.add(new Category(2, "Memory"));
        arrayCategory.add(new Category(3, "Card"));
        arrayCategory.add(new Category(4, "Acsesory"));
    }

    public static void getarrayProduct() {
        listProduct = new ArrayList<>();
        listProduct.add(new Product("CPU", 750, 10, 1));
        listProduct.add(new Product("RAM", 50, 2, 2));
        listProduct.add(new Product("HDD", 70, 1, 2));
        listProduct.add(new Product("Main", 400, 3, 1));
        listProduct.add(new Product("Keyboard", 30, 8, 4));
        listProduct.add(new Product("Mouse", 25, 50, 4));
        listProduct.add(new Product("VGA", 60, 35, 3));
        listProduct.add(new Product("Monitor", 120, 28, 2));
        listProduct.add(new Product("Case", 120, 28, 5));
    }

    public static void main(String[] args) {
        int a[] = {1, 4, 3, 5, 8, 10, 9};
        getarrayCategory();
        getarrayProduct();
        System.out.println("Nhập số :");
        String so = scanner.next();
        switch (so) {
            case "1":
                bai1giaithuat.giaithuat();
                break;
            case "2":
                bai4FindProduct.Bai4FindProduct();
                break;
            case "3":
                bai5FindProductByCategory.Bai5FindProductByCategory();

                break;
            case "4":
                bai6FindProductByPrice.Bai6FindProductByPrice();

                break;
            case "5":
                bai8BubbleSort.Bai8BubbleSort(a);
                for (int i = 0; i < a.length; ++i)
                    System.out.print(a[i] + " ");
                break;
            case "6":
                bai9InsertionSort.Bai9InsertionSort(a);
                for (int i = 0; i < a.length; ++i)
                    System.out.print(a[i] + " ");
                break;
            case "7":
                bai10SelectionSort.Bai10SelectionSort(a);
                for (int i = 0; i < a.length; ++i)
                    System.out.print(a[i] + " ");
                break;
            default:
                System.out.println("Vui lòng nhập lại đúng số !");
        }
    }
}
