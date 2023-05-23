package entity;

public class Product {
    private int id = 0;
    private String name;
    private long price;

    public Product() {
    }

    public Product(int id,String name, long price) {
        this.id =id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "id: " + this.getId() + " - name: " + this.getName() + " - price: " + this.getPrice();
    }
}
