import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Owner on 2/16/2017.
 */
public class CarApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //find out how many we need
        System.out.println("");


                    System.out.print("How many cars to enter? ");
                int numCar = scan.nextInt();

                //create the ArrayList (empty for now)
                ArrayList<Car> userList = new ArrayList<Car>();


                //make and store the required # of users
                for (int i = 0; i < numCar; i++) {
                    //get the info
                    System.out.print("What is the Make? ");
                    String make = scan.next();


                    System.out.print("What is the user's Model? ");
                    String model = scan.next();

                    System.out.print("What is the user's Year? ");
                    int year = scan.nextInt();

                    System.out.print("Price Range ? ");
                    int priceRange = scan.nextInt();

                    //System.out.print("What portion of the bootcamp " +
                            //"has the user completed? ");
                    //double complete = scan.nextDouble();

                    //create a new instance// = this creates a car object
                    Car car1 = new Car(make, model, year, priceRange);
                    //data/var nme = variable

                    //add it to the ArrayList
                    userList.add(car1);
                }
                System.out.println("Current Inventory: ");
                //go through the users
                for (Car u: userList) {
                    //and output them
                    System.out.println(u);
                    System.out.println(); //skip a line
                }

            }

        }

