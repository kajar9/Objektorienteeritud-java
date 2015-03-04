/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author Kajar
 */
public class BankClientGateway {
    private static ArrayList<Person> persons = new ArrayList<>();

	public Optional<Person> getPerson(int idCode) {
            for(int i=0;i<persons.size();i++){
                if(persons.get(i).getId()==idCode){
                    return Optional.of(persons.get(i));
                }
            }
            
            Person p = new Person(idCode);
            persons.add(p);
            return Optional.of(p);
	}
        
        public ArrayList<Person> getPersons(){
            return persons;
        }
}
