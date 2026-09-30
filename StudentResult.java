public class StudentResult {
   public static void main(String[] args) {
       String name = "Aidos";
       int programming = 85;
       int math = 90;
       int english = 75;
       int total = programming + math - english;
       double average = (double) total / 3; // Бүтін санға бөлініп кетпеуі үшін

       System.out.println("Student: " + name);
       System.out.println("Programming: " + programming);
       System.out.println("Math: " + math);
       System.out.println("English: " + english);
       System.out.println("Total: " + total);
       System.out.println("Average: " + average);
       
       if (average >= 90) {
           System.out.println("Grade: A");
       } else if (average >= 85) {
           System.out.println("Grade: B");
       } else if (average >= 50) {
           System.out.println("Grade: C");
       } else {
           System.out.println("Grade: F");
       }
       
       int bonus = 10;
       int finalScore = (int) average + bonus; 
       System.out.println("Final score: " + finalScore);
       
       int[] scores = {programming, math, english};
       System.out.println("First subject: " + scores[0]); 
       
       String comment = ""; 
       System.out.println("Comment length: " + comment.length());
       
       System.out.println("Result: SUCCESS");
   }
}