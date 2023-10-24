/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworksam;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author thiagogoncos
 */
public class Team {
    
    private List<Person> members = new ArrayList<>();
    
    public List<Person> getMembers() {
        return members;
    }
    
    public void addMember(Person person) {
        members.add(person);
    }
}
