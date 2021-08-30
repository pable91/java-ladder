package ladder.domain;

import java.util.Objects;

public class Width {

    private static final int MINIMUM_IDX = 0;

    private static final int MINIMUM_WIDTH_LENGTH = 1;

    private final int length;

    private Width(int length) {
        this.length = length;
    }

    public static Width create(int length) {
        validate(length);
        return new Width(length);
    }

    public int getLength() {
        return length;
    }

    public boolean outOfRange(int idx) {
        return idx < MINIMUM_IDX || idx > length - 1;
    }

    private static void validate(int length) {
        if (length < MINIMUM_WIDTH_LENGTH) {
            throw new IllegalArgumentException("사다리의 가로길이는 " + MINIMUM_WIDTH_LENGTH + " 이상이어야 합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Width width = (Width) o;
        return length == width.length;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }
}
