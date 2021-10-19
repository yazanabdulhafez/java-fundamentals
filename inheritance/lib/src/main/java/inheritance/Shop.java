package inheritance;


public class Shop extends Place {

private String description;


    public Shop(String name,String description) {
        super(name);
        this.description=description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString(){
return "[name: "
        +getName()
        +" description: "
        + getDescription()
        +" price: "
        +getPriceCategory()
        +" reviews: " +getReviews()+"]";
    }
}
