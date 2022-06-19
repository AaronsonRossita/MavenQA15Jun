public class Person {

    String name;
    private String lastname;

    public Person() {
    }

    public void setLastName(String word){
        lastname = word;
    }

    public String getLastName(){
        return lastname;
    }

    public static void printSomething(){
        System.out.println("something");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
