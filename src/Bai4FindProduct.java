import Model.Product;

import java.util.ArrayList;

public class Bai4FindProduct {
    public  Product findProduct(ArrayList<Product> listProduct, String nameProduct) {
        for (Product item : listProduct) {
            if (item.getName().equalsIgnoreCase(nameProduct)) {
                return item;
            }
        }
        return null;
    }
    public void Bai4FindProduct() {
        System.out.println("Nhập tên sản phẩm mà bạn muốn tìm :");
        String nameProduct = Main.scanner.next();
        if (findProduct(Main.listProduct, nameProduct) == null) {
            System.out.println("Sản phẩm bạn muốn tìm không tồn tại ? Vui lòng kiểm tra lại tên sản phẩm !");
            Bai4FindProduct();
        } else {
            System.out.println("Thông tin sản phẩm bạn muốn tìm :");
            System.out.println("\tName: " + findProduct(Main.listProduct, nameProduct).getName());
            System.out.println("\tPrice: " + findProduct(Main.listProduct, nameProduct).getPrice());
            System.out.println("\tQuality: " + findProduct(Main.listProduct, nameProduct).getQuality());
            System.out.println("\tCategoryId: " + findProduct(Main.listProduct, nameProduct).getCatedgoryId());
        }
    }

}
