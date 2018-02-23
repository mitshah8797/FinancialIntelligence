package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDocumentDAO;

@Controller

public class UserDocumentController {
	@Autowired
	private UserDocumentDAO userDocumentDAO;

	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	public ModelAndView uploadDocuments(@RequestParam("file") List<CommonsMultipartFile> file, HttpSession session) {
		int i = 0;
		while (!file.isEmpty()) {
			String path=session.getServletContext().getRealPath("/");  
	        String filename=file.get(i).getOriginalFilename();
	        
	        System.out.println(path+" "+filename);
		}
		return new ModelAndView("indexCustomer");
	}
}
