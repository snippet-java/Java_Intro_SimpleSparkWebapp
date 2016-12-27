package com.ibm.sample;

import static spark.Spark.*;
import spark.servlet.SparkApplication;

public class Main implements SparkApplication {
	    @Override
	    public void init() {	    	 
	    	 get("/", (req, res) -> {
	    		 res.type("text/html");
	    		 String html = "";
	    		 html += "<HTML><TITLE>TEST-SimpleSparkWebApp</TITLE><BODY>";
	    		 html += "<H2>Java Spark Example - SimpleSparkWebApp</H2><HR>";
	    		 html += "<H4>This is about as simple a spark webapp as it gets!</H4>";
	    		 html += "<p>Refer <a href=\"http://sparkjava.com/\">spark java</a> for more information.</p>";
	    		 html += "</BODY><HTML>";
	    		 return html;
	    	 });
	    }
    
}