package ua.commodity;

import java.util.Comparator;

public class SortedByLenght implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getLength() - o2.getLength();
	}

}
