public class Student {
    String name;
    int rollNo;
    int maths, science, english, computer, social;
    int total;
    double percentage;
    char grade;

    public void calculateTotal() {
        total = maths + science + english + computer + social;
    }

    public void calculatePercentage() {
        percentage = total / 5.0;
    }

    public void calculateGrade() {
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 80) grade = 'B';
        else if (percentage >= 70) grade = 'C';
        else if (percentage >= 60) grade = 'D';
        else grade = 'F';
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks -> Maths: " + maths + ", Science: " + science +
                ", English: " + english + ", Computer: " + computer +
                ", Social: " + social);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("---------------------------");
    }
}
