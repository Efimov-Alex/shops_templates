public class Product {
    private String name;
    private int rating = 0;
    private int count;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public void raisingRating() {
        this.rating += 1;
    }

    public void decreaseCount() {
        this.count += 1;
    }

    public void increaseCount() {
        this.count += 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
