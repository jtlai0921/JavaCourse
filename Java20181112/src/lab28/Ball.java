package lab28;

public class Ball {
    
    private String color;
    private int price;

    public Ball(String color, int price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        Ball b2 = (Ball)obj;
        return (price == b2.price && color.equals(b2.color)) ? true : false;
    }

    @Override
    public int hashCode() {
        return 7 * 11 * price + color.hashCode();
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ball{" + "color=" + color + ", price=" + price + '}';
    }

    
}
