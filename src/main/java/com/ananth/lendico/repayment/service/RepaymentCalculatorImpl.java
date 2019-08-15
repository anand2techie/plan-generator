package com.ananth.lendico.repayment.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

/**
 * Simple implementation of {@link RepaymentCalculator}.
 * 
 * @author Ananth
 *
 */
@Service
public class RepaymentCalculatorImpl implements RepaymentCalculator {

	@Override
	public BigDecimal calculateRemainingOutstandingPrincipal(
			BigDecimal initialOutstandingPrincipal, BigDecimal principal) {

		/* Calculates the remaining outstanding principal. */
		BigDecimal remainingOutstandingPrincipal;
		remainingOutstandingPrincipal = initialOutstandingPrincipal
				.subtract(principal);

		/* Since the value cannot be negative, it is set to zero instead. */
		if (remainingOutstandingPrincipal.compareTo(BigDecimal.ZERO) < 0) {
			remainingOutstandingPrincipal = BigDecimal.ZERO.setScale(2);
		}

		return remainingOutstandingPrincipal;
	}

	@Override
	public BigDecimal calculatePrincipal(BigDecimal interest,
			BigDecimal annuity) {

		BigDecimal principal = annuity.subtract(interest);
		principal = principal.setScale(2, BigDecimal.ROUND_HALF_EVEN);
		return principal;
	}

	@Override
	public BigDecimal calculateInterest(double nominalRate,
			BigDecimal initialOutstandingPrincipal) {

		/* Calculates the interest. */
		BigDecimal interest = new BigDecimal(
				nominalRate * 30 * initialOutstandingPrincipal.doubleValue()
						/ 360);

		/* Divides by 100 and rounds it with the default rounding method. */
		interest = interest.divide(new BigDecimal(100)).setScale(2,
				BigDecimal.ROUND_HALF_EVEN);

		return interest;
	}
}