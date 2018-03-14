package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	AlienDictionary al_dic = new AlienDictionary();
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	
    	//if (){
    		String txt_inserito = txtWord.getText().toLowerCase();
    		String[] items = txt_inserito.split(" ");
    		if(items.length == 0){
    			txtResult.appendText("Non hai inserito nessuna parola!\n");
    		}
    	
    		else if (items.length == 1){
    			txtResult.appendText("Parola aliena: " + items[0] + " Traduzione: " + al_dic.translateWord(items[0]) + "\n");
    		}
    	
    		else if (items.length == 2){
    			al_dic.addWord(items[0], items[1]);
    			txtResult.appendText("Parola aliena: " + items[0] + " Traduzione aggiornata: " + items[1] + "\n");
    		}
    	
    		else
    			txtResult.appendText("Hai inserito troppe parole.\n");
    	}
    	
    	//else
    		//txtResult.setText("Caratteri inseriti non validi!\n");
   
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    
}
