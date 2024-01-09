package com.app.imdb.model;

public enum Score {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5);

    private final int value;

    Score(Integer value) {
        this.value = value;
    }

    private Integer getValue(){
        return value;
    }
}
