package com.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.DocumentMappingDAO;
import com.dao.LoanStaffDAO;
import com.dao.PostDAO;
import com.vo.ComplaintVO;
import com.vo.FeedbackVO;
import com.vo.LoanStaffVO;
import com.vo.LoanTypeVO;
import com.vo.PhysicalVerificationVO;
import com.vo.PostVO;
import com.vo.UserVO;

@Controller

public class LoadPageController {
	@Autowired
	private PostDAO postDAO;
	
	@Autowired
	private LoanStaffDAO loanStaffDAO;
	
	@Autowired
	private DocumentMappingDAO documentMappingDAO;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView loadLogin() {
		return new ModelAndView("admin/login");
	}

	@RequestMapping(value = "/loadAddLoanStaff", method = RequestMethod.GET)
	public ModelAndView loadAddLoanStaff() throws SQLException {
		List list = this.postDAO.getAllPost();
		return new ModelAndView("admin/addLoanStaff", "data", new LoanStaffVO()).addObject("list", list);
	}

	@RequestMapping(value = "/loadAddPost", method = RequestMethod.GET)
	public ModelAndView loadAddPost() {
		return new ModelAndView("admin/addPost", "data", new PostVO());
	}

	@RequestMapping(value = "/loadAddLoanType", method = RequestMethod.GET)
	public ModelAndView loadAddLoanType() {
		return new ModelAndView("admin/addLoanType", "data", new LoanTypeVO());
	}

	@RequestMapping(value = "/loadVerification", method = RequestMethod.GET)
	public ModelAndView loadVerification() throws SQLException {
		List list = this.loanStaffDAO.getAllStaff();
		return new ModelAndView("admin/verificationAllocation", "data", new PhysicalVerificationVO()).addObject("list", list);
	}
	
	@RequestMapping(value = "/loadAddComplaint", method = RequestMethod.GET)
	public ModelAndView loadAddComplaint() {
		return new ModelAndView("customer/addComplaint", "data", new ComplaintVO());
	}
	
	@RequestMapping(value = "/loadAddFeedback", method = RequestMethod.GET)
	public ModelAndView loadAddFeedback() {
		return new ModelAndView("customer/addFeedback", "data", new FeedbackVO());
	}

	@RequestMapping(value = "/loadEmiCalc", method = RequestMethod.GET)
	public ModelAndView loadEmiCalc() {
		return new ModelAndView("admin/emiCalc");
	}
	
	@RequestMapping(value = "/loadAddDoc", method = RequestMethod.GET)
	public ModelAndView loadAddDocument() throws SQLException {
		List documentList = this.documentMappingDAO.getRelatedDocuments();
		return new ModelAndView("customer/addDocument", "list", documentList);
	}
	
	@RequestMapping(value = "/loadAddUser", method = RequestMethod.GET)
	public ModelAndView loadAddUser() throws SQLException {
		return new ModelAndView("admin/addUser", "data", new UserVO());
	}
}
