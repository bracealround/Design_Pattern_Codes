/*
    The single-responsibility principle is a computer-programming principle that states that
    every module, class or function in a computer program should have responsibility
     over a single part of that program's functionality, which it should encapsulate.
 */

/*
    Here the class FootballManagerActivity has too many responsibility and most of the methods implemented in the class have
    multiple responsibility,both of which violates the single responsibility principle.
    Thus this is an inefficient Implementation
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Single Responsibility Principle Not Followed");

        FootballManagerActivity footballManagerActivity=new FootballManagerActivity();

        footballManagerActivity.getBoardMeetingSchedule_and_feedback();
        footballManagerActivity.calculate_and_getplayerskills(100,200);
        footballManagerActivity.get_training_and_match_schedule();
        footballManagerActivity.get_pointstable();
        footballManagerActivity.getbuy_player_and_loan_player_list();
        footballManagerActivity.getsell_player_and_loaned_player_list();

    }
}
