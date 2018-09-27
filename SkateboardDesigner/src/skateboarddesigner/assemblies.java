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
 
/**
    The Assemblies class allows the user to select
    the axles for the skateboard
*/
 
public class assemblies extends JPanel
{
    // The following constants are used to indicate
    // The cost of the assemblies.
    public final double AXLE1 = 35.00;
    public final double AXLE2 = 40.00;
    public final double AXLE3 = 45.00;
 

    private JCheckBox axle1;        
    private JCheckBox axle2;        
    private JCheckBox axle3;        
 
    /**
        Constructor
    */
 

    public assemblies()
    {
        // Create a GridLayout manager with

        // four rows and one column.

        setLayout(new GridLayout(3, 1));

 
        // Create the check boxes.

        axle1 = new JCheckBox("7.75 inch axle");

        axle2 = new JCheckBox("8 inch axle");

        axle3 = new JCheckBox("8.5 inch axle");
         

        // Add a border around the panel.

        setBorder(BorderFactory.createTitledBorder("Truck Assemblies"));
 
        // Add the check boxes to the panel.

        add(axle1);

        add(axle2);

        add(axle3);

    }
     
}


