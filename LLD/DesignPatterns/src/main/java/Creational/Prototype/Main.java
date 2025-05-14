package Creational.Prototype;

public class Main {

    public static void main(String args[]) {
        InsuranceForm baseform = new InsuranceForm("Abhi", "full" , 23);
        baseform.setCompanyName("LIC");
        baseform.setDuration(25);

        InsuranceForm user2 = (InsuranceForm) baseform.clone();
        user2.setName("Abhinay");
        user2.setAge(22); // only the changed field



    }
}
