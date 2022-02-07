package myPack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void testIsoScattering() {
		Main main = new Main();
		List<Double> list = new ArrayList<Double>();
		list.add((double) 1);
		list.add(2.);
		list.add(9.);
		List<Double> listRes = main.isoScattering(list);
		assertEquals((double) 1., (double) listRes.get(0));
		assertEquals((double) 5., (double) listRes.get(1));
		assertEquals((double) 9., (double) listRes.get(2));

	}

}
