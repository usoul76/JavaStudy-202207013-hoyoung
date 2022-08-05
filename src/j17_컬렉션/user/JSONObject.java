package j17_컬렉션.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONObject {

	public static void main(String[] args) {
		
		Map<String, Object> datamap  = new HashMap<String, Object>();
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		
		Map<String, Object>  countmap1 = new HashMap<String, Object>();
		countmap1.put("name", "bulbasaur");
		countmap1.put("url", "https://pokeapi.co/api/v2/pkoemon/1/");
		
		Map<String, Object>  countmap2 = new HashMap<String, Object>();
		countmap2.put("name", "ivysaur");
		countmap2.put("url", "https://pokeapi.co/api/v2/pkoemon/2/");
		
		Map<String, Object>  countmap3 = new HashMap<String, Object>();
		countmap3.put("name", "venusaur");
		countmap3.put("url", "https://pokeapi.co/api/v2/pkoemon/3/");
		
		list.add(countmap1);
		list.add(countmap2);
		list.add(countmap3);
		
		datamap.put("count", 1118);
		datamap.put("next", "https://pokeapi.co/api/v2/pkoemon/?offset-38limit-3");
		datamap.put("previous", "null");
		datamap.put("results", list);
		
		System.out.println(datamap);
		
		

	}

}
