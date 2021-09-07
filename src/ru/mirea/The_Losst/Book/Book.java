package ru.mirea.The_Losst.Book;

public class Book {
    private String dateOfCreating;
    private String avtor;
    private String cost;
    private String name;

    public Book(String dateOfCreating, String avtor, String cost, String name) {
        this.dateOfCreating = dateOfCreating;
        this.avtor = avtor;
        this.cost = cost;
        this.name = name;
    }

    public String getDateOfCreating() {
        return dateOfCreating;
    }

    public void setDateOfCreating(String dateOfCreating) {
        this.dateOfCreating = dateOfCreating;
    }

    public String getAvtor() {
        return avtor;
    }

    public void setAvtor(String avtor) {
        this.avtor = avtor;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "dateOfCreating='" + dateOfCreating + '\'' +
                ", avtor='" + avtor + '\'' +
                ", cost='" + cost + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
