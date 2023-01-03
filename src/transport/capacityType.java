package transport;

public enum capacityType {
    ESPECIALLY_SMALL(0,10),
    SMALL(11,25),
    AVERAGE(40,50),
    BIG(60, 80),
    EXTRA_LARG(100,120);
    private final int from;
    private final int to;

    capacityType(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }


    public int getTo() {
        return to;
    }
}
