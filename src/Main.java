import compara.ComparaNameOfProduct;
import entity.Product;
import entity.ProductManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args){

        Product product5=new Product(5,"tien5",10004);
        Product product3=new Product(3,"tien3",10002);
        Product product1=new Product(11,"tien22",10006);
        Product product2=new Product(2,"tien2",10001);
        Product product4=new Product(4,"tien4",10003);
        ProductManager arr=new ProductManager();
        arr.add(product2);
        arr.add(product5);
        arr.add(product3);
        arr.add(product1);
        arr.add(product4);
        arr.sortName();
        arr.show();

    }
}