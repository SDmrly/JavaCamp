package entities;

public class Course {
    private int id;
    private String courseName;
    private double price;
    private Category category;

    public Course() {
    }

    public Course(int id, String courseName, double price, Category category) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
