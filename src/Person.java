public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name =name;
        this.age=age;
        this.address=address;
    }
    @Override
    public String toString(){
        return "name: "+name+"\t"+"age:"+age+"\t"+"address:"+address;
    }
}
