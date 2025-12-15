/*Ashton Chavez
 * Java Project 3
 * February 20, 2024
 * 
 * The Project3 class is responsible for creating the graphical user interface (GUI) 
 * of the road trip cost estimator application. It utilizes JavaFX to create a window 
 * with various input fields, combo boxes, a "Calculate" button, and an output field 
 * for displaying the total trip cost. The class handles user interactions, 
 * such as button clicks, and communicates with the TripCost class to perform 
 * the actual trip cost calculations.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Project3 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Road Trip Cost Estimator");

        // Create an instance of TripCostCalculator
        TripCost tripCostCalculator = new TripCost();

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // GUI components
        Label distanceLabel = new Label("Distance:");
        grid.add(distanceLabel, 0, 0);
        TextField distanceTextField = new TextField();
        grid.add(distanceTextField, 1, 0);
        ComboBox<String> distanceUnitComboBox = new ComboBox<>();
        distanceUnitComboBox.getItems().addAll("miles", "kilometers");
        distanceUnitComboBox.setValue("miles"); // Default value
        grid.add(distanceUnitComboBox, 2, 0);

        Label gasolineCostLabel = new Label("Gasoline Cost:");
        grid.add(gasolineCostLabel, 0, 1);
        TextField gasolineCostTextField = new TextField();
        grid.add(gasolineCostTextField, 1, 1);
        ComboBox<String> gasolineCostUnitComboBox = new ComboBox<>();
        gasolineCostUnitComboBox.getItems().addAll("dollars per gallon", "dollars per liter");
        gasolineCostUnitComboBox.setValue("dollars per gallon"); // Default value
        grid.add(gasolineCostUnitComboBox, 2, 1);

        Label gasMileageLabel = new Label("Gas Mileage:");
        grid.add(gasMileageLabel, 0, 2);
        TextField gasMileageTextField = new TextField();
        grid.add(gasMileageTextField, 1, 2);
        ComboBox<String> gasMileageUnitComboBox = new ComboBox<>();
        gasMileageUnitComboBox.getItems().addAll("miles per gallon", "kilometers per liter");
        gasMileageUnitComboBox.setValue("miles per gallon"); // Default value
        grid.add(gasMileageUnitComboBox, 2, 2);

        Label numberOfDaysLabel = new Label("Number Of Days:");
        grid.add(numberOfDaysLabel, 0, 3);
        TextField numberOfDaysTextField = new TextField();
        grid.add(numberOfDaysTextField, 1, 3);

        Label hotelCostLabel = new Label("Hotel Cost:");
        grid.add(hotelCostLabel, 0, 4);
        TextField hotelCostTextField = new TextField();
        grid.add(hotelCostTextField, 1, 4);

        Label foodCostLabel = new Label("Food Cost:");
        grid.add(foodCostLabel, 0, 5);
        TextField foodCostTextField = new TextField();
        grid.add(foodCostTextField, 1, 5);

        Label attractionsLabel = new Label("Attractions:");
        grid.add(attractionsLabel, 0, 6);
        TextField attractionsTextField = new TextField();
        grid.add(attractionsTextField, 1, 6);

        Button calculateButton = new Button("Calculate");
        grid.add(calculateButton, 1, 7);

        Label totalTripCostLabel = new Label("Total Trip Cost:");
        grid.add(totalTripCostLabel, 0, 8);
        TextField totalTripCostTextField = new TextField();
        totalTripCostTextField.setEditable(false);
        grid.add(totalTripCostTextField, 1, 8);

        calculateButton.setOnAction(e -> {
            // Call the calculateTotalTripCost method from TripCostCalculator
            double totalTripCost = tripCostCalculator.calculateTotalTripCost(
                    Double.parseDouble(distanceTextField.getText()),
                    distanceUnitComboBox.getValue(),
                    Double.parseDouble(gasolineCostTextField.getText()),
                    gasolineCostUnitComboBox.getValue(),
                    Double.parseDouble(gasMileageTextField.getText()),
                    gasMileageUnitComboBox.getValue(),
                    Integer.parseInt(numberOfDaysTextField.getText()),
                    Double.parseDouble(hotelCostTextField.getText()),
                    Double.parseDouble(foodCostTextField.getText()),
                    Double.parseDouble(attractionsTextField.getText())
            );

            totalTripCostTextField.setText(String.format("%.2f", totalTripCost));
        });

        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}