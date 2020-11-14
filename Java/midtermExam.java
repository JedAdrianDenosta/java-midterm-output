import java.util.ArrayList;
import java.util.Scanner;

public class midtermExam {
	public static ArrayList<ArrayList<String>> information = new ArrayList();
	public static ArrayList<String> name = new ArrayList<String>();
	public static ArrayList<String> age = new ArrayList<String>();

	public static void main(String[] args) {
		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		boolean value = true;
		while (value) {
			System.out.println("\n\tBasic Information System\n");
			System.out.println("1. Add entry");
			System.out.println("2. Delete entry");
			System.out.println("3. View all entry");
			System.out.println("4. Update an entry");
			System.out.println("5. Exit");

			System.out.print("Pick an option: ");
			int pick = scan.nextInt();

			switch (pick) {
			case 1:
				getEntry();
				break;
			case 2:
				getDelete();
				break;
			case 3:
				getView();
				break;
			case 4:
				getUpdate();
				break;
			case 5:
				exit();
				break;
			default:
				System.out.println("\nYou have entered a wrong number."
						+ "\nTry Again!");
			}
		}
	}

	public static void getEntry() {
		Scanner scan = new Scanner(System.in);

		System.out.println("\n-----Add an Information-----");

		System.out.print("Enter Name: ");
		String addName = scan.nextLine();
		System.out.print("Enter Age: ");
		String addAge = scan.nextLine();

		name.add(addName);
		age.add(addAge);

		System.out.print("\nYou have entered: " + "\n" + addName + " as Name");
		System.out.print("\nYou have entered: " + "\n" + addAge + " as Age");
		System.out.println("\nSuccessfuly stored in the list!");
	}

	public static void getDelete() {
		Boolean foundNum = false;
		Scanner scan = new Scanner(System.in);

		System.out.println("\n-----Delete an information-----");

		System.out.print("Enter the name you want to delete: ");
		String delete = scan.nextLine();

		String index = age.get(name.indexOf(delete));

		for (String element : name) {
			if (element.contains(delete)) {
				foundNum = true;
			}
		}
		if (foundNum) {
			name.remove(delete);
			age.remove(index);
			System.out.println(delete + " has been successfuly deleted");
		} else {
			System.out.println("No " + delete + " found in the list");
		}
	}

	public static void getView() {
		System.out.println("\n-----View all listed information-----");
		System.out.println("The Inserted Information are: ");
		for (int i = 0; i < name.size(); i++) {
			System.out.println((i + 1) + ". Name is " + name.get(i)
					+ " and Age is " + age.get(i));
		}
	}

	public static void getUpdate() {
		System.out.println("\n-----Update an information-----");
		System.out.println("Choices: ");
		int i = 0;
		for (; i < name.size(); i++) {
			System.out.println((i + 1) + ".The Name is " + name.get(i)
					+ " and the Age is " + age.get(i));
		}
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the entry you want to update: ");
		String num = scan.nextLine();
		int entry = Integer.parseInt(num);

		System.out.print("Enter Name: ");
		String uName = scan.nextLine();
		System.out.print("Enter Age: ");
		String uAge = scan.nextLine();

		name.set(entry - 1, uName);
		age.set(entry - 1, uAge);

		System.out.print("The updated name is: " + uName);
		System.out.print("The updated age is: " + uAge);

		System.out.println("\nSuccessfuly updated!");

	}

	public static void exit() {
		System.exit(0);
	}
}
