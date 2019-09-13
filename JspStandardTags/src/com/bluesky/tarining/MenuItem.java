package com.bluesky.tarining;

import javax.servlet.jsp.tagext.TagSupport;



public class MenuItem extends TagSupport {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String itemValue;
	
	public void setItemValue(String value) {
		itemValue=value;
	}

	public int doStartTag() {
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag() {
		Menu parent;
		parent=(Menu)getParent();
		parent.addMenuItem(itemValue);
		return EVAL_PAGE;
		
	}
}
