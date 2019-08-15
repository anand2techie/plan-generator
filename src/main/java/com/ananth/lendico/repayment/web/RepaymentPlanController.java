package com.ananth.lendico.repayment.web;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import com.ananth.lendico.repayment.model.RepaymentPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ananth.lendico.repayment.model.Repayment;
import com.ananth.lendico.repayment.service.RepaymentService;

/**
 * A web controller for generating repayment plans.
 * 
 * @author Ananth
 *
 */
@Controller
@RequestMapping("/generate-plan")
public class RepaymentPlanController {

	@Autowired
	private RepaymentService service;

	@PostMapping
	public @ResponseBody List<Repayment> generatePlan(
			@RequestBody RepaymentPlanRequest request) {
		
		/* Obtain the request parameters. */
		BigDecimal loanAmount = request.getLoanAmount();
		Double nominalRate = request.getNominalRate();
		Integer duration = request.getDuration();
		
		Date startDate = request.getStartDate();
		Instant instant = startDate.toInstant();
		ZoneId zone = ZoneId.systemDefault();
		LocalDateTime localStartDate = LocalDateTime.ofInstant(instant, zone);
		
		/* Delegates the execution to the service. */
		RepaymentPlan plan = service.generatePlan(loanAmount, nominalRate,
				duration, localStartDate);
		List<Repayment> repayments = plan.getRepayments();
		
		return repayments;
	}
}