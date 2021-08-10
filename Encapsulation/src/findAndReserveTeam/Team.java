package findAndReserveTeam;

import person.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        this.name = name;
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public  void  addPlayer(Person person){
        if (person.getAge() < 40){
            this.firstTeam.add(person);
        } else {
            this.reserveTeam.add(person);
        }
    }

    public String getName(){
        return this.name;
    }

    public List<Person> getFirstTeam() {
        //Не позволява да се модифицира листа(add, remove, etc.)
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        //Не позволява да се модифицира листа(add, remove, etc.)
        return Collections.unmodifiableList(this.reserveTeam);
    }
}
