package myPack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//Update MAven project : alt-F5
public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		List<Double> list = new ArrayList<Double>();
		list.add((double) 1);
		list.add(2.);
		list.add(9.);
		List<Double> listRes = main.isoScattering(list);
		listRes.toString();
	}

	public List<Double> isoScattering(List<Double> ld) {
		Collection<Double> resColl = Collections.emptyList();
		int[] tab = new int[5];
		// Array<Double>ar=new Array(10);

		List<Double> resList = new ArrayList<Double>();
		double min3 = Collections.min(ld);
		double max3 = Collections.max(ld);
		int nb = ld.size();
		System.out.println("nb=" + nb);
		// double min=resColl.
		double eps = (max3 - min3) / (nb - 1);
		System.out.println("eps=" + eps);
		for (double i = min3; i <= max3; i += eps) {
			System.out.println("i=" + i);
			resList.add(i);
		}
		return resList;
	}

	/**
	 * http://www.codeurjava.com/2015/11/minimum-et-maximum-dun-tableau-en-java.html
	 */
	public void max_array_java8(int[] tab) {
		OptionalInt max = Arrays.stream(tab).max();
		// ou
		OptionalInt max2 = IntStream.of(tab).max();
	}

	/**
	 * http://www.codeurjava.com/2015/11/minimum-et-maximum-dun-tableau-en-java.html
	 */
	public void min_array_java8(int[] tab) {
		OptionalInt min = Arrays.stream(tab).min();
		// ou
		OptionalInt min2 = IntStream.of(tab).min();
	}
}
