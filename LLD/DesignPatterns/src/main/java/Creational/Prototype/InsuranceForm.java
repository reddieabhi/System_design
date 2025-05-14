package Creational.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceForm implements Prototype{

    // changing fields
    private String name;
    private String policyType;
    private int age;


    // common fields
    private String companyName;
    private int duration;
    // more

    public InsuranceForm(String name, String policyType, int age) {
        this.name = name;
        this.policyType = policyType;
        this.age = age;
    }


    @Override
    public Prototype clone() {
        return new InsuranceForm(name, policyType, age);
    }



}
