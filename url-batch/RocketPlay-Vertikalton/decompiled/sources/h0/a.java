package h0;

import c1.AbstractC0104b;
import i1.f;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3011b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3012c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3013e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3014f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3015g;

    public a(String str, String str2, boolean z2, int i, String str3, int i2) {
        this.f3010a = str;
        this.f3011b = str2;
        this.f3012c = z2;
        this.d = i;
        this.f3013e = str3;
        this.f3014f = i2;
        Locale locale = Locale.US;
        f.d(locale, "US");
        String upperCase = str2.toUpperCase(locale);
        f.d(upperCase, "this as java.lang.String).toUpperCase(locale)");
        this.f3015g = p1.d.L(upperCase, "INT") ? 3 : (p1.d.L(upperCase, "CHAR") || p1.d.L(upperCase, "CLOB") || p1.d.L(upperCase, "TEXT")) ? 2 : p1.d.L(upperCase, "BLOB") ? 5 : (p1.d.L(upperCase, "REAL") || p1.d.L(upperCase, "FLOA") || p1.d.L(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.d != aVar.d) {
            return false;
        }
        if (!this.f3010a.equals(aVar.f3010a) || this.f3012c != aVar.f3012c) {
            return false;
        }
        int i = aVar.f3014f;
        String str = aVar.f3013e;
        String str2 = this.f3013e;
        int i2 = this.f3014f;
        if (i2 == 1 && i == 2 && str2 != null && !AbstractC0104b.j(str2, str)) {
            return false;
        }
        if (i2 != 2 || i != 1 || str == null || AbstractC0104b.j(str, str2)) {
            return (i2 == 0 || i2 != i || (str2 == null ? str == null : AbstractC0104b.j(str2, str))) && this.f3015g == aVar.f3015g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f3010a.hashCode() * 31) + this.f3015g) * 31) + (this.f3012c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.f3010a);
        sb.append("', type='");
        sb.append(this.f3011b);
        sb.append("', affinity='");
        sb.append(this.f3015g);
        sb.append("', notNull=");
        sb.append(this.f3012c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.f3013e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }
}
