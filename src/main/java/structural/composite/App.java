package structural.composite;

/**
 * Created by rek on 22.06.17.
 */
public class App {

    public static void main(String[] args) {
        Person me = new Person("Rene");
        Person dieter = new Person("Dieter");
        Person micha = new Person("Micha");
        Person karl = new Person("Karl");
        Person slin = new Person("Slin");
        Person brigitte = new Person("Brigitte");

        me.add(slin);
        me.add(dieter);
        dieter.add(micha);
        micha.add(karl);
        me.add(karl);
        slin.add(brigitte);

        Person.printTree(me);
        Person.printTree(dieter);
        Person.printTree(micha);
        Person.printTree(karl);
        Person.printTree(slin);
        Person.printTree(brigitte);
    }
}
