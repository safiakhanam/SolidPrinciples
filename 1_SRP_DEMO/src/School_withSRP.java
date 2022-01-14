class StudentInfo {
    public String firstName = "omer";
    private String lastName;
    private int age;
}

class FeeCalculator{
    StudentInfo student;

    FeeCalculator(StudentInfo s){
        this.student = s;
    }

    public long calculateFee(){
        long fee = 20000;
        System.out.println("Fee of " + this.student.firstName + " = Rs. " + fee);
        return 2000;
    }
}

class AttendanceCalculator{
    StudentInfo student;

    AttendanceCalculator(StudentInfo s){
        this.student = s;
    }

    public String reportAttendance(){
        String attendance = "90%";
        System.out.println("Attendance of " + this.student.firstName + " = "+ attendance);
        return attendance;
    }
}

public class School_withSRP {
    public static void main(String[] args) {

        System.out.println("\nDemo following the SRP Rule");

        StudentInfo studentInfoObj = new StudentInfo();

        FeeCalculator feeCalculatorObj = new FeeCalculator(studentInfoObj);
        AttendanceCalculator attendanceCalculatorObj = new AttendanceCalculator(studentInfoObj);

        feeCalculatorObj.calculateFee();
        attendanceCalculatorObj.reportAttendance();

    }
}