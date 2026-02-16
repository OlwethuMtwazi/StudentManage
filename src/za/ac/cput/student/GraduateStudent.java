package za.ac.cput.student;

public class GraduateStudent extends Student{

        private final boolean researchAssistant;
        private final double stipend;

        private GraduateStudent(Builder builder){
            super(builder);
            this.researchAssistant = builder.researchAssistant;
            this.stipend = builder.stipend;
        }
        @Override
        public void displayStudentDetails() {
            System.out.println("Graduate Student");
            System.out.println("Student ID: " + studentId);
            System.out.println("Name: " + name);
            System.out.println("Research Assistant: " + researchAssistant);
            System.out.println("Stipend: " + stipend);
        }
        public static class Builder extends Student.Builder{
            private boolean researchAssistant;
            private double stipend;

            public Builder(String studentId, String name){
                super(studentId, name);
            }
            public researchAssistant(boolean researchAssistant){
                this.researchAssistant = researchAssistant;
                return this;
            }
            public stipend(double stipend){
                this.stipend = stipend;
                return this;
            }
            @Override
            public GraduateStudent build(){
                return new GraduateStudent(this);
            }
        }
    }

}
