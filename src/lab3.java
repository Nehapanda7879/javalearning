//public class Student1 {
//
//    private String name;
//    private int rollno;
//    private int[] marks;
//
//    public Student1(String name, int rollno, int[] marks) {
//        this.name = name;
//        this.rollno = rollno;
//        this.marks = marks;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getRollno() {
//        return rollno;
//    }
//
//    public int[] getMarks() {
//        return marks;
//    }
//
//    public int getTotalMarks() {
//        int totalMarks = 0;
//        for (int mark : marks) {
//            totalMarks += mark;
//        }
//        return totalMarks;
//    }
//
//    public float getPercentage() {
//        float percentage = (float) getTotalMarks() / marks.length * 100;
//        return percentage;
//    }
//
//    public String getGrade() {
//        String grade;
//        if (getPercentage() >= 90) {
//            grade = "A+";
//        } else if (getPercentage() >= 80) {
//            grade = "A";
//        } else if (getPercentage() >= 70) {
//            grade = "B+";
//        } else if (getPercentage() >= 60) {
//            grade = "B";
//        } else if (getPercentage() >= 50) {
//            grade = "C";
//        } else {
//            grade = "E";
//        }
//        return grade;
//    }
//
//    public static void main(String[] args) {
//        if (args.length < 2) {
//            System.out.println("Please provide the student's name and rollno as command-line arguments.");
//            System.exit(1);
//        }
//
//        String name = args[0];
//        int rollno = Integer.parseInt(args[1]);
//        int[] marks = new int[args.length - 2];
//        for (int i = 2; i < args.length; i++) {
//            try {
//                marks[i - 2] = Integer.parseInt(args[i]);
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid mark: " + args[i]);
//                System.exit(1);
//            }
//        }
//
//        Student student = new Student(name, rollno, marks);
//        System.out.println("Student name: " + student.getName());
//        System.out.println("Student rollno: " + student.getRollno());
//        System.out.println("Total marks: " + student.getTotalMarks());
//        System.out.println("Percentage: " + student.getPercentage() + "%");
//        System.out.println("Grade: " + student.getGrade());
//    }
//}
//
//
