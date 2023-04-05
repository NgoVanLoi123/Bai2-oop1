public class Doctor extends Person {
    private String specialty;
    private double hours;

    public Doctor(String name, int age, String address,String specialty, double hours) {
        super(name, age, address);
        this.specialty=specialty;
        this.hours=hours;
    }
    public String toString(){
        return super.toString()+"\t "+"specialty:"+specialty+"\t"+"hours:"+hours;
    }
}

