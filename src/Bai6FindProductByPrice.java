import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class Bai6FindProductByPrice {
    public  List<Product> findProductByPrice(ArrayList<Product> listProduct, int price) {
        ArrayList<Product> arrayList = new ArrayList<>();
        for (Product item : listProduct) {
            if (item.getPrice() <= price) {
                arrayList.add(item);
            }
        }
        return arrayList;
    }

    public  void Bai6FindProductByPrice() {
        System.out.println("Nhập giá sản phẩm mà bạn muốn tìm :");
        int i = 1;
        try {
            int price = Integer.parseInt(Main.scanner.next());
            if (findProductByPrice(Main.listProduct, price).size() == 0) {
                System.out.println("Danh sách sản phẩm trống hoặc thử nhập một giá sản phẩm khác");
                Bai6FindProductByPrice();
            } else {
                for (Product item : findProductByPrice(Main.listProduct, price)
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
            Bai6FindProductByPrice();
        }
    }

}
