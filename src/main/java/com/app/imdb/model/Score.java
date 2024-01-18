package com.app.imdb.model;

import lombok.Getter;

@Getter
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
}
