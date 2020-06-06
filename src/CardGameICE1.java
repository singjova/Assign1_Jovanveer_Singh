/*
 * Jovanveer Singh
 * id-991587102
 */
package cardgameice1;

/**
 *
 * @author srinivsi
 print 7 cards (values,suits) and takes input 
 then prints if matching card is found in an array
 */
import java.util.Scanner;
public class CardGameICE1
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        // code to generate 7 random cards and store in array
        Card[] magicHand = new Card[7];//array of object
        int value;
     String suit;
        for (int i=0;i<magicHand.length;i++)
        {
           Card c= new Card(1,"jo");//object
          c.setValue((int)(Math.random()*13)+1);
          c.setSuits((int)(4*Math.random()));
           magicHand[i]=c;//saving object in array
         System.out.println(c.getSuits()+""+c.getValue());
        }
    
     System.out.println("Please enter suit?");
     suit = input.nextLine();
     System.out.println("Please enter a value?");
     value = input.nextInt();
     boolean flag = false;
     for(int i = 0; i< magicHand.length; i++){
      if(value==magicHand[i].getValue()&&suit.equals(magicHand[i].getSuits())){
       System.out.println("Your card is in the array");
       flag = true;
      }
         }
         if(flag ==false)
         System.out.println("Sorry your card is not in the Array?");
    }
    
}
