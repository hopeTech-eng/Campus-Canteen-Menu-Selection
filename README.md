# Campus Canteen Order System

A Java Swing desktop application for placing and pricing orders at a campus canteen. The user picks a menu item, a drink, optional water and any special requests, then views the order, the total amount due, or a printed-style report.

Built with Java Swing and the NetBeans GUI Builder.

## Features

- **Menu selection** from a scrollable list of food items
- **Drink selection** using radio buttons (only one drink can be chosen)
- **Water** option via a checkbox
- **Special requests** entered in a text field
- **Place Order**: shows the current order in a message box
- **Amount Due**: calculates the total and shows it in a message box
- **Print Order**: writes a full order report, including the amount due, into the text area
- **Exit**: closes the application
- **Input validation**: warns the user if a menu item or drink has not been selected

## Price List

| Item           | Price |
|----------------|-------|
| Chicken Salad  | R20   |
| Club Sandwich  | R17   |
| Burger         | R28   |
| Vegetable Wrap | R12   |
| Pie            | R15   |
| Milkshake      | R17   |
| Fresh Juice    | R7    |
| Cool Drink     | R12   |
| Tea            | R10   |
| Coffee         | R10   |

Water is free and does not affect the total.

## Example

**Order:** Club Sandwich, Fresh Juice, Water, special request "No sauce"

**Print Order output:**

```
Menu Choice: Club Sandwich
Special Request: No sauce
Drink: Fresh Fruit Juice
Water

Amount Due: R 24.0
```

## Getting Started

### Run with NetBeans

1. Clone the repository:
   ```bash
   git clone https://github.com/<your-username>/<your-repo-name>.git
   ```
2. In NetBeans, choose **File → Open Project** and select the cloned folder.
3. Right-click `CanteenGUI.java` and choose **Run File** (or press `Shift + F6`).

### Run from the command line

From the folder that contains the `CampusCanteen` package directory:

```bash
javac CampusCanteen/CanteenGUI.java
java CampusCanteen.CanteenGUI
```

## Usage

1. Select a food item from **Menu Selection**.
2. Choose a drink under **Drink Selection**.
3. Tick **Water** if wanted, and type any **Special Requests**.
4. Use the menus:
   - **File → Place Order** to view the current order
   - **Print Order → Amount Due** to see the total
   - **Print Order → Print Order** to generate the report in the text area
   - **File → Exit** to close the program

## Project Structure

```
CampusCanteen/
└── CanteenGUI.java     # Main window: UI layout, event handlers and price calculation
```

## How It Works

- `PlaceOrderActionPerformed` reads the selected menu item, drink, water option and special request, validates them, and displays them in a `JOptionPane`.
- `AmountDueActionPerformed` adds the food price (via a `switch` on the selected item) to the drink price (via an `if / else if` chain on the radio buttons) and displays the total.
- `PrintOrderActionPerformed` builds the order report line by line in the text area, reusing a shared `calculateTotal()` helper so prices are defined in one place.
- `ExitActionPerformed` ends the program with `System.exit(0)`.

## Roadmap

- [ ] Implement **Save Order** (write the order to a file)
- [ ] Store prices in a `Map` or enum instead of `switch` statements
- [ ] Support multiple items per order
- [ ] Add screenshots to this README

## Author

HOPE

