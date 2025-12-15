/*Ashton Chavez
 * Java Project 3
 * February 20, 2024
 * 
 * The TripCost class is a utility class designed to perform the calculations related to the road trip cost.
 *  It contains a method calculateTotalTripCost that takes various input parameters such as distance, 
 * gasoline cost, gas mileage, number of days, hotel cost, food cost, and attractions cost. 
 * The method calculates the total trip cost by converting units if necessary and 
 * applying the specified formulas. This class focuses on encapsulating the logic for trip cost calculations,
 *  allowing for better organization and separation of concerns. 
 * It is used by the Project3 class to retrieve the computed total trip cost.
 */

public class TripCost {

    public double calculateTotalTripCost(double distance, String distanceUnit,
                                         double gasolineCost, String gasolineCostUnit,
                                         double gasMileage, String gasMileageUnit,
                                         int numberOfDays, double hotelCost,
                                         double foodCost, double attractionsCost) {
        // Convert units if necessary
        if (distanceUnit.equals("kilometers")) {
            distance *= 0.621371; // Convert kilometers to miles
        }
        if (gasMileageUnit.equals("kilometers per liter")) {
            gasMileage *= 0.425144; // Convert kilometers per liter to miles per gallon
        }
        if (gasolineCostUnit.equals("dollars per liter")) {
            gasolineCost *= 3.78541; // Convert dollars per liter to dollars per gallon
        }

        // Calculate total trip cost
        double gasCost = (distance / gasMileage) * gasolineCost;
        double accommodationCost = (hotelCost + foodCost) * numberOfDays;
        return gasCost + accommodationCost + attractionsCost;
    }
}