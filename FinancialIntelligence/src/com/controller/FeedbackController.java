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

import com.dao.FeedbackDAO;
import com.vo.FeedbackVO;
import com.vo.LoginVO;

@Controller

public class FeedbackController {
	@Autowired
	private FeedbackDAO feedbackDAO;

	@RequestMapping(value = "/loadFeedbackView", method = RequestMethod.GET)
	public ModelAndView loadFeedbackView() throws SQLException {
		List feedbackList = this.feedbackDAO.getAllFeedbacks();
		return new ModelAndView("admin/viewFeedback", "data", feedbackList);
	}

	@RequestMapping(value = "/addFeedback", method = RequestMethod.POST)
	public ModelAndView insertFeedback(@ModelAttribute FeedbackVO feedbackVO) throws SQLException {
		LoginVO vo = new LoginVO();
		vo.setLoginId(1);
		feedbackVO.setUser(vo);
		this.feedbackDAO.insertFeedback(feedbackVO);
		return new ModelAndView("redirect:loadAddFeedback.htm");
	}

	/*@RequestMapping(value = "/deleteFeedback", method = RequestMethod.POST)
	public ModelAndView deleteFeedback(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		FeedbackVO feedbackVO = new FeedbackVO();
		feedbackVO.setFeedbackId(Integer.parseInt(request.getParameter("feedbackId")));
		this.feedbackDAO.deleteFeedback(feedbackVO);
		return new ModelAndView("redirect: loadFeedbackView.htm");
	}*/

	@RequestMapping(value = "/editFeedback", method = RequestMethod.POST)
	public ModelAndView editFeedback(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		LoginVO loginVO = new LoginVO();
		FeedbackVO feedbackVO = new FeedbackVO();
		
		feedbackVO.setFeedbackId(Integer.parseInt(request.getParameter("feedbackId")));
		feedbackVO.setFeedbackDescription(request.getParameter("feedbackDesc"));
		
		loginVO.setLoginId(Integer.parseInt(request.getParameter("userId")));
		feedbackVO.setUser(loginVO);
		
		return new ModelAndView("customer/addFeedback", "data", feedbackVO);
	}
	
	@RequestMapping(value = "/loadFeedbackViewCustomer", method = RequestMethod.GET)
	public ModelAndView loadFeedbackViewCustomer() throws SQLException {
		List feedbackList = this.feedbackDAO.getAllFeedbacks();
		return new ModelAndView("customer/viewFeedback", "data", feedbackList);
	}
	
	
}
