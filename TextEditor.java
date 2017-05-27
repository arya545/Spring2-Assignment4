/**
 * 
 */
package com.constructordi;

/**
 * @author SURYA
 *
 */
public class TextEditor {
	
	private SpellChecker spellChecker;

	/**
	 * 
	 */
	public TextEditor(SpellChecker spellChecker) {
		// TODO Auto-generated constructor stub
		System.out.println("Inside TestEditor constructor");
		this.spellChecker = spellChecker ;
				
	}
	
	

	public void spellCheck()
	{
		spellChecker.checkSpelling();
	}
	
	

}
