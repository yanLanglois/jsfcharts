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
	
	private String[] categorieAgePyramid = new String[] {"0-4", "5-9", "10-14", "15-19",
											    "20-24", "25-29", "30-34", "35-39", "40-44",
											    "45-49", "50-54", "55-59", "60-64", "65-69",
											    "70-74", "75-79", "80-84", "85-89", "90-94",
											    "95-99", "100 +"};
	
	private Integer[] male = new Integer[] {-1746181, -1884428, -2089758, -2222362, -2537431, -2507081, -2443179,
            -2664537, -3556505, -3680231, -3143062, -2721122, -2229181, -2227768,
            -2176300, -1329968, -836804, -354784, -90569, -28367, -3878};
	private Integer[] femal = new Integer[] {1656154, 1787564, 1981671, 2108575, 2403438, 2366003, 2301402, 2519874,
            3360596, 3493473, 3050775, 2759560, 2304444, 2426504, 2568938, 1785638,
            1447162, 1005011, 330870, 130632, 21208};
	
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

	public Integer[] getMale() {
		return male;
	}

	public Integer[] getFemal() {
		return femal;
	}

	public String[] getCategorieAgePyramid() {
		return categorieAgePyramid;
	}
	
	

}
