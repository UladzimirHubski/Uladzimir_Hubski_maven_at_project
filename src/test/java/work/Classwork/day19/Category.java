package work.Classwork.day19;

public class Category {

    int CategoryID;
    String categoryName;
    String description;

    public Category(int categoryID, String categoryName, String description) {
        CategoryID = categoryID;
        this.categoryName = categoryName;
        this.description = description;
    }


    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
