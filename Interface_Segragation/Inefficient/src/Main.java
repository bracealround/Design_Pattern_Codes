/*
    According to the interface segregation principle,Clients should not be forced to depend upon interfaces that they do not use.
*/
class Main {

    /*
        Here all methods are in the template interface Cricketer.So,in case of batsman,bowler,allrounder and wicketkeeper
        all methods should be implemented and the unnecessary ones should be handled customly.This creats a lot of unnecessary codes.
     */
    public static void main(String[] args) {
        Batsman batsman=new Batsman();
        Bowler bowler=new Bowler();
        All_Rounder all_rounder=new All_Rounder();
        Wicket_Kepper kepper=new Wicket_Kepper();

        
        System.out.println("Stats Of A All Rounder:");
        System.out.println("Catches: " + all_rounder.catches());
        System.out.println("Fitness Level: " + all_rounder.fitnesslevel());
        System.out.println("Alrounder: " + all_rounder.is_alrounder());
        System.out.println("Batting Position " + all_rounder.battingpossition());
        System.out.println("Cumulative Runs: " + all_rounder.cumulativerun());
        System.out.println("Batting Strike Rate: " + all_rounder.battingstrikerate());
        System.out.println("Batting Average: " + all_rounder.battingaverage());
        System.out.println("Batting Hand: " + all_rounder.battinghand());
        System.out.println("Bowling Average: " + all_rounder.blowingaverage());
        System.out.println("Bowling Hand: " + all_rounder.bowlinghand());
        System.out.println("Bollowing Strikerate: " + all_rounder.bowlingstrikerate());
        System.out.println("Bollowing Type: " + all_rounder.typeofbolwer());
        System.out.println("Bollowing Economy  Rate: " + all_rounder.economyrate());
        System.out.println("No. of Stumping:: " + all_rounder.number_of_stumping());
        System.out.println("Wicketkepping Skill: " + all_rounder.wicketkippingskill());


    }
}