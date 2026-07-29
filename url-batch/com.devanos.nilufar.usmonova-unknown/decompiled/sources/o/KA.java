package o;

import android.os.LocaleList;

/* loaded from: classes.dex */
public final class KA {
    public final LocaleList a;

    public KA(LocaleList localeList) {
        this.a = localeList;
    }

    public final boolean equals(Object obj) {
        return this.a.equals(((KA) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
