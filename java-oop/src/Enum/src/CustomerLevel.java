package Enum.src;

public enum CustomerLevel {
    STANDART("Low Edition",1000),
    PREMIUM("Medium Edition",2000),
    VIP("High Edition",3000);

    public String description;
    private Integer price;

    CustomerLevel(String description,Integer price) {
        this.description = description;
        this.price = price;
    }

    public Integer getPrice() {
        return this.price;
    }
}
