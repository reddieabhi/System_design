package Creational.Builder;

public class Student {
    private final String name;
    private final int rollNo;
    private final String email;
    private final String phone;

    private Student(Builder builder) {
        this.name = builder.name;
        this.rollNo = builder.rollNo;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class Builder {  // builder subclass
        private String name;
        private int rollNo;
        private String email;
        private String phone;

        public Builder(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    @Override
    public String toString() {
        return name + ", " + rollNo + ", " + email + ", " + phone;
    }
}

// all methods of builder should have return type Builder so that we can do .set() while setting
