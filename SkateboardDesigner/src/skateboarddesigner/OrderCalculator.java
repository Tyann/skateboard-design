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

import java.awt.*;

import java.awt.event.*;

import java.text.DecimalFormat;



/**

    The OrderCalculatorGUI class creates the GUI for the

     Bagel House application.

*/

 

public class OrderCalculator extends JFrame

{

    private final int WINDOW_WIDTH = 400;               // window width

    private final int WINDOW_HEIGHT = 200;              // window height

    private Decks decks;                                // Deck panel

    private assemblies assemblies;                 // Assemblies panel

    private wheels wheels;                         // Wheels panel

    private miscellaneous miscellaneous;           // To display a greeting

    private JPanel buttonPanel = new JPanel();      // To hold the buttons

    private JButton calcButton;                         // To calculate the cost

    private JButton exitButton;                         // To exit the application

    private final double TAX_RATE = 0.06;               // Sales tax rate

 

    public OrderCalculator()

    {

        // Display a title.

        setTitle("Skateboard Designer");

        // Specify an action for the close button.

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set size of the window

        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // add gridlayout manager.

        setLayout(new GridLayout(3, 4));

        // Create the custom panels.

        miscellaneous = new miscellaneous();

        decks = new Decks();

        assemblies = new assemblies();

        wheels = new wheels();

        // Create the button panel.

        buildButtonPanel();

        // Add the components to the content pane.

        add(decks);

        add(assemblies);

        add(wheels);

        add(miscellaneous);

        add(buttonPanel);

        // Pack the contents of the window and display it.

        pack();

        setVisible(true);

    }

 

/**

    The buildButtonPanel method builds the button panel.

*/

 

private void buildButtonPanel()

{

    // Create a panel for the buttons.

    calcButton = new JButton("Calculate");

    exitButton = new JButton("Exit");
 

    // Register the action listeners.

    calcButton.addActionListener(new CalcButtonListener());

    exitButton.addActionListener(new ExitButtonListener());

    // Add the buttons to the button panel.

    buttonPanel.add(calcButton);

    buttonPanel.add(exitButton);

}

    /**

        Private inner class that handles the event when

        the user clicks the Exit button.

    */
    private class CalcButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // declare variables to hold the subtotal, tax, and total
            double subtotal, tax, total;
            double selectedDecks = 0;
            double selectedassemblies = 0;
            double selectedmiscellaneous = 0;
            double selectedwheels = 0;
            //calculate the subtotal
            subtotal = selectedDecks + selectedassemblies +
            selectedwheels + selectedmiscellaneous;
            // calculator the sales tax.
            tax = subtotal * TAX_RATE;
            //caculate the total
            total = subtotal + tax;
            //create a decimal format object to format output
            DecimalFormat dollar = new DecimalFormat("0.00");
            //display the charges
            JOptionPane.showMessageDialog(null, "subtotal: $" +
                                          dollar.format(subtotal) + "\n" +
                                          "Tax: $" + dollar.format(tax) + "\n" +
                                          "Total: $" + dollar.format(total));
        }
    }
 

    private class ExitButtonListener implements ActionListener
   {

        public void actionPerformed(ActionEvent e)

        {

            System.exit(0);

        }

    }
}
