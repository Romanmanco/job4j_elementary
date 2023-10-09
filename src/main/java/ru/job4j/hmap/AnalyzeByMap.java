package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0.0;
        int totalCount = 0;

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalCount++;
            }
        }

        return totalCount > 0 ? totalScore / totalCount : 0.0;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();

        for (Pupil pupil : pupils) {
            double sum = 0.0;

            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            double averageScore = pupil.subjects().isEmpty() ? 0.0 : sum / pupil.subjects().size();
            result.add(new Label(pupil.name(), averageScore));
        }

        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> subjectScoreMap = new HashMap<>();
        Map<String, Integer> subjectCountMap = new HashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String subjectName = subject.name();
                double score = subject.score();

                subjectScoreMap.merge(subjectName, score, Double::sum);
                subjectCountMap.merge(subjectName, 1, Integer::sum);
            }
        }

        List<Label> result = new ArrayList<>();
        subjectScoreMap.forEach((subjectName, totalScore) -> {
            int count = subjectCountMap.getOrDefault(subjectName, 0);
            double averageScore = count > 0 ? totalScore / count : 0.0;
            result.add(new Label(subjectName, averageScore));
        });

        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        String bestStudentName = "";
        double maxAverageScore = 0.0;

        for (Pupil pupil : pupils) {
            double sum = 0.0;

            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }

            double averageScore = sum;

            if (averageScore > maxAverageScore) {
                maxAverageScore = averageScore;
                bestStudentName = pupil.name();
            }
        }

        return new Label(bestStudentName, maxAverageScore);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Double> subjectScoreMap = new HashMap<>();

        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String subjectName = subject.name();
                double score = subject.score();

                subjectScoreMap.merge(subjectName, score, Double::sum);
            }
        }

        String bestSubjectName = "";
        double maxTotalScore = 0.0;

        for (Map.Entry<String, Double> entry : subjectScoreMap.entrySet()) {
            String subjectName = entry.getKey();
            double totalScore = entry.getValue();
            if (totalScore > maxTotalScore) {
                maxTotalScore = totalScore;
                bestSubjectName = subjectName;
            }
        }

        return new Label(bestSubjectName, maxTotalScore);
    }
}
