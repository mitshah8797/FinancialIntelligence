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

import com.dao.PhysicalVerificationDAO;
import com.vo.LoanStaffVO;
import com.vo.PhysicalVerificationVO;

@Controller

public class PhysicalVerificationController {
	@Autowired
	private PhysicalVerificationDAO physicalVerificationDAO;
	
	@RequestMapping(value = "/insertVerification", method = RequestMethod.POST)
	public ModelAndView insertLoanStaff(@ModelAttribute PhysicalVerificationVO physicalVerificationVO) throws SQLException {
		this.physicalVerificationDAO.insertVerification(physicalVerificationVO);
		return new ModelAndView("redirect: loadVerification.htm");
	}
	
	@RequestMapping(value = "/verificationView", method = RequestMethod.GET)
	public ModelAndView loadStaffView() throws SQLException {
		List verificationList = this.physicalVerificationDAO.getAllVerificationData();
		return new ModelAndView("admin/viewVerification", "data", verificationList);
	}

	@RequestMapping(value = "/deleteVerificationData", method = RequestMethod.POST)
	public ModelAndView deleteType(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		PhysicalVerificationVO verificationVO = new PhysicalVerificationVO();
		verificationVO.setVerificationId(Integer.parseInt(request.getParameter("verificationId")));
		this.physicalVerificationDAO.deleteVerificationData(verificationVO);
		return new ModelAndView("redirect:verificationView.htm");
	}

	@RequestMapping(value = "/editVerificationData", method = RequestMethod.POST)
	public ModelAndView editType(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		PhysicalVerificationVO verificationVO = new PhysicalVerificationVO();
		verificationVO.setVerificationId(Integer.parseInt(request.getParameter("verificationId")));
		LoanStaffVO staffVO = new LoanStaffVO();
		staffVO.setLoanStaffId(Integer.parseInt(request.getParameter("staffId")));
		verificationVO.setStaffMember(staffVO);
		verificationVO.setVerificationAddress(request.getParameter("verificationAddress"));
		verificationVO.setVerificationDate(request.getParameter("verificationDate"));
		verificationVO.setVerificationTime(request.getParameter("verificationTime"));
		return new ModelAndView("admin/verificationAllocation", "data", verificationVO);
	}

}
