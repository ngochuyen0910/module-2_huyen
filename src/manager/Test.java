package manager;

public class PresonTest {
    public static void main(String[] args) {
        Person []person = new Person[3];
        person[0]= new Person(1,"huyen",12,true);
        person[1]= new Person(2,"huy",17,false);
        person[2]= new Person(3,"an",12,true);
        for(Person person1: person)
        System.out.println(person1);
    }
}
