package transport;

public enum loadType {
    N1(0,3.5),
    N2(3.6,12),
    N3(12.1,30);

    private final double from;
    private final   double to;

    loadType(double from, double to) {
        this.from = from;
        this.to = to;
    }

    public double getFrom() {
        return from;
    }

    public double getTo() {
        return to;
    }
}
