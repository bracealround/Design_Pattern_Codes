/*
    According to the interface segregation principle,Clients should not be forced to depend upon interfaces that they do not use.
*/
public class Main {
    /*
     Here in the efficient version of the code,the Cricker interface is divided in four different
     interfaces so that each class Batsman,Bowler,Allrounder and Wicketkepper
     should not have to implement unwanted interfaces.The common methods are implemented in the Cricketer method and
     subsequent methods are implemented accordingly in Batsman,Bowler,Allrounder and WicketKepper.
    */
    public static void main(String[] args) {
        Batsman batsman=new Batsman();
        Bowler bowler=new Bowler();
        Allrounder allrounder=new Allrounder();
        WickerKeeper wickerKeeper=new WickerKeeper();
        System.out.println("Stats of a Batsman");
        System.out.println("Batting Position " + batsman.battingpossition());
        System.out.println("Cumulative Runs: " + batsman.cumulativerun());
        System.out.println("Batting Strike Rate: " + batsman.battingstrikerate());
        System.out.println("Batting Average: " + batsman.battingaverage());
        System.out.println("Batting Hand: " + batsman.battinghand());

        System.out.println("Stats of a Bowler");
        System.out.println("Bowling Average: " + bowler.blowingaverage());
        System.out.println("Bowling Hand: " + bowler.bowlinghand());
        System.out.println("Bollowing Strikerate: " + bowler.bowlingstrikerate());
        System.out.println("Bollowing Type: " + bowler.typeofbolwer());
        System.out.println("Bollowing Economy  Rate: " + bowler.economyrate());

        System.out.println("Stats of a Kepper");
        System.out.println("No. of Stumping:: " + wickerKeeper.number_of_stumping());
        System.out.println("Wicketkepping Skill: " + wickerKeeper.wicketkippingskill());




    }
}
