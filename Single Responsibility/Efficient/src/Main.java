/*
    The single-responsibility principle is a computer-programming principle that states that
    every module, class or function in a computer program should have responsibility
     over a single part of that program's functionality, which it should encapsulate.
     Thus each class or method will have one reason to change.
 */

/*
    Here the Inefficient Projects FootBallManager Activity is divided into several class to ensure single responsibility is maintained.
    Also,the method's in that class had multiple responsibility,which is divided in such a way that each method has one and only one
    responsibility.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle Not Followed");

        /*
        All these clases have only two methods to adjust and get a specific
        requirement to ensure single responsibility is maintained.

         */

        BoardMeetingFeedback boardMeetingFeedback=new BoardMeetingFeedback();
        BoardMeetingSchedule boardMeetingSchedule=new BoardMeetingSchedule();
        TrainingSchedule trainingSchedule=new TrainingSchedule();
        MatchSchedule matchSchedule=new MatchSchedule();
        SellPlayerList sellPlayerList=new SellPlayerList();
        BuyPlayerList buyPlayerList=new BuyPlayerList();
        Loanplayerlist loanplayerlist=new Loanplayerlist();
        PointsTable pointsTable=new PointsTable();



    }
}
