
    class Student {
         int marks;

        public Student(int marks) {
            this.marks = marks;
        }

        public void checkMarks() throws ArithmeticException {
            if (marks > 100) {
                throw new ArithmeticException("Marks out of bounds");
            }
        }
    }

     class MarksOutOfBoundsException {
        public static void main(String[] args) {
            Student student = new Student(101);

            try {
                student.checkMarks();
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

