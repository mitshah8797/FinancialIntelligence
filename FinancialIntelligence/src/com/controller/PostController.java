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

import com.dao.PostDAO;
import com.vo.PostVO;

@Controller

class PostController {
	@Autowired
	private PostDAO postDAO;

	@RequestMapping(value="/loadPostView", method = RequestMethod.GET)
	public ModelAndView loadPostView () throws SQLException {
		List postList = this.postDAO.getAllPost();
		return new ModelAndView("admin/viewPost", "data", postList);				
	}
	
	@RequestMapping(value="/insertPost", method = RequestMethod.POST)
	public ModelAndView addPost (@ModelAttribute PostVO postVO) throws SQLException {
		this.postDAO.insertPost(postVO);
		return new ModelAndView("redirect: loadAddPost.htm");				
	}
	
	@RequestMapping(value="/deletePost", method = RequestMethod.POST)
	public ModelAndView deletePost (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		PostVO postVO = new PostVO();
		postVO.setPostId(Integer.parseInt(request.getParameter("postId")));
		this.postDAO.deletePost(postVO);
		return new ModelAndView("redirect: loadPostView.htm");				
	}
	
	@RequestMapping(value="/editPost", method = RequestMethod.POST)
	public ModelAndView editPost (HttpServletRequest request, HttpServletResponse response) throws SQLException {
		PostVO postVO = new PostVO();
		postVO.setPostId(Integer.parseInt(request.getParameter("postId")));
		postVO.setPostName(request.getParameter("postName"));
		postVO.setPostDescription(request.getParameter("postDesc"));
		return new ModelAndView("admin/addPost", "data", postVO);				
	}
}