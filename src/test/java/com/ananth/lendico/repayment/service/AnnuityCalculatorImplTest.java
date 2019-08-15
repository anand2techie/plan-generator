package com.ananth.lendico.repayment.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for {@link AnnuityCalculatorImpl}.
 * 
 * @author Ananth
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnuityCalculatorImplTest {
	private AnnuityCalculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new AnnuityCalculatorImpl();
	}

	@Test
	public void shouldCalculateWithValidParameters() {
		BigDecimal loanAmount = new BigDecimal(5000);
		double nominalRate = 5.0;
		int duration = 24;

		BigDecimal annuity = calculator.calculate(loanAmount, nominalRate,
				duration);

		Assert.assertEquals(219.36, annuity.doubleValue(), 0);
	}
}