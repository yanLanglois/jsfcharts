package org.everythingiswrong.jsf.jsfchartsdemo;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

@Model
public class AreaBean {
	private Integer[] usa;
	private Integer[] ussr;
	
	private String[] categorie = new String[] {"Apples", "Oranges", "Pears", "Grapes", "Bananas"};
	private Integer[] john = new Integer[] {5, 3, 4, 7, 2};
	private Integer[] jane = new Integer[] {2, -2, -3, 2, 1};
	private Integer[] joe = new Integer[] {3, 4, 4, -2, 5};
	
	private String[] stackedCategorie = new String[] {"1750", "1800", "1850", "1900", "1950", "1999", "2050"};
	private Integer[] asia = new Integer[] {502, 635, 809, 947, 1402, 3634, 5268};
	private Integer[] africa = new Integer[] {106, 107, 111, 133, 221, 767, 1766};
	private Integer[] europe = new Integer[] {163, 203, 276, 408, 547, 729, 628};
	private Integer[] america = new Integer[] {18, 31, 54, 156, 339, 818, 1201};
	private Integer[] oceanie = new Integer[] {2, 2, 2, 6, 13, 30, 46};
	
	
	@PostConstruct
	public void initialize() {
		usa = new Integer[] {null, null, null, null, null, 6, 11, 32, 110, 235, 369, 640, 1005, 1436, 2063, 3057, 4618, 6444, 9822, 15468, 20434, 24126,
                27387, 29459, 31056, 31982, 32040, 31233, 29224, 27342, 26662,
                26956, 27912, 28999, 28965, 27826, 25579, 25722, 24826, 24605,
                24304, 23464, 23708, 24099, 24357, 24237, 24401, 24344, 23586,
                22380, 21004, 17287, 14747, 13076, 12555, 12144, 11009, 10950,
                10871, 10824, 10577, 10527, 10475, 10421, 10358, 10295, 10104};
		ussr = new Integer[] {null, null, null, null, null, null, null , null , null ,null,
                5, 25, 50, 120, 150, 200, 426, 660, 869, 1060, 1605, 2471, 3322,
                4238, 5221, 6129, 7089, 8339, 9399, 10538, 11643, 13092, 14478,
                15915, 17385, 19055, 21205, 23044, 25393, 27935, 30062, 32049,
                33952, 35804, 37431, 39197, 45000, 43000, 41000, 39000, 37000,
                35000, 33000, 31000, 29000, 27000, 25000, 24000, 23000, 22000,
                21000, 20000, 19000, 18000, 18000, 17000, 16000};
	}

	public Integer[] getUsa() {
		return usa;
	}

	public Integer[] getUssr() {
		return ussr;
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

	public String[] getStackedCategorie() {
		return stackedCategorie;
	}

	public Integer[] getAsia() {
		return asia;
	}

	public Integer[] getAfrica() {
		return africa;
	}

	public Integer[] getEurope() {
		return europe;
	}

	public Integer[] getAmerica() {
		return america;
	}

	public Integer[] getOceanie() {
		return oceanie;
	}
	
	
	
}
