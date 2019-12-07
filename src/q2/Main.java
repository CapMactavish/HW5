package q2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int input=0;
		
		Person p1 = new Person();
		Address a1 = new Address("tehran", "tehransar", 4, 21);
		p1.setFirstName("ahmad");
		p1.setLastName("ahmadi");
		p1.setAge(25);
		p1.setAddress(a1);
		people.add(p1);
		
		Person p2 = new Person();
		Address a2 = new Address("tehran", "azadi", 5, 21);
		p2.setFirstName("majid");
		p2.setLastName("rezaei");
		p2.setAge(46);
		p2.setAddress(a2);
		people.add(p2);
		
		Person p3 = new Person();
		Address a3 = new Address("urmia", "sheikh", 3, 44);
		p3.setFirstName("mohammad");
		p3.setLastName("parsa");
		p3.setAge(33);
		p3.setAddress(a3);
		people.add(p3);
		
		Person p4 = new Person();
		Address a4 = new Address("tehran", "ajodanieh", 1, 21);
		p4.setFirstName("saam");
		p4.setLastName("raadbeh");
		p4.setAge(29);
		p4.setAddress(a4);
		people.add(p4);
		
		outer: while (true) {
			System.out.println("what do you want to do?\n1-sort by age\n2-sort by lenght of name\n3-add Person\n10-exit\n");
			input = scanner.nextInt();
			switch (input) {
			case 1:
				sortByAgeList(people);
				break;
			case 2:
				sortBylastName(people);
				break;
			case 3:
				addPerson(people, scanner);
				break;
			case 10:
				System.out.println("nice to had you in this program!");
				break outer;
			default:
				break;
			}
		}
		
		
		
	}

	private static void addPerson(ArrayList<Person> people, Scanner scanner) {
		
		Person sampleToAdd = new Person();
		Address sampleAdd = new Address();
		System.out.println("please enter first name:");
		sampleToAdd.setFirstName(scanner.nextLine());
		System.out.println("please enter last name:");
		sampleToAdd.setLastName(scanner.nextLine());
		System.out.println("please enter age:");
		sampleToAdd.setAge(scanner.nextInt());
		System.out.println("please enter city:");
		sampleAdd.setCity(scanner.nextLine());
		System.out.println("please enter Street:");
		sampleAdd.setStreet(scanner.nextLine());
		System.out.println("please enter zone:");
		sampleAdd.setZone(scanner.nextInt());
		System.out.println("please enter PostalCode:");
		sampleAdd.setPostalCode(scanner.nextInt());
		sampleToAdd.setAddress(sampleAdd);
		people.add(sampleToAdd);
	}

	private static void sortBylastName(ArrayList<Person> people) {
		System.out.println("now:");
		people.sort(Comparator.comparing(Person::getlengthOfLastName));
		
		for (Person y : people) {
			System.out.print(y.getFirstName()+y.getLastName()+"\t");
			System.out.println(y.getlengthOfLastName());
		}
	}

	private static void sortByAgeList(ArrayList<Person> people) {
		for (Person y : people) {
			System.out.println(y.getAge());
		}
		System.out.println("now:");
		people.sort(Comparator.comparing(Person::getAge));
		
		for (Person y : people) {
			System.out.print(y.getFirstName()+y.getLastName()+"\t");
			System.out.println(y.getAge());
		}
	}
}
