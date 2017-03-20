package ua.commodity;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Commodity {

	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Commodity commodity = new Commodity();
		ArrayList<Commodity> arrayList = new ArrayList<Commodity>();

		System.out.println("Enter number from 1 to 9 to select menu option:");
		System.out.println("       1 - to add commodity");
		System.out.println("       2 - to remove commodity");
		System.out.println("       3 - to change commodity");
		System.out.println("       4 - to sort commodity by name");
		System.out.println("       5 - to sort commodity by length");
		System.out.println("       6 - to sort commodity by width");
		System.out.println("       7 - to sort commodity by price");
		System.out.println("       8 - to i el of commodity");
		System.out.println("       9 - to exit");

		boolean check = true;
		while (check) {
			if (scanner.hasNext()) {
				String menuOption = scanner.nextLine().replaceAll("[^0-9]", "");
				if(menuOption.length()==0){
				   System.out.println("Enter number from 1 to 9 to select menu option:");
				}else{
				int intMenuOption = Integer.parseInt(menuOption);
				if (intMenuOption >= 1 && intMenuOption <= 9) {
					switch (menuOption) {
					case "1":
						arrayList.add(commodity.addCommodity());
						commodity.showComodity(arrayList);
						break;
					case "2":
						commodity.deleteComodity(arrayList);
						commodity.showComodity(arrayList);
						break;
					case "3":
						commodity.changeComodity(arrayList, commodity);
						commodity.showComodity(arrayList);
						break;
					case "4":
						commodity.sortByName(arrayList);
						break;
					case "5":
						commodity.sortByLength(arrayList);
						break;
					case "6":
						commodity.sortByWidth(arrayList);
						break;
					case "7":
						commodity.sortByPrice(arrayList);
						break;
					case "8":
						commodity.searchByName(arrayList);
						break;
					case "9":
						System.exit(0);
						check = false;
						break;

					}
				} else {
					System.out
							.println("Enter number from 1 to 9 to select menu option:");
				}
				}
			}
		}
	}
}
