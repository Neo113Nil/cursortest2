package yads;

/* loaded from: classes6.dex */
public final class ys1 {
    public static long a() {
        Runtime runtime = Runtime.getRuntime();
        return Runtime.getRuntime().maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
    }
}
