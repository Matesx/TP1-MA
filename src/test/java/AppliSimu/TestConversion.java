package AppliSimu;


import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import DomaineVoiture.Voiture;
import org.junit.Before;
import org.junit.Test;

public class TestConversion {

	@Before
	public void setUp() throws Exception {
	}
	
	@org.junit.Test
	public void testMetrePixel() {
		assertEquals(100,Conversion.calculerPositionPixels(200));
	}

}
