import java.util.Scanner;

public class PizzaTestDrive {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Pizza stores
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		while (true) {
			// Display menu
			System.out.println("\n** Pizza Menu **");
			System.out.println("1. NY Style");
			System.out.println("2. Chicago Deep Dish");
			System.out.println("3. Exit");
			System.out.println("Genaro Damian Martinez Perez");

			int storeChoice = Integer.parseInt(scanner.nextLine());

			if (storeChoice < 1 || storeChoice > 3) {
				System.out.println("Invalid choice. Please select again.");
				System.out.println("Genaro Damian Martinez Perez");
				continue;
			}

			if (storeChoice == 3) {
				break;
			}
			System.out.print("Enter your pizza choice (Cheese, Pepperoni, Veggie, Clam): \n");
			System.out.println("Genaro Damian Martinez Perez");
			String pizzaType = scanner.nextLine();

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
				System.out.println("Genaro Damian Martinez Perez");
				System.out.println(pizza);
			} else {
				System.out.println("Invalid pizza choice.");
				System.out.println("Genaro Damian Martinez Perez");
			}
		}

		scanner.close();
	}
}
