package firstwindowbuilder;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SearchCity {
	
	public String city;
	public String state;
	
	public SearchCity(String state, String city) {
		city = city;
		state = state;
		
		try {
			Document doc = Jsoup.connect("https://www.wunderground.com/weather/us/" + state + "/" + city).userAgent("mozilla/17.0").get();
			Elements temp = doc.select("div.current-temp");
			String current_temp = temp.text();
			JOptionPane.showMessageDialog(null, city + ":\n" + current_temp);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
