/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworksam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author thiagogoncos
 */
class TeamGenerator {
    
    //This method generates teams from a list of people
    public static List<Team> generateTeams(List<Person> people, int numTeams, int membersPerTeam) {
        List<Team> teams = new ArrayList<>();
        
        //checking if there are enough people to form the desired number of teams
        if (people.size() < numTeams * membersPerTeam) {
            System.out.println("Not enough people to form teams");
            return teams;
        }
            //Shuflle the list of people to randomize the order
            Collections.shuffle(people, new Random(System.currentTimeMillis()));
            
            //Loop through and create teams
            for (int i = 0; i < numTeams; i++) {
                Team team = new Team();
                for (int j = 0; j < membersPerTeam; j++) {
                    Person person = people.get(i* membersPerTeam + j);
                    team.addMember(person);
                }
                teams.add(team);
            }
        return teams;
    }
}
    
