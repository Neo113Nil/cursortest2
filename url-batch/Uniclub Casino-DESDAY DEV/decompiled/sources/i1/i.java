package i1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f2437j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f2438k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f2439l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f2440m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f2441a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2442b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2443c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2444e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2445f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f2446g;
    public final boolean h;
    public final boolean i;

    public i(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f2441a = str;
        this.f2442b = str2;
        this.f2443c = j2;
        this.d = str3;
        this.f2444e = str4;
        this.f2445f = z2;
        this.f2446g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (X0.d.a(iVar.f2441a, this.f2441a) && X0.d.a(iVar.f2442b, this.f2442b) && iVar.f2443c == this.f2443c && X0.d.a(iVar.d, this.d) && X0.d.a(iVar.f2444e, this.f2444e) && iVar.f2445f == this.f2445f && iVar.f2446g == this.f2446g && iVar.h == this.h && iVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f2446g) + ((Boolean.hashCode(this.f2445f) + ((this.f2444e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f2443c) + ((this.f2442b.hashCode() + ((this.f2441a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2441a);
        sb.append('=');
        sb.append(this.f2442b);
        if (this.h) {
            long j2 = this.f2443c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) n1.c.f3292a.get()).format(new Date(j2));
                X0.d.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f2444e);
        if (this.f2445f) {
            sb.append("; secure");
        }
        if (this.f2446g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        X0.d.d(sb2, "toString()");
        return sb2;
    }
}
