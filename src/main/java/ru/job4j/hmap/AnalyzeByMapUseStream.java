package ru.job4j.hmap;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzeByMapUseStream {
    public static double averageScore(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .mapToInt(Subject::score)
                .average()
                .orElse(0.0);
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> {
                    double averageScore = pupil.subjects().stream()
                            .mapToInt(Subject::score)
                            .average()
                            .orElse(0.0);
                    return new Label(pupil.name(), averageScore);
                })
                .collect(Collectors.toList());
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.averagingDouble(Subject::score)))
                .entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }

    public static Label bestStudent(List<Pupil> pupils) {
        return pupils.stream()
                .map(pupil -> {
                    double averageScore = pupil.subjects().stream()
                            .mapToInt(Subject::score)
                            .sum();
                    return new Label(pupil.name(), averageScore);
                })
                .max(Comparator.comparingDouble(Label::score))
                .orElse(new Label("", 0.0));
    }

    public static Label bestSubject(List<Pupil> pupils) {
        return pupils.stream()
                .flatMap(pupil -> pupil.subjects().stream())
                .collect(Collectors.groupingBy(Subject::name, Collectors.summingDouble(Subject::score)))
                .entrySet()
                .stream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(entry -> new Label(entry.getKey(), entry.getValue()))
                .orElse(new Label("", 0.0));
    }
}
