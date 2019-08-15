package com.ananth.lendico.repayment.web;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

/**
 * Request parameters for {@code RepaymentRequestController}.
 * 
 * @author Ananth
 *
 */
public class RepaymentPlanRequest {
	private BigDecimal loanAmount;
	private Double nominalRate;
	private Integer duration;

	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
	private Date startDate;

	/**
	 * Gets the RepaymentPlanRequest's {@code loanAmount}.
	 *
	 * @return The RepaymentPlanRequest's {@code loanAmount}
	 */
	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	/**
	 * Gets the RepaymentPlanRequest's {@code nominalRate}.
	 *
	 * @return The RepaymentPlanRequest's {@code nominalRate}
	 */
	public Double getNominalRate() {
		return nominalRate;
	}

	/**
	 * Gets the RepaymentPlanRequest's {@code duration}.
	 *
	 * @return The RepaymentPlanRequest's {@code duration}
	 */
	public Integer getDuration() {
		return duration;
	}

	/**
	 * Gets the RepaymentPlanRequest's {@code startDate}.
	 *
	 * @return The RepaymentPlanRequest's {@code startDate}
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * Sets the RepaymentPlanRequest's {@code loanAmount}.
	 *
	 * @param loanAmount
	 *            The RepaymentPlanRequest's {@code loanAmount} to set
	 */
	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * Sets the RepaymentPlanRequest's {@code nominalRate}.
	 *
	 * @param nominalRate
	 *            The RepaymentPlanRequest's {@code nominalRate} to set
	 */
	public void setNominalRate(Double nominalRate) {
		this.nominalRate = nominalRate;
	}

	/**
	 * Sets the RepaymentPlanRequest's {@code duration}.
	 *
	 * @param duration
	 *            The RepaymentPlanRequest's {@code duration} to set
	 */
	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	/**
	 * Sets the RepaymentPlanRequest's {@code startDate}.
	 *
	 * @param startDate
	 *            The RepaymentPlanRequest's {@code startDate} to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[loanAmount=");
		builder.append(loanAmount);
		builder.append(", nominalRate=");
		builder.append(nominalRate);
		builder.append(", duration=");
		builder.append(duration);
		builder.append(", startDate=");
		builder.append(startDate);
		builder.append("]");
		return builder.toString();
	}
}