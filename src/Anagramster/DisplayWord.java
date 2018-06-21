/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anagramster;

/**
 *
 * @author chiggie
 */
public class DisplayWord
{
  private final Letter[] word;
  
  public DisplayWord(String origWord)
  {
    word = new Letter[origWord.length()];
    
    for (int i = 0; i < origWord.length(); i++)
    {
      word[i] = new Letter(origWord.charAt(i));
    }
  }
  
  public void setSelected(int index, boolean selected)
  {
    word[index].setSelected(selected);
  }
  
  public void updateColors(String anagram)
  {
    char[] anagChars = anagram.toCharArray();
    
    for (Letter letter : word)
    {
      int pos = searchForIndex(anagChars, letter.getCharacter());
      if (pos >= 0)
      {
        letter.setSelected(true);
        anagChars[pos] = '\0';
      }
      else
      {
        letter.setSelected(false);
      }
    }
  }
  
  private int searchForIndex(char[] arr, char key)
  {
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == key)
      {
        return i;
      }
    }
    
    return -1;
  }
  
  public String getHTML()
  {
    String html = "<html>";
    for (Letter letter : word)
    {
      html += letter.toHTML();
    }
    html += "</html>";
    return html;
  }
}
