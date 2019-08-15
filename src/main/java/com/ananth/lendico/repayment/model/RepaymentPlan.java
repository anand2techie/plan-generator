package com.ananth.lendico.repayment.model;

import java.util.List;

/**
 * Class that represents a repayment plan.
 * 
 * @author Ananth
 *
 */
public class RepaymentPlan {
	private List<Repayment> repayments;

	/**
	 * Gets the RepaymentPlan's {@code repayments}.
	 *
	 * @return the {@code RepaymentPlan}'s {@code repayments}
	 */
	public List<Repayment> getRepayments() {
		return repayments;
	}

	/**
	 * Sets the RepaymentPlan's {@code repayments}.
	 *
	 * @param repayments
	 *            the {@code RepaymentPlan}'s {@code repayments} to set
	 */
	public void setRepayments(List<Repayment> repayments) {
		this.repayments = repayments;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[repayments=");
		builder.append(repayments);
		builder.append("]");
		return builder.toString();
	}
}