public class Main {
    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        GradingSystem gradingSystem = new GradingSystem();
        LibrarySystem librarySystem = new LibrarySystem();

        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

        System.out.println(attendanceAdapter.integrateSystem());
        System.out.println(gradingAdapter.integrateSystem());
        System.out.println(libraryAdapter.integrateSystem());
    }
}
