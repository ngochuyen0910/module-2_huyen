package ss5_Accesmodifier_staticmethod_staticproperty.thuc_hanh;

public class test {
    public static void main(String[] args) {
        public String name;
         public Person(String name) {
            this.name = name;
        }
    }

    public static void swap(Person first, Person second) {
        String temp = first.name;
        first.name = second.name;
        second.name = temp;
    }

    public static void main(String[] args) {
        Person a = new Person("John");
        Person b = new Person("Bill");
        swap(a, b);
        System.out.println("a.name = " + a.name);
        System.out.println("b.name = " + b.name);

    }
}
}
