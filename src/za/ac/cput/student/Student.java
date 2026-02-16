package za.ac.cput.student;

public abstract class Student {
    protected String studentId;
    protected String name;
    protected String email;
    protected String department;

    protected Student(Builder builder){
        this.studentId = builder.studentId;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
    }

    public abstract double calculateTuition();

    public abstract String getStudentType();

    public void displayStudentDetails(){

        public abstract static class Builder{
            private final String studentId;
            private final String name;
            private String email;
            private String department;

            public Builder(String studentId, String name){
                this.studentId = studentId;
                this.name = name;
            }
            public Builder email(String email){
                this.email = email;
                return this;
            }
            public Builder department(String department){
                this.department = department;
                return this;
            }
            public abstract Student build();
        }
    }
}
