package yads;

/* loaded from: classes4.dex */
public abstract class yi {
    public final int a;

    public yi(int i) {
        this.a = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public String toString() {
        return a(this.a);
    }
}
