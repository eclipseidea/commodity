package ua.commodity;

import java.util.UUID;

import ua.commodity.Main_Commodity;

public class Generator {
	
	public String createName(){
		String name = UUID.randomUUID().toString().replaceAll("[^a-zA-Z]", "").toUpperCase();
		return name;
	}
    
	public String inputName(){
		System.out.println("Enter name: ");
		String inputName = Main_Commodity.scanner.next();
		return inputName;
		
	}
}
