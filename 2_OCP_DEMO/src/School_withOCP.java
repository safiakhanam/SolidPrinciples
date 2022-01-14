class StudentInfo {
    public String firstName = "omer";
    private String lastName;
    private int age;
}

class FeeCalculator{
    private StudentInfo student;

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

//Adding New Functionality
class PerformanceCalculator{
    StudentInfo student;

    PerformanceCalculator(StudentInfo s){
        this.student = s;
    }

    public String reportPerformance(){
        String performance = "99%";
        System.out.println("Performance of " + this.student.firstName + " = " + performance);
        return performance;
    }
}

public class School_withOCP {
    public static void main(String[] args) {

        System.out.println("\nDemo following the OCP Rule");

        StudentInfo studentInfoObj = new StudentInfo();

        FeeCalculator feeCalculatorObj = new FeeCalculator(studentInfoObj);
        AttendanceCalculator attendanceCalculatorObj = new AttendanceCalculator(studentInfoObj);

        feeCalculatorObj.calculateFee();
        attendanceCalculatorObj.reportAttendance();

        //Using New Functionality
        PerformanceCalculator performanceCalculatorObj = new PerformanceCalculator(studentInfoObj);

        performanceCalculatorObj.reportPerformance();
    }
}