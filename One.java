import java.util.*;
class One{
	public static void main(String[] args) {
		List<Person> p=new ArrayList<>();
		p.add(new Person("Aman",26));
		p.add(new Person("Raza",66));
		p.add(new Person("Naina",36));
		p.add(new Person("Meeta",20));

		//sort by natural
		Collections.sort(p);
		System.out.println("Sorted by age:");
        for (Person x : p) {
            System.out.println(x.getName() + " " + x.getAge());
        }
        //sort by comprator
         Comparator<Person> nameComp = Comparator.comparing(Person::getName);
        Collections.sort(p, nameComp);
       //sort by name
        System.out.println("Name Comprator");
        for (Person x : p) {
            System.out.println(x.getName() + " - " + x.getAge());
        }
		
	}
}
class Person implements Comparable<Person>{

	 private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
}
