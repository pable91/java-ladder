package ladder.domain.ladder;

import java.util.Random;

import static ladder.domain.RandomGenerator.generate;

public class Direction {

    private final boolean left;
    private final boolean right;

    public Direction(boolean left, boolean right) {
        if (left && right) {
            throw new IllegalStateException();
        }

        this.left = left;
        this.right = right;
    }

    public Direction next() {
        if(right) {
            return new Direction(right, false);
        }
        return new Direction(right, generate());
    }

    public Direction last() {
        return new Direction(this.right, false);
    }


    public boolean isLeft() {
        return this.left;
    }

    public boolean isRight() {
        return this.right;
    }
}
