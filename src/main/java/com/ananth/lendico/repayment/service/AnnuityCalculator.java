package com.ananth.lendico.repayment.service;

import java.math.BigDecimal;

/**
 * Annuity calculator based on the formula available at
 * <a href="http://financeformulas.net/Annuity_Payment_Formula.html">Annuity
 * Payment (PV) formula and calculator</a>.
 * 
 * @author Ananth
 *
 */
public interface AnnuityCalculator {

	/**
	 * Calculates the annuity based on the three input parameters.
	 * 
	 * @param loanAmount
	 *            The amount of the loan
	 * @param nominalRate
	 *            The nominal interest rate
	 * @param duration
	 *            The duration in months of the loan
	 * @return The annuity value to be paid every month
	 */
	BigDecimal calculate(BigDecimal loanAmount, double nominalRate,
			int duration);
}