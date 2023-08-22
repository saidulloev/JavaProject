package Collection.treeMap;

import java.util.*;

public class TreeMapRunner {

    public static void main(String[] args) {

        NavigableMap<AverageStudentsGrade, Set<SubjectGrade>> grades = createGrades();
        printGrade(grades.descendingMap(),false);

        AverageStudentsGrade border = grades.ceilingKey(new AverageStudentsGrade("",80));
        NavigableMap<AverageStudentsGrade, Set<SubjectGrade>> scholarshipStudents = (NavigableMap<AverageStudentsGrade, Set<SubjectGrade>>) grades.tailMap(border);


        System.out.println("=========================================");
        System.out.println("Scholarship students");
        printGrade(scholarshipStudents.descendingMap(),false);
        System.out.println("\nContender student: ");
        AverageStudentsGrade contender = grades.lowerKey(border);
        System.out.println(contender);
        System.out.println("\nHighest grade student:");
        System.out.println(grades.lastEntry());
        System.out.println("\nLower grade student:");
        System.out.println(grades.firstEntry());

    }

    public static void printGrade(Map<AverageStudentsGrade, Set<SubjectGrade>> grades, boolean printValue) {
        Set<AverageStudentsGrade> averageStudentsGrades = grades.keySet();
        for (AverageStudentsGrade asg : averageStudentsGrades) {
            System.out.println(asg);
            if (printValue){
                System.out.println(grades.get(asg));
            }
        }
    }

    public static NavigableMap<AverageStudentsGrade, Set<SubjectGrade>> createGrades(){
        Set<SubjectGrade> AlexGrades = new HashSet<>();
        AlexGrades.add(new SubjectGrade("Mathematics",89));
        AlexGrades.add(new SubjectGrade("Physics",65));
        AlexGrades.add(new SubjectGrade("History",95));
        AlexGrades.add(new SubjectGrade("Literature",90));
        AlexGrades.add(new SubjectGrade("Chemistry",75));

        Set<SubjectGrade> JamesGrades = new HashSet<>();
        JamesGrades.add(new SubjectGrade("Mathematics",75));
        JamesGrades.add(new SubjectGrade("Physics",80));
        JamesGrades.add(new SubjectGrade("History",55));
        JamesGrades.add(new SubjectGrade("Literature",70));
        JamesGrades.add(new SubjectGrade("Chemistry",80));

        Set<SubjectGrade> AntonyGrades = new HashSet<>();
        AntonyGrades.add(new SubjectGrade("Mathematics",93));
        AntonyGrades.add(new SubjectGrade("Physics",91));
        AntonyGrades.add(new SubjectGrade("History",82));
        AntonyGrades.add(new SubjectGrade("Literature",78));
        AntonyGrades.add(new SubjectGrade("Chemistry",88));

        Set<SubjectGrade> VictoriaGrades = new HashSet<>();
        VictoriaGrades.add(new SubjectGrade("Mathematics",73));
        VictoriaGrades.add(new SubjectGrade("Physics",65));
        VictoriaGrades.add(new SubjectGrade("History",75));
        VictoriaGrades.add(new SubjectGrade("Literature",66));
        VictoriaGrades.add(new SubjectGrade("Chemistry",50));

        Set<SubjectGrade> RonaldoGrades = new HashSet<>();
        RonaldoGrades.add(new SubjectGrade("Mathematics",81));
        RonaldoGrades.add(new SubjectGrade("Physics",99));
        RonaldoGrades.add(new SubjectGrade("History",99));
        RonaldoGrades.add(new SubjectGrade("Literature",90));
        RonaldoGrades.add(new SubjectGrade("Chemistry",99));

        NavigableMap<AverageStudentsGrade, Set<SubjectGrade>> map = new TreeMap<>();
        map.put(new AverageStudentsGrade("Alex",calcAvgGrades(AlexGrades)),AlexGrades);
        map.put(new AverageStudentsGrade("James",calcAvgGrades(JamesGrades)),JamesGrades);
        map.put(new AverageStudentsGrade("Antony",calcAvgGrades(AntonyGrades)),AntonyGrades);
        map.put(new AverageStudentsGrade("Victoria",calcAvgGrades(VictoriaGrades)),VictoriaGrades);
        map.put(new AverageStudentsGrade("Ronaldo",calcAvgGrades(RonaldoGrades)),RonaldoGrades);

        return map;
    }

    public static float calcAvgGrades(Set<SubjectGrade> grades){
        float sum = 0f;
        for (SubjectGrade sg: grades){
            sum+=sg.getGrade();
        }
        return sum/grades.size();
    }

}
