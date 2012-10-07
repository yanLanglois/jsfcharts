package org.everythingiswrong.jsf.jsfchartsdemo;

import javax.enterprise.inject.Model;

@Model
public class LogarithmicBean {

	private Integer[] data = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512};
	
	public Integer[] getData() {
		return data;
	}
}
