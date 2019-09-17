package com.bluesky.training;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.jsp.tagext.TagSupport;

public class Menu extends TagSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("rawtypes")
	private ArrayList items;
	@SuppressWarnings("unchecked")
	public void addMenuItem(String itemValue) {
		items.add(itemValue);
	}
	
	@SuppressWarnings("rawtypes")
	public int doStartTag() {
		items=new ArrayList();
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() {
		try {
			pageContext.getOut().println("Menu Items:"+items);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return EVAL_PAGE;
	}
	

}
