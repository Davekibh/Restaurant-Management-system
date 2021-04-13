
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class SuperClass {
     public double Burger;
     public double Pizza;
     public double Frankie;
     public double Fries;
     public double Sandwich;
     
     public double MilkShake;
     public double VanillaCone;
     public double ClasVanilla;
     public double VanMilkShake;
     public double ChocMilkShake;
     
     public double Meals;
     public double Drinks;
     public double TotalMD;
     
     public double AllTotalMD;
     
     
     public double GetAmount()
     {
         Meals = Burger + Pizza + Frankie + Fries + Sandwich ;         
         Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake ;         
         TotalMD = Meals + Drinks;        
         AllTotalMD = TotalMD;
         return AllTotalMD ;
     }

     private JFrame frame;

     public void iExitSystem()
     {
         frame = new JFrame("Exit");
         
         if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","",
                 JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION)
         {
             System.exit(0);
         } 
     }
     
     public double pBurger = 30;
     public double pPizza = 60;
     public double pFrankie = 40;
     public double pFries = 20;
     public double pSandwich = 25;
     
     public double pMilkShake = 15;
     public double pVanillaCone = 20;
     public double pClasVanilla = 25;
     public double pVanMilkShake = 30;
     public double pChocMilkShake = 35;
     
     public double mcTax = 0.90f;
     
     public Double cFindTax(double cAmount)
     {
         double FindTax = cAmount - (cAmount * mcTax);
         return FindTax;
     }
}
