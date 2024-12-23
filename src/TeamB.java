package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TeamB {

    public static void main(String[] args) {
        String filePath = "Textfile.txt"; // ระบุชื่อไฟล์ Input

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String name = "";
            int age = 0;
            String grade = "";

            // อ่านข้อมูลจากไฟล์
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Name")) {
                    name = line.split(":")[1].trim();
                } else if (line.startsWith("Age")) {
                    age = Integer.parseInt(line.split(":")[1].trim());
                } else if (line.startsWith("Software Testing Grade")) {
                    grade = line.split(":")[1].trim();
                }
            }

            // ตรวจสอบข้อมูล
            if (name.isEmpty() || grade.isEmpty() || age <= 0) {
                throw new IllegalArgumentException("Invalid data in the input file.");
            }

            // คำนวณปีพุทธศักราช
            int buddhistEra = calculateBuddhistEra(age);

            // แปลงเกรดเป็นอันดับ
            String rank = getRankFromGrade(grade);

            // แสดงผลบน Console
            System.out.println("Name : " + name);
            System.out.println("Buddhist Era : " + buddhistEra);
            System.out.println("Software Testing Rank : " + rank);

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    /**
     * คำนวณปีพุทธศักราช
     */
    public static int calculateBuddhistEra(int age) {
        return 2024 - age + 543;
    }

    /**
     * แปลงเกรดเป็นอันดับ
     */
    public static String getRankFromGrade(String grade) {
        switch (grade) {
            case "A":
                return "High Distinction";
            case "B+":
            case "B":
                return "Distinction";
            case "C+":
            case "C":
                return "Good";
            case "D+":
            case "D":
                return "Normal";
            case "F":
                return "Failed";
            default:
                return "Unknown";
        }
    }
}
