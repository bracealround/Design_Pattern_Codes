import javax.management.ObjectName;
import java.util.Random;
/*
    FootballManagerActivity class too much responsibility
    to itself and for some minor change,we have to modify the class itself everytime.
 */
public class FootballManagerActivity {
    int player_salary,player_bonus;
    Object pointstable;
    //Two responsibility of getting training and match schedule from the same method.
    Object get_training_and_match_schedule()
    {
        /*
          Training and match schedule set;
         */
        Random random=new Random();
        return random;

    }

    //Two responsibility of getting buying player list  and loaning player list  from the same method.
    String getbuy_player_and_loan_player_list()
    {
        String str =new String();
        return str;
    }

    //Two responsibility of getting sold player list  and loaned player list  from the same method.
    String getsell_player_and_loaned_player_list()
    {
        String str =new String();
        return str;
    }

    //Four responsibility of calculating salary, bonus of the player and retrieving them from the same method.
    Integer calculate_player_salary_and_bonus(int match,int goal,int base)
    {
        int salary_and_bonus=0;
        /*
            calculate salary and bonus;
         */

        return salary_and_bonus;
    }

    //Two responsibility of board meeting schedule and feedback from the same method.
    Object getBoardMeetingSchedule_and_feedback()
    {
        Object obj=new Object();
        /*

         */
        return obj;
    }

    String get_pointstable()
    {
        String str=new String();
        /*
            modify pointstable and send it;
         */

        return str;
    }

    //Two responsibility of calculating and getting player skills from the same method.
    String calculate_and_getplayerskills(int basic,int improve)
    {
        int skill=0;
        String str=new String();
        /*
        calculate player skill and format it;
         */
        return str;
    }
}
