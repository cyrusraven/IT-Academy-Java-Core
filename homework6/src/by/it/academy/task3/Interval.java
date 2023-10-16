package by.it.academy.task3;

public class Interval {
    private final double start;
    private final double end;
    private final boolean startInclusive;
    private final boolean endInclusive;

    public Interval(double start, double end, boolean startInclusive, boolean endInclusive) {
        this.start = start;
        this.end = end;
        this.startInclusive = startInclusive;
        this.endInclusive = endInclusive;
    }

    public boolean hasIntersection(Interval other) {
        if (end < other.start || other.end < start)
            return false;

        if (end == other.start && !(endInclusive && other.startInclusive))
            return false;

        return other.end != start || other.endInclusive && startInclusive;
    }

    public static Interval intersection(Interval[] intervals) {
        if (intervals.length == 0)
            return null;

        double maxStart = intervals[0].start;
        double minEnd = intervals[0].end;
        boolean maxStartInclusive = intervals[0].startInclusive;
        boolean minEndInclusive = intervals[0].endInclusive;

        for (int i = 1; i < intervals.length; i++) {
            if (!intervals[i].hasIntersection(new Interval(maxStart, minEnd, maxStartInclusive, minEndInclusive)))
                return null;

            maxStart = Math.max(maxStart, intervals[i].start);
            minEnd = Math.min(minEnd, intervals[i].end);
            maxStartInclusive = maxStartInclusive || intervals[i].startInclusive;
            minEndInclusive = minEndInclusive || intervals[i].endInclusive;
        }
        return new Interval(maxStart, minEnd, maxStartInclusive, minEndInclusive);
    }

    public static Interval[] mergeIntervals(Interval[] intervals) {
        if (intervals.length <= 1)
            return intervals;

        Interval[] merged = new Interval[intervals.length];
        boolean[] mergedFlags = new boolean[intervals.length];
        int mergedCount = 0;

        for (int i = 0; i < intervals.length; i++) {
            if (!mergedFlags[i]) {
                Interval current = intervals[i];

                for (int j = i + 1; j < intervals.length; j++) {
                    if (!mergedFlags[j] && current.hasIntersection(intervals[j])) {
                        current = new Interval(
                                Math.min(current.start, intervals[j].start),
                                Math.max(current.end, intervals[j].end),
                                current.start == intervals[j].start ? current.startInclusive
                                        : intervals[j].startInclusive,
                                current.end == intervals[j].end ? current.endInclusive : intervals[j].endInclusive
                        );
                        mergedFlags[j] = true;
                    }
                }

                merged[mergedCount++] = current;
            }
        }

        Interval[] result = new Interval[mergedCount];
        System.arraycopy(merged, 0, result, 0, mergedCount);
        return result;
    }

    @Override
    public String toString() {
        String startBracket = startInclusive ? "[" : "(";
        String endBracket = endInclusive ? "]" : ")";
        return startBracket + start + ", " + end + endBracket;
    }
}
