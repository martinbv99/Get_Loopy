import java.util.Random;
public class dieRoller
{
    public static void main(String[] args)
    {
        Random gen = new Random();
        int die1, die2, die3 = 0;
        int dieRoll = 0;
        int dieSum = 0;

        System.out.println("Roll #\tDie1\tDie2\tDie3\tDie Sum");

        do
        {
            die1 = gen.nextInt(6)+1;
            die2 = gen.nextInt(6)+1;
            die3 = gen.nextInt(6)+1;
            dieSum = die1 + die2 + die3;

            dieRoll++;

            System.out.printf("%4d\t%4d\t%4d\t%4d\t%4d\n",dieRoll,die1,die2,die3,dieSum);


        }while(!(die1==die2 && die2==die3));
    }
}
