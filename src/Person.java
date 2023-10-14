public class Person {
    private String name;
    private Integer age;

    public Person(){}

    public Person(String namePerson){
        this.name = namePerson;
    }

    public Person(String namePerson, Integer agePerson){
        this.name = namePerson;
        this.age = agePerson;
    }

    public void read(){
        System.out.println();

    }

    public static void study(Integer age){
        System.out.println("Study");
    }


    
}
