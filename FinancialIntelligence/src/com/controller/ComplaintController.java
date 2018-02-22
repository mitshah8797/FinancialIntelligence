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

import com.dao.ComplaintDAO;
import com.vo.ComplaintVO;
import com.vo.LoginVO;

@Controller

public class ComplaintController {
	@Autowired
	private ComplaintDAO complaintDAO;
	
	@RequestMapping(value="/loadComplaintView", method = RequestMethod.GET)
	public ModelAndView loadPostView () throws SQLException {
		List complaintList = this.complaintDAO.getAllComplaints();
		return new ModelAndView("admin/viewComplaint", "data", complaintList);				
	}
	
	@RequestMapping(value="/loadComplaintViewCustomer", method = RequestMethod.GET)
	public ModelAndView loadPostViewCustomer () throws SQLException {
		List complaintList = this.complaintDAO.getAllComplaints();
		return new ModelAndView("customer/viewComplaint", "data", complaintList);				
	}
	
	@RequestMapping(value = "/addComplaint", method = RequestMethod.POST)
	public ModelAndView insertComplaint(@ModelAttribute ComplaintVO  complaintVO) throws SQLException {
		LoginVO vo = new LoginVO();
		vo.setLoginId(1);
		complaintVO.setUser(vo);
		this.complaintDAO.insertComplaint(complaintVO);
		return new ModelAndView("redirect:loadAddComplaint.htm");
	}
	
	/*@RequestMapping(value="/deleteComplaint", method = RequestMethod.POST)
	public ModelAndView deleteComplaint (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ComplaintVO complaintVO = new ComplaintVO();
		complaintVO.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
		this.complaintDAO.deleteComplaint(complaintVO);
		return new ModelAndView("redirect: loadComplaintView.htm");				
	}*/
	
	@RequestMapping(value="/editComplaint", method = RequestMethod.POST)
	public ModelAndView editComplaint (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		ComplaintVO complaintVO = new ComplaintVO();
		LoginVO loginVO = new LoginVO();
		
		complaintVO.setComplaintId(Integer.parseInt(request.getParameter("complaintId")));
		complaintVO.setComplaintSubject(request.getParameter("complaintSubject"));
		complaintVO.setComplaintDescription(request.getParameter("complaintDesc"));
		
		loginVO.setLoginId(Integer.parseInt(request.getParameter("userId")));
		
		complaintVO.setUser(loginVO);
		return new ModelAndView("customer/addComplaint", "data", complaintVO);				
	}
}
