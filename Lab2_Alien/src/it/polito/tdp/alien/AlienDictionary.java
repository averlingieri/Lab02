package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	private List<Word> dic;

	public AlienDictionary() {
		this.dic = new ArrayList<>();
	}
	
	public void addWord(String alienWord, String translation) {
		 
		for (Word w: this.dic)
			 if (w.getAlienWord().equals(alienWord)){
				 w.setTranslation(translation);
				 return;
			 }

		 
		 Word new_w = new Word();
		 new_w.setAlienWord(alienWord);
		 new_w.setTranslation(translation);;
		 dic.add(new_w);
	}
	
	public String translateWord(String alienWord){
		for (Word w: this.dic){
			if(w.getAlienWord().equals(alienWord)){ 
				return w.getTranslation();
			}
				
		}
		return null;
	}
	
}
