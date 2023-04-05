public class Patient extends Person{
   private String patient;
   private String date;


    public Patient(String name, int age, String address,String patient,String date) {
        super(name, age, address);
        this.patient =patient;
        this.date =date;
    }
    @Override
    public String toString(){
        return super.toString()+"\t"+"patient:"+patient+"\t"+"date:"+date;
    }
}
