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
public class Letter
{
  private boolean selected;
  private final char character;

  public Letter(char character)
  {
    this.character = character;
    selected = false;
  }

  public char getCharacter()
  {
    return character;
  }
  
  public String getColor()
  {
    return selected ? "black" : "silver";
  }

  public void setSelected(boolean selected)
  {
    this.selected = selected;
  }
  
  public String toHTML()
  {
    return "<font color='" + getColor() + "'>" + character + "</font>";
  }
  
  @Override
  public String toString()
  {
    return character + " (" + getColor() + ")";
  }
}
