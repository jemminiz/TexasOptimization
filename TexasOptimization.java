import java.util.Scanner;

public class TexasOptimization
{
    public static double Savagery(String famMem, int currSav)
    {
        if(famMem.equals("sissy") || famMem.equals("hitchhiker")) // Sissy and Hitchhiker have the same base damage, 
                                                                                    // at 16, same as cook but with worse scaling
            return 16 + (8.0/25 * currSav - 8);
        else if(famMem.equals("johnny"))
            return 18 + (8.0/25 * currSav - 8);
        else if(famMem.equals("leatherface")) // Johnny and Leatherface have slightly different base damages, meaning different
                                                       // methods for each
            return 20 + (2.0/5 * currSav - 10);
        else if(famMem.equals("cook")) // Cook has the same base damage as Sissy and Hitchhiker, but has a better scaling,
                                                // using Leatherface's equation instead of the default one
            return 16 + (2.0/5 * currSav - 10);

        return 1;
    }
    public static double VialSize(int currGath)
    {
        return 1.6 * currGath + 60;
    }
    public static double GatheringHit(int currGath)
    {
        return 1.0/5 * currGath + 5;
    }
    public static double GatheringExec(int currGath)
    {
        return 1.1 * currGath + 60;
    }
    public static double GatheringBucket(int currGath)
    {
        return 2.0/5 * currGath + 10;
    }
    public static double GatheringEncounter(int currGath)
    {
        return 2.0/5 * currGath + 30;
    }
    public static double HowManyHits(String famMem, int currSav, int toughness)
    {
        return (toughness * 1.11 + 83.25) / Savagery(famMem, currSav);
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        final int MIN_TOUGHNESS = 15;
        System.out.print("Input family member: ");
        String famMem = scan.nextLine();
        famMem = famMem.toLowerCase();
        while(!famMem.equals("leatherface") && !famMem.equals("cook") && !famMem.equals("johnny") && !famMem.equals("hitchhiker") && !famMem.equals("sissy"))
        {
            System.out.print("Invalid Character! Try again: ");
            famMem = scan.nextLine();
            famMem = famMem.toLowerCase();
        }
        System.out.print("Input current Savagery: ");
        int currSav = scan.nextInt();
        System.out.print("Input current Blood Gathering: ");
        int currGath = scan.nextInt();
        scan.close();

        if(famMem.equals("Leatherface"))
        {
            System.out.print("If you're playing Leatherface, it is always optimal to run 50 Savagery simply because of his one-");
            System.out.println("shot potential, but I'll still show you your base damage");
        }
        
        System.out.println("Current damage: " + Savagery(famMem, currSav));
        System.out.println("Current blood vial size: " + VialSize(currGath));
        System.out.println("Current gathering from hit: " + GatheringHit(currGath));
        System.out.println("Current gathering from executions: " + GatheringExec(currGath));
        System.out.println("Current gathering from buckets: " + GatheringBucket(currGath));
        System.out.println("Current gathering from close encounters: " + GatheringEncounter(currGath));

        for(int i = 50; i >= MIN_TOUGHNESS; i-= 5)
        {
            System.out.println("How many hits it takes to kill someone with " + i + " toughness: " + (int) (HowManyHits(famMem, currSav, i) + 0.99999));
        }
    }
}