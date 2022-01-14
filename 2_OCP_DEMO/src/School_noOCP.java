class Student {
    private String firstName = "Omer";
    private String lastName = "Baig";
    private int age = 10;

    public long calculateFee(){
        long fee = 20000;
        System.out.println("Fee of " + this.firstName + " = Rs. " + fee);
        return 2000;
    }

    public String reportAttendance(){
        String attendance = "90%";
        System.out.println("Attendance of " + this.firstName + " = "+ attendance);
        return attendance;
    }

    // Adding New Functionality
    public String reportPerformance(){
        String performance = "99%";
        System.out.println("Performance of " + this.firstName + " = "+ performance);
        return performance;
    }
}

public class School_noOCP {
    public static void main(String[] args) {

        System.out.println("\nDemo to demonstrate violation the OCP rule");

        Student student = new Student();

        student.calculateFee();
        student.reportAttendance();

        //Using New Functionality
        student.reportPerformance();
    }
}