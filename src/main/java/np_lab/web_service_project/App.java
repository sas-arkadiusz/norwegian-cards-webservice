package np_lab.web_service_project;

import java.sql.SQLException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import np_lab.web_service_project.api.*;
import np_lab.web_service_project.impl.ChooseWord;

@RestController

public class App {

	/*
	 * private static final String template = "City: %s";
	 * 
	 * private static String weather = "sunny"; private static String temperature =
	 * "15'C";
	 * 
	 * @RequestMapping("/weather") public Weather weather(@RequestParam(value =
	 * "name", defaultValue = "World") String name) { if (name.equals("Bydgoszcz"))
	 * { return new Weather(String.format(template, name), weather, temperature); }
	 * return null; }
	 */

	private static final String template = "%s";
	private String norwegianWord, norwegianExample, englishWord, englishExample, category;

	@RequestMapping("/norwegian")
	public NorwegianAPI NorwegianAPI(@RequestParam(value = "name", defaultValue = "default") String name)
			throws SQLException {

		if (name.equals("fruits")) {
			ChooseWord controller = new ChooseWord("fruits");
			norwegianWord = controller.getNorwegianWord();
			norwegianExample = controller.getNorwegianExample();
			englishWord = controller.getEnglishWord();
			englishExample = controller.getEnglishExample();
			return new NorwegianAPI(String.format(template, name), norwegianWord, norwegianExample, englishWord,
					englishExample);
		}

		return null;
	}

}
