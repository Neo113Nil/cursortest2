package yads;

/* loaded from: classes3.dex */
public abstract class oh {
    public static void a(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }
}
