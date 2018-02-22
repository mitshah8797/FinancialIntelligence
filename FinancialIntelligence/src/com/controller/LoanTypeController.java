package com.controller;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.LoanTypeDAO;
import com.vo.LoanTypeVO;

@Controller

class LoanTypeController {
	@Autowired
	private LoanTypeDAO loanTypeDAO;

	@RequestMapping(value = "/insertLoanType", method = RequestMethod.POST)
	public ModelAndView insertLoanStaff(@ModelAttribute LoanTypeVO loanTypeVO) throws SQLException {
		this.loanTypeDAO.insertLoanType(loanTypeVO);
		return new ModelAndView("redirect: loadAddLoanType.htm");
	}

	@RequestMapping(value = "/loanTypeView", method = RequestMethod.GET)
	public ModelAndView loadStaffView() throws SQLException {
		List loanTypeList = this.loanTypeDAO.getAllType();
		return new ModelAndView("admin/viewLoanType", "data", loanTypeList);
	}

	@RequestMapping(value = "/deleteLoanType", method = RequestMethod.POST)
	public ModelAndView deleteType(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setLoanTypeId(Integer.parseInt(request.getParameter("loanTypeId")));
		this.loanTypeDAO.deleteType(loanTypeVO);
		return new ModelAndView("redirect:loanTypeView.htm");
	}

	@RequestMapping(value = "/editLoanType", method = RequestMethod.POST)
	public ModelAndView editType(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		LoanTypeVO loanTypeVO = new LoanTypeVO();
		loanTypeVO.setLoanTypeId(Integer.parseInt(request.getParameter("loanTypeId")));
		loanTypeVO.setLoanTypeName(request.getParameter("loanTypeName"));
		loanTypeVO.setLoanTypeDocumentDetails(request.getParameter("loanTypeDocumentDetails"));
		loanTypeVO.setLoanTypeDescription(request.getParameter("loanTypeDescription"));
		loanTypeVO.setLoanTypeInterest(Double.parseDouble(request.getParameter("loanTypeInterest")));
		return new ModelAndView("admin/addLoanType", "data", loanTypeVO);
	}
}