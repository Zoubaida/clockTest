package clockTest;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClockTest {
Clock c = new Clock();

	@Test
	void testChangeModel() {
		assertEquals("2000-01-01",Clock.changeModel()); // S1&S2(Display date)
		
	}
	@Test
	void testReadyToSet() {
		assertEquals("Give time",Clock.ready()); // S1&S3(Give time)
		
	}
	@Test
	void testChangeModel2() {
		assertEquals("00:00:00",Clock.changeModel()); // S2&S1 (Display time)
		
	}
	@Test
	void testSet() {
		assertEquals("00:00:00",Clock.set()); // S3&S1 (Display time)
		
	}
	@Test
	void ReadyToSet2() {
		assertEquals("Give date",Clock.ready()); //S2&S4 (Give date)
		
	}

	@Test
	void testSet2() {
		assertEquals("2000-01-01",Clock.set()); //S4&S2 (Display date)
		
	}
}
