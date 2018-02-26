package com.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
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
		System.out.println("hiii");
		int i = 0;
		int size = file.size();
		System.out.println(size);
		while (i < size) {
			String path = session.getServletContext().getRealPath("/");
			String filename = file.get(i).getOriginalFilename();
			
			try{  
		        byte barr[] = file.get(i).getBytes();  
		          
		        System.out.println(path+"doc//"+filename);
		        BufferedOutputStream bout=new BufferedOutputStream(new FileOutputStream(path+"\\doc\\"+filename));  
		        bout.write(barr);  
		        bout.flush();  
		        bout.close();	        
		        }
		        catch(Exception e)
		        {
		        	e.printStackTrace();
		        }
			i++;
		}
		return new ModelAndView("customer/indexCustomer");
	}
}
