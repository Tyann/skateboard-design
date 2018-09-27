/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package skateboarddesigner;

/**
 *
 * @author YannErv
 */
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
 
/**
    The DeckPanel class allows the user to select either Master trasher, dictator, or street king.
*/
 
public class Decks extends JPanel
{
    // The following constants are used to indicate
    // The different kind of decks
 
    private JPanel deckPanel;
    private JList deckList;
    private JList selectedDeckList;
     
    private String[] decks = {"The Master Trasher" , "The Dictator", "The Street King"};
     
    /**
        Constructor
    */
 
    public Decks()
    {
        // Add a border around the panel.
        setBorder(BorderFactory.createTitledBorder("Decks"));
         
        // Create a GridLayout manager with
        // Two rows and one column
        setLayout(new GridLayout(3, 1));
 
    }
}


