package structural.composite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by rek on 22.06.17.
 */
public class Person {

    private String name;
    private List<Person> friends;

    public Person(String name) {
        this.name = name;
        friends = new ArrayList<>();
    }

    public void add(Person f) {
        friends.add(f);
    }

    public void remove(Person f) {
        friends.remove(f);
    }

    public List<Person> getAll(){
        return Collections.unmodifiableList(friends);
    }

    @Override
    public String toString() {
        return "Friend{" +
            "name='" + name + '\'' +
            '}';
    }

    public static void printTree(Person p){
        System.out.printf("\n%s has Friends: %s", p, p.getAll());
    }
}
