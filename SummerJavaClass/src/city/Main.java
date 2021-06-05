package city;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		String cityNames = "San Francisco,Los Angeles,New York City,San Diego, Palo Alto";
		// Uses split function to convert cityNames into String array.
		String[] cityNamesArr = cityNames.split(",");
		List<City> cityObjectList = new ArrayList<City>();
		// Loop through cityNames array and instantiates city object with name, then add
		// to city object List.
		for (int i = 0; i < cityNamesArr.length; i++) {
			City city = new City(cityNamesArr[i]);
			city.setCityIndex(i);
			cityObjectList.add(city);
		}
		int arrLength = cityNamesArr.length;
		// Instantiates a 2D array based on length of cityNamesArr
		int[][] cityMap = new int[arrLength][arrLength];
		// Sets values for cityMap.
//		0,10,20,30, 
//		10,0,10,20, 
//		20,10,0,10, 
//		30,20,10,0,
		for (int i = 0; i < arrLength; i++) {
			for (int j = 0; j < arrLength; j++) {
				cityMap[i][j] = Math.abs(j - i) * 10;
				System.out.print(Math.abs(j - i) * 10 + ",");

			}
			System.out.println(" ");
		}
		// Picks two cities in the Object List.
		City[] cityPair = { cityObjectList.get(3), cityObjectList.get(2) };
		// Calls calculateDistance to find distance between cities on 2D array.
		System.out.println(calculateDistance(cityPair, cityMap));

	}

	public static int calculateDistance(City[] cityPair, int[][] cityMap) {
		City city1 = cityPair[0];
		int city1Index = city1.getCityIndex();
		City city2 = cityPair[1];
		int city2Index = city2.getCityIndex();
		// Maps to row and column corresponding to values given by city1, city2. city1
		// is 0, city2 is 3
		// cityMap[0][3] = 5.
		return cityMap[city1Index][city2Index];

	}

}
