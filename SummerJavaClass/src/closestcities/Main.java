package closestcities;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> cityNamesList = new ArrayList<String>();
		cityNamesList.add("KC");
		cityNamesList.add("SF");
		cityNamesList.add("SD");
		cityNamesList.add("LA");
		System.out.println(cityNamesList);

		// Instantiates a 2D array based on length of cityNamesArr
		double[][] cityMap = { { 0, 1.1, 4, 1 }, { 6, 0, 2, 6 }, { 5, 3, 0, 7 }, { 3, 7, 2, 0 } };
		findFarthestCity(cityNamesList, cityMap);
		findNearestCities(cityNamesList, cityMap);

	}

	public static void findFarthestCity(List<String> cityNamesList, double[][] cityMap) {

		double max = 0;
		int city1Index = 0;
		int city2Index = 0;
		for (int i = 0; i < cityMap.length; i++) {
			for (int j = 0; j < cityMap.length; j++) {
				if (cityMap[i][j] > max) {
					max = cityMap[i][j];
					city1Index = i;
					city2Index = j;
				}
			}
		}
		String fromCityName = cityNamesList.get(city1Index);
		String toCityName = cityNamesList.get(city2Index);
		System.out.println("Distance from " + fromCityName + " to " + toCityName + " is " + max + " miles ");

	}

	public static void findNearestCities(List<String> cityNamesList, double[][] cityMap) {
		double min = 100;
		int city1Index = 0;
		int city2Index = 0;
		for (int i = 0; i < cityMap.length; i++) {
			for (int j = 0; j < cityMap.length; j++) {
				if (cityMap[i][j] < min && i != j) {
					min = cityMap[i][j];
					city1Index = i;
					city2Index = j;
				}
			}
		}
		String fromCityName = cityNamesList.get(city1Index);
		String toCityName = cityNamesList.get(city2Index);
		System.out.println("Distance from " + fromCityName + " to " + toCityName + " is " + min + " miles ");

	}
}
