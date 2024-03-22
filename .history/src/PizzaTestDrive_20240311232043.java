public class PizzaTestDrive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Create pizza factories
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		while (true) {
			// Display menu
			System.out.println("\n** Pizza Menu **");
			System.out.println("1. NY Style");
			System.out.println("2. Chicago Style");
			System.out.println("3. Exit");

			int storeChoice = Integer.parseInt(scanner.nextLine());

			if (storeChoice < 1 || storeChoice > 3) {
				System.out.println("Invalid choice. Please select again.");
				continue;
			}

			if (storeChoice == 3) {
				break;
			}

			// Display pizza options based on chosen store
			System.out.println("\n** Pizzas available: **");
			switch (storeChoice) {
				case 1:
					System.out.println("  a. Cheese");
					System.out.println("  b. Pepperoni");
					System.out.println("  c. Veggie");
					System.out.println("  d. Clam");
					break;
				case 2:
					System.out.println("  a. Cheese");
					System.out.println("  b. Pepperoni");
					System.out.println("  c. Veggie");
					System.out.println("  d. Clam (limited availability)");
					break;
			}

			System.out.print("Enter your pizza choice (e.g., 1a): ");
			String choice = scanner.nextLine();

			// Extract store and pizza type from user input
			int pizzaChoice = Character.toLowerCase(choice.charAt(choice.length() - 1)) - 'a';
			String pizzaType = choice.substring(0, choice.length() - 1);

			Pizza pizza = null;
			switch (storeChoice) {
				case 1:
					pizza = nyStore.orderPizza(pizzaType);
					break;
				case 2:
					pizza = chicagoStore.orderPizza(pizzaType);
					break;
			}

			if (pizza != null) {
				System.out.println("\n--- Your order ---");
				System.out.println(pizza);
			} else {
				System.out.println("Invalid pizza choice.");
			}
		}

		scanner.close();
	}
}
