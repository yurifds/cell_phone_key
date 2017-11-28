package test;

import static org.junit.Assert.*;

import org.junit.Test;

import sequence.NumberSequence;

public class SequenceTest {
	
	@Test
	public void shouldReturnSequence(){
		NumberSequence numberSequence = new NumberSequence();
		String sequence = numberSequence.getSequence("CHALLENGE SOLVED");
		assertEquals("222442555_55533664330777766655588833_3", sequence);
	}
}
