package com.controller;

import java.sql.SQLException;
import java.lang.Math;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoanTypeDAO;

@Controller

public class EMICalcController {
	@Autowired
	private LoanTypeDAO loanTypeDAO;
	
	@RequestMapping(value = "/calculateEMI", method = RequestMethod.POST)
	public ModelAndView calculateEMI(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		int loanId = Integer.parseInt(request.getParameter("loanType"));
		double rate = this.loanTypeDAO.getInterestRate(loanId);
		rate = rate / (12 * 100);
		double downPayment = Double.parseDouble(request.getParameter("loanDownPayment"));
		double principalAmount = Double.parseDouble(request.getParameter("loanAmount")) - downPayment;
		double months = Double.parseDouble(request.getParameter("loanMonths"));	
		double temp = Math.pow(rate+1, months);
		double emi = (principalAmount * rate * temp ) / (temp - 1);
		return new ModelAndView("admin/emiCalc", "emi", emi);
	}
}
