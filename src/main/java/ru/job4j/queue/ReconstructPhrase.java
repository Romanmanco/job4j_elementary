package ru.job4j.queue;

import java.util.Deque;

public class ReconstructPhrase {

    private final Deque<Character> descendingElements;

    private final Deque<Character> evenElements;

    public ReconstructPhrase(Deque<Character> descendingElements, Deque<Character> evenElements) {
        this.descendingElements = descendingElements;
        this.evenElements = evenElements;
    }

    private String getEvenElements() {
        StringBuilder evenStringBuilder = new StringBuilder();
        for (int i = 0; !evenElements.isEmpty(); i++) {
            if (i % 2 == 0) {
                evenStringBuilder.append(evenElements.poll());
            } else {
                evenElements.poll();
            }
        }
        return evenStringBuilder.toString();
    }

    private String getDescendingElements() {
        StringBuilder descendingStringBuilder = new StringBuilder();
        while (!descendingElements.isEmpty()) {
            descendingStringBuilder.append(descendingElements.removeLast());
        }
        return descendingStringBuilder.toString();
    }

    public String getReconstructPhrase() {
        return getEvenElements() + getDescendingElements();
    }
}