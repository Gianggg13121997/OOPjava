import java.util.Arrays;
import java.util.Scanner;

public class Student {
    public String name;
    public int age;
    public int[] scores;

    public Student(String name, int age, int[] scores) {
        this.name = name;
        this.age = age;
        this.scores = scores;
    }

    public String getInfor() {
        String scoreString = Arrays.toString(scores);
        return "Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Scores: " + scoreString + "\n";
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int average() {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        int average = sum / scores.length;
        return average;
    }


}
