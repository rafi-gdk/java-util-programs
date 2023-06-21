package com.sonu.utils.interview;

import com.sonu.utils.streams.collectors.CollectorsTest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Data
@ToString
@AllArgsConstructor
class Student {
    String studentName;
    Integer marks;
    String subject;

}

public class Epam {

    // CODE EXAMPLE VALID FOR COMPILING
    public static void main(String[] args) {

/*    //StudentName:Alok Marks:40 Subject: Math
    StudentName:Samik Marks:30 Subject: English
    StudentName:Samik Marks:20 Subject: English
    StudentName:Alok Marks:35 Subject: English
    StudentName:Jyoti Marks:20 Subject: Math
    StudentName:Jyoti Marks:30 Subject: Math*/

        List<Student> students = Arrays.asList(
                new Student("Alok", 40, "Math"),
                new Student("Samik", 30, "English"),
                new Student("Samik", 20, "English"),
                new Student("Alok", 35, "English"),
                new Student("Jyoti", 20, "Math"),
                new Student("Jyoti", 70, "Math")
        );

        Map<String, Integer> collect = students.stream().collect(Collectors.groupingBy(Student::getStudentName, Collectors.summingInt(Student::getMarks)));

        System.out.println("Epam.main-->"+ collect);

    }
}
