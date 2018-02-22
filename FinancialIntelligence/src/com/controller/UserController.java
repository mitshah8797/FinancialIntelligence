package com.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDAO;
import com.vo.LoginVO;
import com.vo.UserVO;

@Controller

public class UserController {
	@Autowired
	private UserDAO userDAO;
	
	@RequestMapping(value="/insertUser", method = RequestMethod.POST)
	public ModelAndView addUser (@ModelAttribute UserVO userVO) throws SQLException {
		LoginVO loginVO = userVO.getLogin();
		loginVO.setEnabled("1");
		userVO.setLogin(loginVO);
		this.userDAO.insertUser(userVO);
		return new ModelAndView("redirect:loadAddUser.htm");				
	}
}
