import java.text.NumberFormat;

/**
 * Created by Owner on 2/15/2017.
 */
public class Car {

    //instance variable mean every instance will have it's own value
    //I don't set default values here
    String make;//this is declaring a variable
    String model;
    int year;
    double price;

    //Constructor: A method that sets up a new instance of a class
    //Visibility: SHOULD BE PUBLIC
    //STATIC: NEVER
    //RETURN TYPE: NONE, NOT EVEN VOID//A CONSTRUCTOR SKIPS RETURN TYPE
    //THE NAME: ALWAYS THE CLASS NAME(MATCH CASE)
    //ARGUMENT LIST: WILL VARY(INFORMATION USED TO SET UP THE INSTANCE)

    //This is writing a no-argument constructor
    //if you don't write a constructor with a no argument constructor
    //Java supplies a default constructor


    public Car() {//this is a constructor method with no argument
        make = "";//these are local variables
        model = "";
        year = 0;
        price = 0.0;//always start with nothing so set it to zero 0.0
                    //this represents double

    }
        //"all-arguments" constructor
    public Car(String make, String model, int year, double price) {
            //this method is taking argumens and
            //storing their values in the instance variables
            //because the local variables/arguments will run out of scope
            this.make = make;//these are instance variables
            this.model = model;
            this.year = year;
            this.price = price;

    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {

        NumberFormat nf = NumberFormat.getCurrencyInstance();

        return "Car{" +
                "make: " + make + '\'' +
                ", model: " + model + '\'' +
                ", year:" + year + '\'' +
                ", price: " + nf.format(price);
    }
}
