import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class Bai5FindProductByCategory {
    public  List<Product> findProductByCategory(ArrayList<Product> listProduct, int categoryId) {
        ArrayList<Product> arrayList = new ArrayList<>();
        for (Product item : listProduct) {
            if (item.getCatedgoryId() == categoryId) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public  void Bai5FindProductByCategory() {
        System.out.println("Nhập id danh mục sản phẩm mà bạn muốn tìm :");
        int i = 1;
        try {
            int scategoryId = Integer.parseInt(Main.scanner.next());
            if (findProductByCategory(Main.listProduct, scategoryId).size() == 0) {
                System.out.println("Danh sách sản phẩm trống hoặc thử một nhập id danh mục sản phẩm!");
                Bai5FindProductByCategory();
            } else {
                for (Product item : findProductByCategory(Main.listProduct, scategoryId)
                ) {
                    System.out.println("Thông tin sản phẩm thứ " + i++ + " :");
                    System.out.println("\tName: " + item.getName());
                    System.out.println("\tPrice: " + item.getPrice());
                    System.out.println("\tQuality: " + item.getQuality());
                    System.out.println("\tCategoryId: " + item.getCatedgoryId());
                }

            }
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập số!");
            Bai5FindProductByCategory();
        }
    }

}
