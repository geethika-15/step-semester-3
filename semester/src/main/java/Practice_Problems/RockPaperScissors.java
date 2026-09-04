package Practice_Problems;

public class RockPaperScissors {
    static String playRound(String playerMove,String computerMove) {
        if(playerMove.equals(computerMove))
            return "Draw";
        if(playerMove.equals("Rock")&&computerMove.equals("Scissors")||
                playerMove.equals("Paper")&&computerMove.equals("Rock")||
                playerMove.equals("Scissors")&&computerMove.equals("Paper"))
            return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        String[] moves={"Rock","Paper","Scissors"};
        String[] player=new String[5];
        String[] computer=new String[5];
        String[] result=new String[5];
        int wins=0,losses=0,draws=0;

        for(int i=0;i<5;i++) {
            System.out.print("Enter your move: ");
            player[i]=sc.next();
            computer[i]=moves[r.nextInt(3)];
            result[i]=playRound(player[i],computer[i]);

            System.out.println("Computer: "+computer[i]);
            System.out.println("Result: "+result[i]);

            if(result[i].equals("Player Wins"))
                wins++;
            else if(result[i].equals("Computer Wins"))
                losses++;
            else
                draws++;
        }

        System.out.println("\nFinal Summary");
        System.out.printf("%-8s %-15s %-18s %-15s%n","Round","Player Move","Computer Move","Result");

        for(int i=0;i<5;i++)
            System.out.printf("%-8d %-15s %-18s %-15s%n",i+1,player[i],computer[i],result[i]);

        System.out.println("Wins: "+wins);
        System.out.println("Losses: "+losses);
        System.out.println("Draws: "+draws);
        System.out.printf("Win Percentage: %.1f%%%n",(wins/5.0)*100);

        sc.close();
    }
}


