package x1;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f4513j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f4514k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f4515l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f4516m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f4517a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4518b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4519c;
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4520e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f4522g;
    public final boolean h;
    public final boolean i;

    public h(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f4517a = str;
        this.f4518b = str2;
        this.f4519c = j2;
        this.d = str3;
        this.f4520e = str4;
        this.f4521f = z2;
        this.f4522g = z3;
        this.h = z4;
        this.i = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (i1.f.a(hVar.f4517a, this.f4517a) && i1.f.a(hVar.f4518b, this.f4518b) && hVar.f4519c == this.f4519c && i1.f.a(hVar.d, this.d) && i1.f.a(hVar.f4520e, this.f4520e) && hVar.f4521f == this.f4521f && hVar.f4522g == this.f4522g && hVar.h == this.h && hVar.i == this.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((Boolean.hashCode(this.h) + ((Boolean.hashCode(this.f4522g) + ((Boolean.hashCode(this.f4521f) + ((this.f4520e.hashCode() + ((this.d.hashCode() + ((Long.hashCode(this.f4519c) + ((this.f4518b.hashCode() + ((this.f4517a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4517a);
        sb.append('=');
        sb.append(this.f4518b);
        if (this.h) {
            long j2 = this.f4519c;
            if (j2 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) C1.d.f252a.get()).format(new Date(j2));
                i1.f.d(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.f4520e);
        if (this.f4521f) {
            sb.append("; secure");
        }
        if (this.f4522g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        i1.f.d(sb2, "toString()");
        return sb2;
    }
}
