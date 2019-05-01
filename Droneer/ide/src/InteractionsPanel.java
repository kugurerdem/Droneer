package src;

import java.awt.*;
import javax.swing.*;

/**
 * Interaction Panel that shows given information
 * @author Z�beyir Bodur
 * @version 1.5.2019
 */
public class InteractionsPanel extends JPanel
{
   private JTextArea information;
   
   /**
    * Creates an uneditable InteractionsPanel containing given info
    * , with size 800 to 313, with font 18 monospaced.
    * @param info initial info about compiler, e.g. Compiler JDK 8.0_191 ready.
    */
   public InteractionsPanel( String info)
   {
      setPreferredSize( new Dimension(800, 313) );
      information = new JTextArea(info, 12, 70);
      information.setEditable(false);
      JScrollPane infoPane = new JScrollPane(information);
      add(infoPane);
      information.setFont( new Font( Font.MONOSPACED, Font.PLAIN, 18 ));
   }
   
   /**
    * Updates the current info in the panel
    * @param info to be replaced
    */
   public void update( String info)
   {
      information.setText(info);
   }
}