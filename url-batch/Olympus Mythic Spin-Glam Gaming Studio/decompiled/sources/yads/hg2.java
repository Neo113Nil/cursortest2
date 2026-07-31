package yads;

/* loaded from: classes6.dex */
public abstract class hg2 {
    public static void a(int i, int i2) {
        String a;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                a = w43.a("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(gg2.a(i2, "negative size: "));
                }
                a = w43.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static void b(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(a(i, i2, "index"));
        }
    }

    public static String a(int i, int i2, String str) {
        if (i < 0) {
            return w43.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return w43.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(gg2.a(i2, "negative size: "));
    }

    public static void a(int i, int i2, int i3) {
        String a;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                a = a(i, i3, "start index");
            } else if (i2 >= 0 && i2 <= i3) {
                a = w43.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                a = a(i2, i3, "end index");
            }
            throw new IndexOutOfBoundsException(a);
        }
    }
}
