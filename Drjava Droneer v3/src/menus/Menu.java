package menus;
import java.awt.*;
import javax.swing.*;

/**
 * Abstract class to standardize the menus used in the application
 * @author Ege Kaan G�rkan
 * @version 03/05/2019
 */

public abstract class Menu extends JPanel{

   boolean focused = false;
   
   public Menu() {
      setPreferredSize(new Dimension(700, 700));
   }
   
   abstract void setFocused(boolean foc);
   abstract boolean getFocused();

}