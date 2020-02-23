package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {

	Observable message;

	public CaesarCipher() {
	}

	private String text = "";

	public CaesarCipher(String text) {
		this.text = text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {

		final int SHIFT = -5;

		char[] letters = this.text.toCharArray();
		String encodedText = "";

		for (char letter : letters) {

			//Shift value of letters only
			if (letter <= 'z' && letter >= 'a') {//lowercase letters
				letter = (char) (letter + SHIFT);

				//Cycle letters from beginning to end of alphabet, or vice versa.
				if (letter > 'z') {
					letter = (char) (letter - 26);
				} else if (letter < 'a' ) {
					letter = (char) (letter + 26);
				}
			} else if (letter <= 'Z' && letter >= 'A') {//uppercase letters
				letter = (char) (letter + SHIFT);

				//Cycle letters from beginning to end of alphabet, or vice versa.
				if (letter > 'Z') {
					letter = (char) (letter - 26);
				} else if (letter < 'A' ) {
					letter = (char) (letter + 26);
				}
			} else {//non-letter char
				letter = letter;
			}


			encodedText += letter;
		}

			return encodedText;
		}


		@Override
		public void notify (Object object){
			((Message)object).getText();
		}
	}

