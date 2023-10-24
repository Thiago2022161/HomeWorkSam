/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homeworksam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiagogoncos
 */
public class HomeWorkSam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String dataFile = "MOCK_DATA.csv";
        
        // Create a list to store the data
        List<Person> peopleData = new ArrayList<>();
        
        try {
            // Open the file for reading
            BufferedReader reader = new BufferedReader (new FileReader(dataFile));
            String line;
            
            // Loop to read the lines from the file
            while ((line = reader.readLine()) != null) {
            // Process the line, which contains the data about a person
            String[] fields = line.split(",");
            
            // Now, you can access the fields individually
            String id = fields[0];
            String firstName = fields[1];
            String lastName = fields[2];
            String email = fields[3];
            
            // Create a Person object and add it to the list
            Person person = new Person(id, firstName, lastName, email);
            peopleData.add(person);
        }
            // Close the reader
            reader.close();
            
            // Create 20 teams with 5 members each
            List<homeworksam.Team> teams = TeamGenerator.generateTeams(peopleData, 20, 5);
            
            // Display the teams
            for (int i = 0; i <teams.size(); i++) {
                System.out.println("Team" + (i + 1));
                for (Person member : teams.get(i).getMembers()) {
                    System.out.println(member.getFirstName() + " " + member.getLastName());
                }
                System.out.println();
            }
            
        } catch (Exception e) {
            System.out.println("Error readind the file" + e.getMessage());
        }
    }
    
    // Define a Person class to represent an individual (as mentioned previously)
    static class Team {
        private List<Person> members = new ArrayList<>();
        
        public List<Person> getMembers() {
            return members;
        }
        
        public void addMember(Person person) {
            members.add(person);
        }
    }
    
}
