package h0;

import java.util.Locale;
import n1.g;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0137a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2585a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2586b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2587c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2588e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2589f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2590g;

    public C0137a(String str, String str2, boolean z2, int i, String str3, int i2) {
        this.f2585a = str;
        this.f2586b = str2;
        this.f2587c = z2;
        this.d = i;
        this.f2588e = str3;
        this.f2589f = i2;
        Locale locale = Locale.US;
        g1.f.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        g1.f.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f2590g = g.s(upperCase, "INT") ? 3 : (g.s(upperCase, "CHAR") || g.s(upperCase, "CLOB") || g.s(upperCase, "TEXT")) ? 2 : g.s(upperCase, "BLOB") ? 5 : (g.s(upperCase, "REAL") || g.s(upperCase, "FLOA") || g.s(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0137a)) {
            return false;
        }
        C0137a c0137a = (C0137a) obj;
        if (this.d != c0137a.d) {
            return false;
        }
        if (!this.f2585a.equals(c0137a.f2585a) || this.f2587c != c0137a.f2587c) {
            return false;
        }
        int i = c0137a.f2589f;
        String str = c0137a.f2588e;
        String str2 = this.f2588e;
        int i2 = this.f2589f;
        if (i2 == 1 && i == 2 && str2 != null && !T.e.t(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || T.e.t(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : T.e.t(str2, str))) && this.f2590g == c0137a.f2590g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f2585a.hashCode() * 31) + this.f2590g) * 31) + (this.f2587c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f2585a);
        sb.append("', type='");
        sb.append(this.f2586b);
        sb.append("', affinity='");
        sb.append(this.f2590g);
        sb.append("', notNull=");
        sb.append(this.f2587c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.f2588e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
