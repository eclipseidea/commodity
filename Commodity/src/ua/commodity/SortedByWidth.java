package ua.commodity;

import java.util.Comparator;

public class SortedByWidth implements Comparator<Commodity>{

	@Override
	public int compare(Commodity o1, Commodity o2) {
		
		return o1.getWidht() - o2.getWidht();
	}

}
