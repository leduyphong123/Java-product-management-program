package compara;

import entity.Product;

import java.util.Comparator;

public class ComparaPriceOfProduct implements Comparator<Product> {
    @Override
    public int compare(Product p1,Product p2){
        if(p1.getPrice()>p2.getPrice()){
            return 1;
        }else if(p1.getPrice()==p2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
