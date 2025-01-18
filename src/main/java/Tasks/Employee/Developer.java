package Tasks.Employee;

public class Developer extends Employee {

    private String programmingLanguage ;


    public Developer(String programmingLanguage,int salary, String name ){

        super(name,salary);
        this.programmingLanguage = programmingLanguage;

    }

    public String getProgrammingLanguage(){
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage){

        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Programing Language : " + programmingLanguage );
    }

}
