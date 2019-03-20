package np_lab.web_service_project.impl;

import java.sql.SQLException;

import np_lab.web_service_project.database.DatabaseManagement;
import np_lab.web_service_project.database.GetWord;

public class ChooseWord {
	
	private int id;
	private String norwegianWord, norwegianExample, englishWord, englishExample, category;

	public ChooseWord(String category) throws SQLException{
		DatabaseManagement controller = new GetWord();
		
		id = ((GetWord)controller).getID(category);
		
		norwegianWord = ((GetWord)controller).getNorwegianWord(category, id);
		norwegianExample = ((GetWord)controller).getNorwegianExample(category, id);
		englishWord = ((GetWord)controller).getEnglishWord(category, id);
		englishExample = ((GetWord)controller).getEnglishExample(category, id);
		category = ((GetWord)controller).getCategory(category, id);
		
	}
	
	public String getNorwegianWord() {
		return norwegianWord;
	}
	
	public String getNorwegianExample() {
		return norwegianExample;
	}	
	
	public String getEnglishWord() {
		return englishWord;
	}
	
	
	public String getEnglishExample() {
		return englishExample;
	}
		
	public String getCategory() {
		return category;
	}
	
}
