package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-f3f55b5b0d2db012739781e1ba4f8511a2ab0ca5e8856dea8785f50c2c15a0e8 */
/* loaded from: classes.dex */
public final class oq {
    public static final oq b = new oq(new pq(new LocaleList(new Locale[0])));
    public final pq a;

    public oq(pq pqVar) {
        this.a = pqVar;
    }

    public static oq a(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = Locale.forLanguageTag(split[i]);
        }
        return new oq(new pq(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oq) {
            return this.a.equals(((oq) obj).a);
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
