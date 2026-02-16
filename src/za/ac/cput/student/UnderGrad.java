package za.ac.cput.student;

import java.util.StringJoiner;

public class UnderGrad extends Student {

    private final int creditHours;
    private final double scholarshipAmount;

    private UnderGrad(Builder builder){
        super(builder);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }
    @Override
    public String getStudentType(){
        return "Undergraduate";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Undergraduate Student");
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship Amount: " + scholarshipAmount);
    }
    public static class Builder extends Student.Builder{
        private int creditHours;
        private double scholarshipAmount;

        public Builder(String studentId, String name){
           super(studentId, name);
        }
        public Builder creditHours(int creditHours){
            this.creditHours = creditHours;
            return this;
        }
        public Builder scholarshipAmount(double scholarshipAmount){
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }
        @Override
        public UnderGrad build(){
            return new UnderGrad(this);
        }
    }
}
