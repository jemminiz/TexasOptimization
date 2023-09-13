import java.util.Scanner;

public class TexasOptimization
{
    private final int BUBBA_SAVAGERY = 40;
    private final int LOWEST_TOUGHNESS = 15;
    public int Savagery(String famMem, int currSav)
    {
        

        return 1;
    }
    public int GatheringHit(String famMem, int currGath)
    {
        

        return 1;
    }
    public int GatheringExec(String famMem, int currGath)
    {
        

        return 1;
    }
    public int GatheringBucket(String famMem, int currGath)
    {
        

        return 1;
    }
    public int GatheringEncounter(String famMem, int currGath)
    {
        

        return 1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input family member: ");
        String famMem = scan.nextLine();

        if(famMem.equals("Leatherface"))
        {
            System.out.print("If you're playing Leatherface, it is always optimal to run 50 Savagery simply because of his one-");
            System.out.print("shot potential");
        }
        scan.close();
    }
}