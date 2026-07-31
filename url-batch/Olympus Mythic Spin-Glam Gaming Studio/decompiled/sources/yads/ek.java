package yads;

/* loaded from: classes5.dex */
public final class ek extends Exception {
    public ek(long j, long j2) {
        super("Unexpected audio track timestamp discontinuity: expected " + j2 + ", got " + j);
    }
}
