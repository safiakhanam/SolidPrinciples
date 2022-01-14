class Student {
    private String firstName = "omer";
    private String lastName;
    private int age;

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
}

public class School_noSRP {
    public static void main(String[] args) {

        System.out.println("\nDemo violating the SRP Rule");

        Student student = new Student();

        student.calculateFee();
        student.reportAttendance();
    }


}