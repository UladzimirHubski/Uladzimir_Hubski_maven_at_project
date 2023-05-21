package work.classwork.day20WebServersParser;

import java.util.Objects;

public class Ingredient {


    private int quantity;
    private String itemdescription;

    public Ingredient(int quantity, String itemdescription) {
        this.quantity = quantity;
        this.itemdescription = itemdescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemdescription() {
        return itemdescription;
    }

    public void setItemdescription(String itemdescription) {
        this.itemdescription = itemdescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return quantity == that.quantity && Objects.equals(itemdescription, that.itemdescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quantity, itemdescription);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "quantity=" + quantity +
                ", itemdescription='" + itemdescription + '\'' +
                '}';
    }

}
