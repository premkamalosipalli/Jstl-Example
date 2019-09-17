package com.bluesky.training;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest1 extends SimpleTagSupport {

	public void doTag() throws IOException, JspException {
		String[] movies = { "abc", "ABC", "123" };
		getJspContext().getOut().println("simple custom tag sample example with out body.\n");
		for (int i = 0; i < movies.length; i++) {
			getJspContext().setAttribute("message", movies[i]);
		}
		getJspBody().invoke(null);
	}

}
