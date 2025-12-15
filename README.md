# Road Trip Cost Estimator (JavaFX)

## Description

The **Road Trip Cost Estimator** is a JavaFX desktop application that calculates the total cost of a road trip based on user-provided travel and expense information. The application allows users to enter trip distance, fuel cost, vehicle mileage, trip duration, and additional expenses such as lodging, food, and attractions.

The program supports **multiple unit systems** (miles/kilometers, gallons/liters) and automatically converts values as needed before computing the final total. This project demonstrates **GUI development with JavaFX**, **event handling**, and **separation of concerns** through a dedicated calculation class.

---

## How It Works

1. The user enters trip details into the graphical interface:

   * Distance and unit (miles or kilometers)
   * Gasoline cost and unit (per gallon or per liter)
   * Gas mileage and unit
   * Number of days
   * Hotel, food, and attractions costs

2. When the **Calculate** button is pressed:

   * The GUI (`Project3.java`) collects all input values.
   * These values are passed to the `TripCost` class.

3. The `TripCost` class:

   * Converts units when necessary (kilometers → miles, liters → gallons).
   * Calculates fuel cost using distance and mileage.
   * Computes lodging and food costs based on number of days.
   * Adds attractions cost to produce the total trip cost.

4. The calculated total is displayed in the **Total Trip Cost** field, formatted to two decimal places.

---

## Program Structure

* **`Project3.java`**

  * Builds the JavaFX graphical user interface
  * Handles user input and button events
  * Displays the final calculated cost
  * Communicates with the `TripCost` class

* **`TripCost.java`**

  * Performs all trip cost calculations
  * Handles unit conversions
  * Encapsulates business logic separately from the GUI

---

## How to Run

1. Ensure Java and JavaFX are properly installed and configured.
2. Place both `.java` files in the same project directory.
3. Compile the program:

   ```bash
   javac Project3.java TripCost.java
   ```
4. Run the application:

   ```bash
   java Project3
   ```
5. Enter trip data and click **Calculate** to view the total cost.

---

## Screenshots

1. **Initial Application Window**

   <img width="439" height="330" alt="Screenshot 2025-12-15 035641" src="https://github.com/user-attachments/assets/301e47a7-eb67-4a92-819d-8915a642ebf3" />

2. **Filled-Out Input Form**

   <img width="439" height="331" alt="Screenshot 2025-12-15 035909" src="https://github.com/user-attachments/assets/ff646c73-af10-45f2-bd2e-6401c0a476d4" />

3. **Unit Selection Example**

   <img width="438" height="331" alt="Screenshot 2025-12-15 035750" src="https://github.com/user-attachments/assets/35fb3475-a264-4baa-b287-724abdce7e6c" />
   <img width="438" height="330" alt="Screenshot 2025-12-15 035737" src="https://github.com/user-attachments/assets/74b6b449-87b1-483c-ae0b-0f7151d4fdf6" />
   <img width="438" height="330" alt="Screenshot 2025-12-15 035724" src="https://github.com/user-attachments/assets/d1e49e56-cf68-4489-b78b-7bba50a2dcd6" />

4. **Calculated Output**

   <img width="439" height="329" alt="Screenshot 2025-12-15 040026" src="https://github.com/user-attachments/assets/53bec122-1ebf-4293-9383-fc8f42ef46f7" />
