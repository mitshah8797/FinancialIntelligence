package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.dao.UserDocumentDAO;
import com.vo.UserDocumentVO;

@Controller

public class UserDocumentController {
	@Autowired
	private UserDocumentDAO userDocumentDAO;

	@RequestMapping(value = "/uploadFile.htm", method = RequestMethod.POST)
	public ModelAndView uploadDocuments(@ModelAttribute UserDocumentVO userDocumentVO,
			@RequestParam("file") List<CommonsMultipartFile> file, HttpSession session) {
		System.out.println("hiii");
		int i = 0;
		int size = file.size();
		while (i < size) {
			String path = session.getServletContext().getRealPath("/");
			String filename = file.get(i).getOriginalFilename();

			System.out.println(path + " " + filename);
		}
		return new ModelAndView("indexCustomer");
	}
}
