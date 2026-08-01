package G;

import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f208b = new f(new g(e.a(new Locale[0])));

    /* renamed from: a, reason: collision with root package name */
    public final g f209a;

    public f(g gVar) {
        this.f209a = gVar;
    }

    public static f a(String str) {
        if (str == null || str.isEmpty()) {
            return f208b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = d.a(split[i]);
        }
        return new f(new g(e.a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f209a.equals(((f) obj).f209a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f209a.f210a.hashCode();
    }

    public final String toString() {
        return this.f209a.f210a.toString();
    }
}
