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

import com.dao.LoanStaffDAO;
import com.vo.LoanStaffVO;
import com.vo.PostVO;

@Controller

class LoanStaffController {
	@Autowired
	private LoanStaffDAO loanStaffDAO;
	

	@RequestMapping(value = "/insertLoanStaff", method = RequestMethod.POST)
	public ModelAndView insertLoanStaff(@ModelAttribute LoanStaffVO loanStaffVO) throws SQLException {
		this.loanStaffDAO.insertLoanStaff(loanStaffVO);
		return new ModelAndView("redirect: loadAddLoanStaff.htm");
	}
	
	@RequestMapping(value="/loadStaffView", method = RequestMethod.GET)
	public ModelAndView loadStaffView () throws SQLException {
		List staffList = this.loanStaffDAO.getAllStaff();
		return new ModelAndView("admin/viewLoanStaff", "data", staffList);				
	}
	
	@RequestMapping(value="/deleteLoanStaff", method = RequestMethod.POST)
	public ModelAndView deletePost (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		LoanStaffVO loanStaffVO = new LoanStaffVO();
		loanStaffVO.setLoanStaffId(Integer.parseInt(request.getParameter("loanStaffId")));
		this.loanStaffDAO.deleteStaff(loanStaffVO);
		return new ModelAndView("redirect: loadStaffView.htm");				
	}
	
	@RequestMapping(value="/editLoanStaff", method = RequestMethod.POST)
	public ModelAndView editPost (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		LoanStaffVO loanStaffVO = new LoanStaffVO();
		loanStaffVO.setLoanStaffId(Integer.parseInt(request.getParameter("loanStaffId")));
		loanStaffVO.setLoanStaffFirstName(request.getParameter("staffFirstName"));
		loanStaffVO.setLoanStaffLastName(request.getParameter("staffLastName"));
		loanStaffVO.setLoanStaffDescription(request.getParameter("staffDesc"));
		PostVO post = new PostVO();
		post.setPostId(Integer.parseInt(request.getParameter("postId")));
		loanStaffVO.setPost(post);
		return new ModelAndView("admin/addLoanStaff", "data", loanStaffVO);				
	}
}