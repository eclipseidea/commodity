package ua.commodity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Commodity {

	private int widht;
	private int length;
	private String name;
	private int price;
	private Generator generator = new Generator();

	public Commodity() {
	}

	public Commodity(int widht, int length, String name, int price) {
		this.widht = widht;
		this.length = length;
		this.name = name;
		this.price = price;
	}

	public int getWidht() {
		return widht;
	}

	public void setWidht(int widht) {
		this.widht = widht;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Commodity [widht=" + widht + ", length=" + length + ", name="
				+ name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + length;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + widht;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commodity other = (Commodity) obj;
		if (length != other.length)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (widht != other.widht)
			return false;
		return true;
	}

	public void showComodity(ArrayList<Commodity> arrayList) {
		for (Commodity com : arrayList) {
			System.out.println(com);
		}
	}

	public Commodity addCommodity() {
		int widht = 10 + (int) (Math.random() * (210 - 10));
		int length = 15 + (int) (Math.random() * (230 - 15));
		int price = 1500 + (int) (Math.random() * (230000 - 1500));
		String name = generator.createName();
		Commodity commodity = new Commodity(widht, length, name, price);
		return commodity;
	}

	public void deleteComodity(ArrayList<Commodity> arrayList) {
		boolean check = false;
		while (!check) {
			String scannerName = generator.inputName();
			Iterator<Commodity> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				Commodity comodity = iterator.next();
				if (comodity.getName().equals(scannerName)) {
					iterator.remove();
					check = true;
				}
			}
		}
	}

	public void changeComodity(ArrayList<Commodity> arrayList,
			Commodity commodity) {
		boolean check = false;
		while (!check) {
			String scannerName = generator.inputName();
			for (int i = 0; i < arrayList.size(); i++) {

				if (arrayList.get(i).getName().equals(scannerName)) {
					int index = arrayList.indexOf(arrayList.get(i));
					arrayList.set(index, commodity.addCommodity());
					check = true;
				}
			}
		}

	}

	public void sortByName(ArrayList<Commodity> arrayList) {
		System.out.println();
		Set<Commodity> treeset = new TreeSet<Commodity>(new SortedByName());
		treeset.addAll(arrayList);
		for (Commodity treesetCommodity : treeset) {
			System.out.println(treesetCommodity);
		}

	}

	public void sortByPrice(ArrayList<Commodity> arrayList) {
		System.out.println();
		Set<Commodity> treeset = new TreeSet<Commodity>(new SortedByPrice());
		treeset.addAll(arrayList);
		for (Commodity treesetCommodity : treeset) {
			System.out.println(treesetCommodity);
		}

	}
	public void sortByWidth(ArrayList<Commodity> arrayList) {
		System.out.println();
		Set<Commodity> treeset = new TreeSet<Commodity>(new SortedByWidth());
		treeset.addAll(arrayList);
		for (Commodity treesetCommodity : treeset) {
			System.out.println(treesetCommodity);
		}

	}
	public void sortByLength(ArrayList<Commodity> arrayList) {
		System.out.println();
		Set<Commodity> treeset = new TreeSet<Commodity>(new SortedByLenght());
		treeset.addAll(arrayList);
		for (Commodity treesetCommodity : treeset) {
			System.out.println(treesetCommodity);
		}

	}
	public void searchByName(ArrayList<Commodity> arrayList){
		boolean check = false;
		while (!check) {
			String scannerName = generator.inputName();
			for (int i = 0; i < arrayList.size(); i++) {
				if (arrayList.get(i).getName().equals(scannerName)) {
					System.out.println(arrayList.get(i));
//					int index = arrayList.indexOf(arrayList.get(i));
//					arrayList.set(index, commodity.addCommodity());
					check = true;
				}
			}
		}
	}
}
