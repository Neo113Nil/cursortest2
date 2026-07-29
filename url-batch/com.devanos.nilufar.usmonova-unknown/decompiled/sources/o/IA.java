package o;

import java.util.Locale;

/* loaded from: classes.dex */
public final class IA {
    public static final IA b = new IA(new KA(HA.a(new Locale[0])));
    public final KA a;

    public IA(KA ka) {
        this.a = ka;
    }

    public static IA a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = GA.a(split[i]);
        }
        return new IA(new KA(HA.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IA) {
            return this.a.equals(((IA) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a.toString();
    }
}
