package za.ac.cput.main;

import za.ac.cput.student.GraduateStudent;
import za.ac.cput.student.Student;
import za.ac.cput.student.UnderGrad;

public class Main {
    public static void main(String[] args) {

        Student undergrad = new UnderGrad.Builder("TICT", "Olwethu")
                .email("olwethu@cput.ac.za");
                .department("IT");
                .creditHours(120);
                .scholarship(30000);
                .build();
        Student graduate = new GraduateStudent.Builder("GICT", "Maia")
                .email("maia@cput.ac.za")
                .department("Multimedia")
                .researchAssistant(true)
                .stipend(9000)
                .build();

        UnderGrad.displayStudentDetails();
        System.out.println("--");
        GraduateStudent.displayStudentDetails();
    }
}


}
