package com.xzc.stock.download.core.logic.readfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
@RestController
public class ReadData {
	
	@RequestMapping("/readData")
	public Map<Integer,String> readData() throws IOException, ClassNotFoundException {
		InputStream is = Class.forName(ReadData.class.getName())
				.getResourceAsStream("data2.json");
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String s = null;
		int id = 1;
		Map<Integer, String> map = new HashMap<>();
		while ((s = reader.readLine()) != null) {
			map.put(id++, s);
		}
		return map;
	}
	
//	public static void main(String[] args) throws ClassNotFoundException, IOException{
//		ReadData rd = new ReadData();
//		List<String> list = rd.readData();
//		for(String name : list)
//			System.out.println(name);
//	}
}
