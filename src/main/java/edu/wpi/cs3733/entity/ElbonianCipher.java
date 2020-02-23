package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {

	private String textOut;

	public void setText(String text) {

		final int LOWERCASE_SHIFT = 96;
		final int UPPERCASE_SHIFT = 64;


		char[] letters = text.toCharArray();
		String encodedChar = "";
		String encodedText = "";

		for (char character : letters) {
			if (character <= 'z' && character >= 'a') {//lowercase letters
				encodedChar = Integer.toString((int)character - LOWERCASE_SHIFT);
				if(encodedChar.length()==1){
					encodedChar= "0" + encodedChar;
				}
			} else if (character <= 'Z' && character >= 'A') {//uppercase letters
				encodedChar = Integer.toString((int)character - UPPERCASE_SHIFT);
				if(encodedChar.length()==1){
					encodedChar= "0" + encodedChar;
				}
			} else if(character == ' '){//Space to S
				encodedChar = "S";
			}else{//non-character char
				encodedChar = "" + character;
			}

			encodedText += encodedChar;
		}
		this.textOut = encodedText;
	}


	public String getText(){
		return textOut;
	}

	@Override
	public void notify(Object object){
		this.setText(((Message)object).getText());
	}
}
