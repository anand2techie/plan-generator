package com.ananth.lendico.repayment.service;

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit tests for {@link RepaymentCalculator}.
 * 
 * @author Ananth
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RepaymentCalculatorImplTest {
	private RepaymentCalculator calculator;

	@Before
	public void setUp() throws Exception {
		calculator = new RepaymentCalculatorImpl();
	}

	@Test
	public void shouldCalculateRemainingOutstandingPrincipal() {
		BigDecimal initialOutstandingPrincipal = new BigDecimal(5000);
		BigDecimal principal = new BigDecimal(198.53);

		BigDecimal remainingOutstandingPrincipal = calculator
				.calculateRemainingOutstandingPrincipal(
						initialOutstandingPrincipal, principal);
		Assert.assertEquals(4801.47,
				remainingOutstandingPrincipal.doubleValue(), 0);
	}

	@Test
	public void shouldCalculatePrincipal() {
		BigDecimal interest = new BigDecimal(20.83);
		BigDecimal annuity = new BigDecimal(219.36);

		BigDecimal principal = calculator.calculatePrincipal(interest, annuity);
		Assert.assertEquals(198.53, principal.doubleValue(), 0);
	}

	@Test
	public void shouldCalculateInterest() {
		double nominalRate = 5.0;
		BigDecimal initialOutstandingPrincipal = new BigDecimal(5000);

		BigDecimal interest = calculator.calculateInterest(nominalRate,
				initialOutstandingPrincipal);
		Assert.assertEquals(20.83, interest.doubleValue(), 0);
	}
}