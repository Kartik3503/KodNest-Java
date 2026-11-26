public class grade_student {
    public static void main(String[] args) {
        int marks = 85;
        String grade = (marks >= 90) ? "Garde A" : (marks >= 75) ? " Grade B" : "Grade C";
        System.out.println(grade);
    }
}
