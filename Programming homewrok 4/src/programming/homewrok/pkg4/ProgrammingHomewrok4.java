/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programming.homewrok.pkg4;

/**
 *
 * @author RUKIYE
 */
import java.util.Scanner;
public class ProgrammingHomewrok4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Are you a summer person or a winter person? :");
        String str = scan.nextLine();
        System.out.println(str); 
        
       if(str.equals("summer")||str.equals("Summer")){
        System.out.print("Do you like to take a vacation? :");
        String asw  = scan.nextLine();
        System.out.println(asw);
        if(asw.equals("yes")||asw.equals("Yes")){
            System.out.println("Here is the best summer destinations for 2022:"
                    + "\n\n1-)THE MALDİVES\n There is no bad time to go to the\n"
                    + " Maldives. There is nothing bad about going to the\n"
                    + " Maldives at any time ever. They are perfect little\n"
                    + " islands, whichever you choose – tiny castaway-fantasy\n"
                    + " sandy islets, mostly with one immaculate resort, with\n "
                    + "various levels of splendidness. Even people who think\n"
                    + " they will get bored in the Maldives end up loving\n"
                    + " the Maldives. They're family-friendly, and for\n"
                    + " blissed-out beachy nirvana, they're hard to beat.\n"
                    + " And they're best of all during the British winter,\n"
                    + " and a quite do-able 10 hours away.\n\n\n2-)BERMUDA\n"
                    + "The mid-Atlantic archipelago of Bermuda, mythical\n"
                    + " setting for Shakespeare's Tempest, is a land of pink \n"
                    + "beaches, pink houses and brightly coloured shorts.\n"
                    + " It is Caribbean in nature, though it's much closer to\n"
                    + " the UK – so shorter flight times – and has a\n"
                    + " distinctive character all of its own. Its pink-sand beaches\n"
                    + " are lovely, too. Those along the South Shore are the glory of the island.\n"
                    + " Horseshoe Bay is the best known and most crowded,\n"
                    + " though Warwick Long Bay, a short way along the coast,\n"
                    + " is just as alluring. At one end of Horseshoe there is\n"
                    + " a little patch of sand the size of a playground,\n"
                    + " cut off from the rest of it by a rocky hillock.");
            return;
        }
        else if(asw.equals("no")||asw.equals("No")){
            System.out.println("You should try this house bird.:)");
            return;
        }
        else{
            System.out.println("Incorrect entry made.");
            return;
        }
    }
       else if(str.equals("winter")||str.equals("Winter")){
        System.out.print("Do you like to take a vacation? :");
        String asw  = scan.nextLine();
        System.out.println();
        if(asw.equals("yes")||asw.equals("Yes")){
            System.out.println("Here is the best winter destinations for 2022:"
                    + "\n\n1-)YEDİGÖLLER BOLU\n Yedigöller, which is a great\n"
                    + " place in every season, becomes an even more wonderful\n"
                    + " place once it snows. Moreover, it is also very close\n"
                    + " to Istanbul. This natural wonder with its seven lakes\n"
                    + " is adorned with nature all over the region. It may be\n"
                    + " the nicest place to take a walk in the in the forest\n"
                    + " in the morning, enjoy the freedom and nature...\n\n\n2-)"
                    + "CAPPADOCİA NEVŞEHİR\n Cappadocia is also beautiful\n"
                    + " during all seasons. For this reason, it is a \n"
                    + "great option for the winter for holidays with\n"
                    + " its breathtaking scenery. You can witness the wonderful\n"
                    + " scenery while walking around Ürgüp, Göreme, Avanos and\n"
                    + " take part in a balloon tour and watch this fascinating\n"
                    + " region from the sky. Cappadocia promises you the most\n"
                    + " wonderful tranquility of the winter season.");
            return;
        }
        else if(asw.equals("no")||asw.equals("No")){
            System.out.println("You should try this house bird.:)");
            return;
        }
        else{
            System.out.println("Incorrect entry made.");
            return;
        }
       }
       else{
           System.out.println("Incorrect entry made.");
           return;
       }
    }
    
}
