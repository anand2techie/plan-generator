package com.ananth.lendico.repayment.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.ananth.lendico.repayment.model.Repayment;
import com.ananth.lendico.repayment.model.RepaymentPlan;

/**
 * Service for repayment plan calculation.
 * 
 * @author Ananth
 *
 */
public interface RepaymentService {

	/**
	 * Generates a repayment plan given the input parameters.
	 * 
	 * @param loanAmount
	 *            The amount of the loan
	 * @param nominalRate
	 *            The nominal interest rate
	 * @param duration
	 *            The duration in months of the loan
	 * @param startDate
	 *            The starting date of the loan
	 * @return The resulting repayment plan for the given input values
	 */
	RepaymentPlan generatePlan(BigDecimal loanAmount,
								double nominalRate,
								int duration, 
								LocalDateTime startDate);

	/**
	 * Calculates the repayment for a given month after the start date. If you
	 * are not sure how to use this method, please consider using
	 * {@link RepaymentService#generatePlan(BigDecimal, double, int, LocalDateTime)
	 * generatePlan(BigDecimal, double, int, LocalDateTime)} instead.
	 * 
	 * @param loanAmount
	 *            The amount of the loan
	 * @param nominalRate
	 *            The nominal interest rate
	 * @param duration
	 *            The duration in months of the loan
	 * @param startDate
	 *            The starting date of the loan
	 * @param initialOutstandingPrincipal
	 *            The initial outstanding principal value
	 * @param monthsAfterStart
	 *            The number of months after the start date
	 * @return The resulting repayment for the given input values
	 */
	Repayment generateRepayment(BigDecimal loanAmount,
								double nominalRate, 
								int duration, 
								LocalDateTime startDate,
								BigDecimal initialOutstandingPrincipal, 
								int monthsAfterStart);
}