package np_lab.web_service_project.api;

import np_lab.web_service_project.impl.ChooseWord;

public class NorwegianAPI {

	private String norwegianWord, norwegianExample, englishWord, englishExample, category;

	public NorwegianAPI(String category, String norwegianWord, String norwegianExample, String englishWord,
			String englishExample) {
		this.category = category;
		this.norwegianWord = norwegianWord;
		this.norwegianExample = norwegianExample;
		this.englishWord = englishWord;
		this.englishExample = englishExample;

	}

	public String getCategory() {
		return category;
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

}
//String category, String norwegianWord, String norwegianExample, String englishWord,
//String englishExample)
