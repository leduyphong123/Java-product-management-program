package entity;

import compara.ComparaNameOfProduct;
import compara.ComparaPriceOfProduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    private Object[] arr;
    private int currentSize;
    private int size;

    public ProductManager() {
        this.currentSize = 10;
        arr = new Object[this.currentSize];
        this.size = -1;
    }

    public ProductManager(int currentSize) {
        this.currentSize = currentSize;
        arr = new Object[currentSize];
        this.size = -1;
    }

    public void add(Object element) {
        if (this.isFull()) {
            this.increase();
        }
        size += 1;
        arr[size] = element;
    }

    public Object remove() {
        size -= 1;
        return this.arr[size + 1];
    }

    //    public boolean edit(int id,String name,long price){
//
//    }
    public Object searchId(int id) {
        for (int i = 0; i <= size; i++) {
            Product product = (Product) this.arr[i];
            if (product.getId() == id) {
                return product;
            }
        }
        throw new ArithmeticException("error id khong ton tai");
    }

    public Object searchName(String name) {
        for (int i = 0; i <= size; i++) {
            Product product = (Product) this.arr[i];
            if (product.getName().equals(name)) {
                return product;
            }
        }
        throw new ArithmeticException("error id khong ton tai");
    }

    public Object searchPrice(int price) {
        for (int i = 0; i <= size; i++) {
            Product product = (Product) this.arr[i];
            if (product.getPrice() == price) {
                return product;
            }
        }
        throw new ArithmeticException("error id khong ton tai");
    }
    public int getSize(){
        return this.size;
    }
    private void increase() {
        if (isFull()) {
            this.currentSize = this.currentSize * 2 + 1;
            Object[] newArr = new Object[this.currentSize];
            this.arr = newArr;
        }
    }

    private boolean isFull() {
        return this.size >= this.currentSize - 1;
    }

    private boolean isEmtry() {
        return this.size < 0;
    }
    public void show(){
        for (int i=0;i<=this.size;i++){
            System.out.println(arr[i].toString());
        }
    }
    public void sortName(){
        ComparaNameOfProduct comparaNameOfProduct=new ComparaNameOfProduct();
        List obj=new ArrayList<>();
        for (int i=0;i<=this.size;i++){
            obj.add(this.arr[i]);
        }
        Collections.sort(obj,comparaNameOfProduct);
        for (int i=0;i<obj.size();i++){
            this.arr[i]=obj.get(i);
        }
    }
    public void sortPrice(){
        ComparaPriceOfProduct comparaPriceOfProduct = new ComparaPriceOfProduct();
        List obj = new ArrayList<>();
        for (int i=0;i<=this.size;i++){
            obj.add(this.arr[i]);
        }
        Collections.sort(obj,comparaPriceOfProduct);
        for (int i=0;i<obj.size();i++){
           this.arr[i]=obj.get(i);
        }
    }
}
