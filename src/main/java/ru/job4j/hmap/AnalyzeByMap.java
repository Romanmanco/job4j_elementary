package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
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

        double totalScore = 0.0;
        int totalCount = 0;

        for (Map.Entry<String, Double> entry : subjectScoreMap.entrySet()) {
            totalScore += entry.getValue();
        }

        for (Map.Entry<String, Integer> entry : subjectCountMap.entrySet()) {
            totalCount += entry.getValue();
        }

        return totalCount > 0 ? totalScore / totalCount : 0.0;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        Map<String, Double> pupilScoreMap = new HashMap<>();
        Map<String, Integer> pupilCountMap = new HashMap<>();

        for (Pupil pupil : pupils) {
            double sum = 0.0;
            int count = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
                count++;
            }
            double averageScore = count > 0 ? sum / count : 0.0;

            pupilScoreMap.merge(pupil.name(), averageScore, Double::sum);
            pupilCountMap.merge(pupil.name(), 1, Integer::sum);
        }

        List<Label> result = new ArrayList<>();
        pupilScoreMap.forEach((pupilName, totalScore) -> {
            int count = pupilCountMap.getOrDefault(pupilName, 0);
            double averageScore = count > 0 ? totalScore / count : 0.0;
            result.add(new Label(pupilName, averageScore));
        });

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
        Map<String, Double> pupilScoreMap = new HashMap<>();

        for (Pupil pupil : pupils) {
            double sum = 0.0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            double averageScore = sum;

            pupilScoreMap.merge(pupil.name(), averageScore, Double::sum);
        }

        String bestStudentName = "";
        double maxAverageScore = 0.0;

        for (Map.Entry<String, Double> entry : pupilScoreMap.entrySet()) {
            String studentName = entry.getKey();
            double averageScore = entry.getValue();
            if (averageScore > maxAverageScore) {
                maxAverageScore = averageScore;
                bestStudentName = studentName;
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
