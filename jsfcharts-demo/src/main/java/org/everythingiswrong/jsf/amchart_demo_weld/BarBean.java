package org.everythingiswrong.jsf.amchart_demo_weld;

import javax.enterprise.inject.Model;

@Model
public class BarBean {
	
	private String[] stackedCategorie = new String[] {"asia", "africa", "europe", "america", "oceanie"};
	private Integer[] year1800  = new Integer[] {107, 31, 635, 203, 2};
	private Integer[] year1900 = new Integer[] {133, 156, 947, 408, 6};
	private Integer[] year2008 = new Integer[] {973, 914, 4054, 732, 34};
	
	private String[] categorie = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas"};
	private Integer[] john = new Integer[] {5, 3, 4, 7, 2};
	private Integer[] jane = new Integer[] {2, -2, -3, 2, 1};
	private Integer[] joe = new Integer[] {3, 4, 4, -2, 5};
	
	public String[] getStackedCategorie() {
		return stackedCategorie;
	}

	public Integer[] getYear1800() {
		return year1800;
	}

	public Integer[] getYear1900() {
		return year1900;
	}

	public Integer[] getYear2008() {
		return year2008;
	}

	public String[] getCategorie() {
		return categorie;
	}

	public Integer[] getJohn() {
		return john;
	}

	public Integer[] getJane() {
		return jane;
	}

	public Integer[] getJoe() {
		return joe;
	}

}
